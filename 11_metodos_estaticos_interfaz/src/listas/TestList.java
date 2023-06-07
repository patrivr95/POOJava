package listas;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Integer> lista=new ArrayList<>();
		lista.add(2);lista.add(12);lista.add(8);lista.add(35);
		
		//con métodos estáticos de List (desde Java 9)
		List<Integer> lista2=List.of(4,1,11,22,9);

	}

}
