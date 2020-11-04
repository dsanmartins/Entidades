/*
 * generated by Xtext 2.21.0
 */
package cl.ejemplo.entidades.ui;

import cl.ejemplo.entidades.ui.internal.EntidadesActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntidadesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(EntidadesActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		EntidadesActivator activator = EntidadesActivator.getInstance();
		return activator != null ? activator.getInjector(EntidadesActivator.CL_EJEMPLO_ENTIDADES_ENTIDADES) : null;
	}

}
