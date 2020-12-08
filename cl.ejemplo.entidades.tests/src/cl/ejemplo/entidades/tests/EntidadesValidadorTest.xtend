package cl.ejemplo.entidades.tests

import org.eclipse.xtext.testing.util.ParseHelper
import cl.ejemplo.entidades.entidades.Model
import com.google.inject.Inject
import org.junit.jupiter.api.Test
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import cl.ejemplo.entidades.entidades.EntidadesPackage
import cl.ejemplo.entidades.validation.EntidadesValidator
import org.eclipse.xtext.testing.InjectWith
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension

@ExtendWith(InjectionExtension)
@InjectWith(EntidadesInjectorProvider)
class EntidadesValidadorTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	@Test
	def void testEntidadExtiendeConsigoMismo() {
	'''
		entidad MiEntidad extends MiEntidad {
			
		}

	'''.parse.assertCicloJerarquico("MiEntidad")
	}
	
	def private assertCicloJerarquico(Model m, String nombreEntidad) {
		m.assertError(EntidadesPackage.eINSTANCE.entidad,
		EntidadesValidator.CICLO_JERARQUICO,
		"Ciclo Jerarquico en la entidad '" + nombreEntidad + "'"
		)
	}
}