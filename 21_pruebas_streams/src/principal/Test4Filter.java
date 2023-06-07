package principal;

import java.util.stream.Stream;

public class Test4Filter {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(8,3,11,24,-3,1,-8,3,5,11,-8);
		
		// Cuantos numeros negativos diferentes hay?
		
		System.out.println(st.filter(n->n<0).distinct().count());
		
		

	}

}
