package principal;

import java.util.stream.Stream;

public class Test5Busquedas {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(8,3,11,24,-3,1,-8,3,5,11,-8);
		
		//mostrar el primer número negativo que hay a partir del quinto número
		st
		.skip(5) // nos saltamos los 5 primeros
		.filter(n->n<0) //nos quedamos con los negativos
		.findFirst()
		//.ifPresent(n->System.out.println(n));
		.ifPresentOrElse(n->System.out.println(n), ()->System.out.println("No hay resultado")); //solo valido a partir de Java 11

	}

}
