package cl.ulagos.xtend;

import cl.ulagos.xtend.MiListaExtension;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class C {
  @Extension
  private MiListaExtension e = new MiListaExtension();
  
  public Object m() {
    Object _xblockexpression = null;
    {
      final ArrayList<String> lista = new ArrayList<String>();
      this.e.aListaMetodo(lista);
      _xblockexpression = this.e.otraListaMetodo(lista);
    }
    return _xblockexpression;
  }
}
