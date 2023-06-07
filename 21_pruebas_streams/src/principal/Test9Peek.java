package principal;

import java.util.stream.Stream;

public class Test9Peek {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(8,3,11,24,-3,1,-8,3,5,11,-8);
		
		// Muestra todos los números positivos y también cuantos hay
		
	System.out.println("Total: " + st
		.filter(n->n>0)
		.peek(n->System.out.println("Número: " + n))
		.count());
	}

}
