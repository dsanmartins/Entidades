package cl.ulagos.xtend

import java.util.ArrayList

class C {
	
	extension MiListaExtension e = new MiListaExtension
	
	def m(){
		
		val lista = new ArrayList<String>
		lista.aListaMetodo
		lista.otraListaMetodo

	}
	
	
}