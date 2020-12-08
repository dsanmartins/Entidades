package cl.ejemplo.entidades.validation

import org.eclipse.xtext.validation.Check

import cl.ejemplo.entidades.entidades.Entidad
import cl.ejemplo.entidades.entidades.EntidadesPackage

class EntidadesValidator extends AbstractEntidadesValidator{
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					EntidadesPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	public static val CICLO_JERARQUICO ="org.ejemplo.entidades.CicloJerarquico";
	
	@Check
	def checkSinCiclosEnJerarquiaDeEntidad(Entidad entidad) {
		
		if (entidad.superTipo === null)
			return
		
		val entidadesVisitadas = newHashSet(entidad)
		var actual = entidad.superTipo
		
		if (entidadesVisitadas.contains(actual)){
			
			
			error("Ciclo Jerarquico en la entidad '" + actual.name + "'",
				EntidadesPackage.eINSTANCE.entidad_SuperTipo, CICLO_JERARQUICO,
				actual.superTipo.name)
				return
		}
	
		entidadesVisitadas.add(actual)
		actual = actual.superTipo
		
	}
	
}