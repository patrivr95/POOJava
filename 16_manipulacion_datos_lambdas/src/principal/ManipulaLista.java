package principal;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import service.OperacionesService;

public class ManipulaLista {

	public static void main(String[] args) {
		List<Integer> lista=List.of(9,-2,8,11,16,20,-7);
		OperacionesService operService=new OperacionesService();
		//muestra la suma de los negativos
		/*Predicate<Integer> esNegativo = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num < 0;
            }
        };*/
        System.out.println("Suma negativos: "+operService.sumaCreiterios(lista, n->n<0));
		
		//muestra la suma de los pares
		/*Predicate<Integer> esPar = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num % 2 == 0;
            }
        };*/
        System.out.println("Suma pares: "+operService.sumaCreiterios(lista, n->n%2==0));
        
        
        //Imprimir los pares de la lista
        /*Consumer<Integer> impr=new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}      	
		};*/
		
		operService.operarNumeros(lista, n->n%2==0, n->System.out.println(n));
		
		//sumar todos los pares de la lista más un número aleatorio
		//entre 1 y 100
		/*Supplier<Integer> sup=new Supplier<Integer>() {
			@Override
			public Integer get() {
				return (int)(Math.random()*100+1);
			}
		};*/
		
		System.out.println(operService.sumador(lista, n->n%2==0, ()->(int)(Math.random()*100+1)));
		
		
	}

}
