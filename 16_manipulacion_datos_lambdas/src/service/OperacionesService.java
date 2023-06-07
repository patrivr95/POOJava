package service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OperacionesService {
	//recibe lista de números enteros y devuelve suma de pares
	/*public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for(Integer n:numeros) {
			if(n%2==0) {
				suma+=n;
			}
		}
		return suma;
	}
	//recibe lista de números enteros y devuelve la suma de los positivos
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for(Integer n:numeros) {
			if(n>0) {
				suma+=n;
			}
		}
		return suma;
	}*/
	//un único método que sirva para cualquier condición
	public int sumaCreiterios(List<Integer> numeros, Predicate<Integer> pred) {
		int suma=0;
		for(Integer n:numeros) {
			if(pred.test(n)) { //aplicamos el método test del predicado
				suma+=n;
			}
		}
		return suma;
	}
	
	
	//recibe lista e imprime los pares
	//recibe lista y guarda en fichero los primos
	//recibe lista y manda por http los negativos
	
	public void operarNumeros(List<Integer> numeros, 
			Predicate<Integer> pred, 
			Consumer<Integer> operacion) {
		for(Integer n:numeros) {
			if(pred.test(n)) {
				operacion.accept(n);
			}
		}
	}
	
	
	//recibe lista y devuelve conjunto con el cuadrado de los pares
	//recibe lista y devuelve conjunto con la raiz cúbica de los positivos
	public Set<Integer> conjuntoNumeros(List<Integer> numeros,
			Predicate<Integer> pred,
            Function<Integer,Integer> fun) {
        HashSet<Integer> conjunto = new HashSet<>();
        for(Integer n:numeros) {
            if(pred.test(n)) { //condición que debe cumplir el método (metodo test de Predicate)
                conjunto.add(fun.apply(n));
            }
        }
        return conjunto;
    }
	
	//método que recibe una lista y devuelve la suma de todos los elementos de la lista, 
	//a la que le añadimos un valor extraido de un fichero
	//método que recibe una lista y devuelve la suma de todos los elementos de la lista, 
	//a la que le añadimos un número léido desde un puerto externo
	public int sumador (List<Integer> numeros, Predicate<Integer> pred, Supplier <Integer> res) {
        int respuesta = 0;
        for (Integer n:numeros) {
            if (pred.test(n)) {
                respuesta +=n;
            }
        }
        return respuesta+res.get();
    }
	
}
