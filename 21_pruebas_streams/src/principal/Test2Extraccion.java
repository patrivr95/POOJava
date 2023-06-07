package principal;

import java.util.stream.Stream;

public class Test2Extraccion {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(8,3,11,24,-3,1,-8,3,5,11,-8);
		//¿Cuantos numeros diferentes hay?
		
		//System.out.println(st.distinct().count());
		
		// distinct es el metodo intermedio, y count es el metodo final
		// distinct devuelve un Stream<Integer>
		// count devuelve un long
		
		
		// imprimir los numeros diferentes
		
		//st.distinct().forEach(n->System.out.println(n));
		// no ejecuta porque los streams se cierran y no se pueden volver a utilizar
		
		// Cuantos números no duplicados hay entre los 7 primeros numeros del stream?
		
		System.out.println(st.limit(7).distinct().count());
		
		
		
		

	}

}
