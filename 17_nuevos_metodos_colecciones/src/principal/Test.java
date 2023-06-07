package principal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> lista=new ArrayList<>();
		lista.add(-2);lista.add(32);lista.add(11);
		lista.add(8);lista.add(4);lista.add(-7);
		/*for(Integer n:lista) {
			System.out.println(n);
		}*/
		lista.forEach(n->System.out.println(n));
		
	}

}
