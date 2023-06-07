package principal;

import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(8,3,11,24,-3,1,-8,3,5,11,-8);
		
		st.forEach(n->System.out.println(n));

	}

}
