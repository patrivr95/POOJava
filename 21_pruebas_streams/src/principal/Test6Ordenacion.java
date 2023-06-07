package principal;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test6Ordenacion {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(8,3,11,24,-3,1,-8,3,5,11,-8);
		
		// Cual es el número más alto?
		
		st
		.sorted((a, b) -> Integer.compare(b, a))
		.findFirst()
		.ifPresent(a->System.out.println(a));
		
		st.max((a, b) ->a-b);

	}

}
