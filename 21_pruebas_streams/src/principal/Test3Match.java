package principal;

import java.util.stream.Stream;

public class Test3Match {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(8,3,11,24,-3,1,-8,3,5,11,-8);
		
		//Hay algún numero negativo entre los 5 primeros números del string?
		System.out.println(st.limit(5).anyMatch(n-> n<0));

	}

}
