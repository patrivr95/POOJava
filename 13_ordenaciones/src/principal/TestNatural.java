package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestNatural {

	public static void main(String[] args) {
		List<String> nombres=new ArrayList<>();
		nombres.add("casa");nombres.add("paraguas");nombres.add("boligrafo");
		nombres.add("balon");nombres.add("arena");nombres.add("mesa");
		//mostrar ordenados alfabeticamente
		Collections.sort(nombres);
		for(String n:nombres) {
			System.out.println(n);
		}
		
		//ordenar por número de caracteres
		Comparator<String> comp=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				//return o1.length()-o2.length();
				return Integer.compare(o1.length(), o2.length());
			}
		};
		System.out.println("------------------------");
		Collections.sort(nombres,comp);
		for(String n:nombres) {
			System.out.println(n);
		}
	}

}
