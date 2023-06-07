package principal;

import java.util.ArrayList;
import java.util.Vector;

import service.TratamientoColecciones;

public class Test {

	public static void main(String[] args) {
		TratamientoColecciones col=new TratamientoColecciones();
		ArrayList<Integer> lista1=new ArrayList<>();
		lista1.add(5);lista1.add(12);lista1.add(8);
		lista1.add(9);
		lista1.add(7);
		System.out.println("Suma: "+col.sumaNumeros(lista1));
		
		Vector<Integer> lista2=new Vector<>();
		lista2.add(6);lista2.add(17);lista2.add(11);
		System.out.println("Suma: "+col.sumaNumeros(lista2));

	}

}
