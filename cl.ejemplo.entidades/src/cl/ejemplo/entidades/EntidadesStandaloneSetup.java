/*
 * generated by Xtext 2.21.0
 */
package cl.ejemplo.entidades;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class EntidadesStandaloneSetup extends EntidadesStandaloneSetupGenerated {

	public static void doSetup() {
		new EntidadesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
