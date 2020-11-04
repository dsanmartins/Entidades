package cl.ulagos.xtend;

import java.util.LinkedList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    final String str = "HELLO";
    InputOutput.<String>println(str);
    InputOutput.<String>println(Main.trans1(str));
    final Function2<String, Integer, String> _function = (String s, Integer i) -> {
      return (s + Integer.valueOf(i));
    };
    final Function2<String, Integer, String> l = _function;
    InputOutput.<String>println(l.apply("s", Integer.valueOf(10)));
    final Function2<String, Integer, String> _function_1 = (String s, Integer i) -> {
      return (s + i);
    };
    final Function2<? super String, ? super Integer, ? extends String> m = _function_1;
    InputOutput.<String>println(m.apply("a", Integer.valueOf(10)));
    final String c = "aaa";
    final Function2<String, Integer, String> _function_2 = (String s, Integer i) -> {
      return ((s + i) + c);
    };
    InputOutput.<String>println(Main.execute(_function_2));
    InputOutput.<CharSequence>println(Main.generator("metodo"));
    final LinkedList<Integer> lista = CollectionLiterals.<Integer>newLinkedList();
    lista.add(Integer.valueOf(0));
    lista.add(Integer.valueOf(1));
    lista.add(Integer.valueOf(2));
    lista.add(Integer.valueOf(3));
    InputOutput.<CharSequence>println(Main.generarFor(lista));
  }
  
  public static String trans1(final String it) {
    return it.toLowerCase();
  }
  
  public static String execute(final Function2<? super String, ? super Integer, ? extends String> f) {
    return f.apply("s", Integer.valueOf(10));
  }
  
  public static CharSequence generator(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* body of ");
    _builder.append(name);
    _builder.append(" */");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence generarFor(final LinkedList<Integer> c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for (int i = 0 ; i < ");
    int _size = c.size();
    _builder.append(_size);
    _builder.append(" ) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    int i = 0;
    _builder.newLineIfNotEmpty();
    {
      for(final Integer item : c) {
        _builder.append("\t");
        int _plusPlus = i++;
        Integer _get = c.get(_plusPlus);
        _builder.append(_get, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
