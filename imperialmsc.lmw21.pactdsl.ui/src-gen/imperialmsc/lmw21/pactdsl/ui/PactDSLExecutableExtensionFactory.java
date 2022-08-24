/*
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.ui;

import com.google.inject.Injector;
import imperialmsc.lmw21.pactdsl.ui.internal.PactdslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PactDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(PactdslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		PactdslActivator activator = PactdslActivator.getInstance();
		return activator != null ? activator.getInjector(PactdslActivator.IMPERIALMSC_LMW21_PACTDSL_PACTDSL) : null;
	}

}