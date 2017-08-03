/**
 * generated by Xtext 2.12.0
 */
package uam.extremo.casestudy.epmltext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uam.extremo.casestudy.epmltext.EPMLTextRuntimeModule;
import uam.extremo.casestudy.epmltext.EPMLTextStandaloneSetup;
import uam.extremo.casestudy.epmltext.ide.EPMLTextIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EPMLTextIdeSetup extends EPMLTextStandaloneSetup {
  @Override
  public Injector createInjector() {
    EPMLTextRuntimeModule _ePMLTextRuntimeModule = new EPMLTextRuntimeModule();
    EPMLTextIdeModule _ePMLTextIdeModule = new EPMLTextIdeModule();
    return Guice.createInjector(Modules2.mixin(_ePMLTextRuntimeModule, _ePMLTextIdeModule));
  }
}
