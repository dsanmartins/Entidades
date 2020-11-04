package cl.ulagos.xtend

import java.util.LinkedList

class Main {
	
	
	def static void main(String[] args){
		
		val str = 'HELLO'
		
		println(str)
		println(trans1(str))
		
		
		val l = [String s, int i | s+i]
		println(l.apply("s",10))
		
		val (String, int) => String m = [ s, i |s+i]
		println(m.apply("a", 10))
		
		
		val c = 'aaa'
		println(execute([s,i | s+i +c]))
		
		
		println(generator('metodo'))
		
		val lista = newLinkedList
		
		lista.add(0)
		lista.add(1)
		lista.add(2)
		lista.add(3)
		
		println(generarFor(lista))
	}
	
	
	def static trans1(String it){
		
		toLowerCase //it.toLowerCase
		
	}
	
	def static execute((String, int) => String f)
	{
		f.apply("s",10)
	}
	
	
	def static generator(String name){
		
		'''
			/* body of «name» */
			
		'''
	}
	
	def static generarFor(LinkedList<Integer> c){
		
		'''
			for (int i = 0 ; i < «c.size» ) {
				
				«var i = 0»
				«FOR item: c»
					«c.get(i++)»
				«ENDFOR»
			}
		'''

	}
	
	
}