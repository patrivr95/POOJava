package principal;

import service.ListaNumeros;

public class TestListaNumerica {
	
	public static void main(String[] args) {
		
		ListaNumeros lst=new ListaNumeros();
		lst.add(50);lst.add(11);lst.add(-23);
		lst.add(-8); lst.add(4);lst.add(16);
		
		// mostrar suma de los negativos
		System.out.println(lst.sum(n->n<0));
		
		//mostrar suma de pares
		//System.out.println((lst.sum(n->n%2==0));
		
		//mostrar los negativos
		lst.filtro(n->n<0).forEach(n->System.out.println(n));
		
		//mostrar los múltiplos de 5
		lst.filtro(n->n%5==0).forEach(n->System.out.println(n));
		// hay que hacer un forEach para mostrar esos numeros, ya que lo que devuelve
		// es una nueva lista
		
	}
	
}
