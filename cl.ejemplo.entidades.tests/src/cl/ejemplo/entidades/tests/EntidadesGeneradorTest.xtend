package cl.ejemplo.entidades.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.Assert.assertEquals

@ExtendWith(InjectionExtension)
@InjectWith(EntidadesInjectorProvider)
class EntidadesGeneradorTest {
	
	@Inject extension CompilationTestHelper
	@Test
	def void testGeneratedCode() {
		'''
			entidad String {
						
			}
			
			entidad MiEntidad {
				String miAtributo;
			}
		'''.compile[
			
			val String = getGeneratedCode("entidades.String")
			val MiEntidad = getGeneratedCode("entidades.MiEntidad")
		
		    assertEquals(String, 
		    '''
		    package entidades;
		    
		    public class String  {
		    
		    	
		    }
		    '''.toString)
		    
		     assertEquals(MiEntidad, 
		    '''
		    package entidades;
		    
		    public class MiEntidad  {
		    
		    	private String miAtributo;
		    	
		    	
		    	public String getMiAtributo(){
		    			
		    		return miAtributo;
		    	}
		    		
		    	public void setMiAtributo(String _arg){
		    							
		    		this.miAtributo = _arg;
		    	}
		    }
		    '''.toString)
		]
	}
}