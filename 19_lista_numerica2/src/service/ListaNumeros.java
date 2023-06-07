package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListaNumeros extends ArrayList<Integer>{
	int res=0;
	public Integer first() {
		if(size()>0) {
			return get(0);
		}else {
			return null;
		}
	}
	public Integer last() {
		if(size()>0) {
			return get(size()-1);
		}else {
			return null;
		}
	}
	public int sum() {
		int res=0;
		for(Integer i:this) {
			res+=i;
		}
		/*for(int i=0;i<size();i++) {
			res+=get(i);
		}*/
		return res;
	}
	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
			return super.add(e);
		}
		return false;
	}
	
	//sobrecargar el método sum con una nueva versión que devuelva la suma
	//de los números que cumplan con el criterio recibido como parámetro
	public int sum(Predicate<Integer> cond) {
		res=0;
		forEach(n->{ //rcorremos y sumamos si cumple la condición del predicado
			if(cond.test(n)) {
				res+=n;
			}
		});
		return res;
	}
	
	//método potencia: eleva cada número de ListaNumeros a la potencia que se reciba
	//como parámetro
	public void potencia(int ex) {
		replaceAll(n->(int)Math.pow(n, ex));
	}
	
	//método filtrar: recibe una condición y devuelve una parte de la lista
	//con los números que cumplan dicha condición
	public List<Integer> filtro(Predicate<Integer> cond){
		List<Integer> lista=new ArrayList<Integer>();
		forEach(n->{ //rcorremos y sumamos si cumple la condición del predicado
			if(cond.test(n)) {
				lista.add(n);
			}
		});
		return lista;
	}
	
}
