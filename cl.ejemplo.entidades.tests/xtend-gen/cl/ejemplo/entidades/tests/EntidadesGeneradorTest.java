package cl.ejemplo.entidades.tests;

import cl.ejemplo.entidades.tests.EntidadesInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(EntidadesInjectorProvider.class)
@SuppressWarnings("all")
public class EntidadesGeneradorTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testGeneratedCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entidad String {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entidad MiEntidad {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String miAtributo;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        final String String = it.getGeneratedCode("entidades.String");
        final java.lang.String MiEntidad = it.getGeneratedCode("entidades.MiEntidad");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("package entidades;");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("public class String  {");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        Assert.assertEquals(String, 
          _builder_1.toString());
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("package entidades;");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("public class MiEntidad  {");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("private String miAtributo;");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("public String getMiAtributo(){");
        _builder_2.newLine();
        _builder_2.append("\t\t\t");
        _builder_2.newLine();
        _builder_2.append("\t\t");
        _builder_2.append("return miAtributo;");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.append("\t\t");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("public void setMiAtributo(String _arg){");
        _builder_2.newLine();
        _builder_2.append("\t\t\t\t\t\t\t");
        _builder_2.newLine();
        _builder_2.append("\t\t");
        _builder_2.append("this.miAtributo = _arg;");
        _builder_2.newLine();
        _builder_2.append("\t");
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.append("}");
        _builder_2.newLine();
        Assert.assertEquals(MiEntidad, 
          _builder_2.toString());
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
