package service;

import java.util.ArrayList;

public class MetodosNumericos extends ArrayList<Integer> {
	
	public Integer devolverPrimero() {
		if(size()> 0) {
			return get(0);
		} else {
			return null;
		}
		
		
	}
	
	public Integer devolverUltimo() {
		
		if(size() > 0) {
			return get(size()-1);
		} else {
			return null;
		}
		
	}
	
	public int sumarNumeros() {
		
		int suma = 0;
		
		
		for(int i = 0; i < size(); i++) {
			suma += get(i);
		}
		
		return suma;
		
	}

	@Override
	public boolean add(Integer element) {
		
		if(!contains(element)) {
			return super.add(element);
		}
		
		return false;
		
		
	}
	
	
	
	

}
