package principal;

import java.util.ArrayList;
import java.util.List;

public class TareasLista {

	public static void main(String[] args) {
		List<Integer> lista=new ArrayList<>();
		lista.add(-2);lista.add(32);lista.add(11);
		lista.add(8);lista.add(4);lista.add(-7);
		//dada la lista anterior, eliminar los negativos, reemplazar cada número resultante por su cuadrado
		//y mostrarlos ordenados de mayor a menor
		lista.removeIf(n->n<0);
		lista.replaceAll(n->n*n);
		lista.sort((a,b)->Integer.compare(b, a));
		lista.forEach(n->System.out.println(n));
	}

}
