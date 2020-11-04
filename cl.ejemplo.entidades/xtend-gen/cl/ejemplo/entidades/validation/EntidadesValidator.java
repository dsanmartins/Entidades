package cl.ejemplo.entidades.validation;

import cl.ejemplo.entidades.entidades.Entidad;
import cl.ejemplo.entidades.entidades.EntidadesPackage;
import cl.ejemplo.entidades.validation.AbstractEntidadesValidator;
import java.util.HashSet;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class EntidadesValidator extends AbstractEntidadesValidator {
  @Check
  public void checkSinCiclosEnJerarquiaDeEntidad(final Entidad entidad) {
    Entidad _superTipo = entidad.getSuperTipo();
    boolean _tripleEquals = (_superTipo == null);
    if (_tripleEquals) {
      return;
    }
    final HashSet<Entidad> entidadesVisitadas = CollectionLiterals.<Entidad>newHashSet(entidad);
    Entidad actual = entidad.getSuperTipo();
    boolean _contains = entidadesVisitadas.contains(actual);
    if (_contains) {
      String _name = actual.getName();
      String _plus = ("Ciclo en la jerarquia de la entidad \'" + _name);
      String _plus_1 = (_plus + "\'");
      this.error(_plus_1, 
        EntidadesPackage.eINSTANCE.getEntidad_SuperTipo());
      return;
    }
    entidadesVisitadas.add(actual);
    actual = actual.getSuperTipo();
  }
}
