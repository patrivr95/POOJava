package service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumerosService {
	public Set<Integer> tranformar(List<Integer> lista, Operaciones oper){
		Set<Integer> conjunto =new HashSet<Integer>();
        for (Integer x : lista) {
            conjunto.add(oper.procesar(x)) ;
        }
        return conjunto;
	}
}
