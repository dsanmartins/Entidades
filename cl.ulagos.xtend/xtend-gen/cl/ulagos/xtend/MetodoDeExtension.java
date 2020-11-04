package cl.ulagos.xtend;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class MetodoDeExtension {
  public Object listaMetodo(final List<?> lista) {
    return null;
  }
  
  public Object m() {
    Object _xblockexpression = null;
    {
      final ArrayList<String> lista = new ArrayList<String>();
      _xblockexpression = this.listaMetodo(lista);
    }
    return _xblockexpression;
  }
}
