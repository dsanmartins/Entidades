/*
 * generated by Xtext 2.21.0
 */
package cl.ejemplo.entidades.ide;

import cl.ejemplo.entidades.EntidadesRuntimeModule;
import cl.ejemplo.entidades.EntidadesStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class EntidadesIdeSetup extends EntidadesStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new EntidadesRuntimeModule(), new EntidadesIdeModule()));
	}
	
}
