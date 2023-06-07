package service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class NotasService {
	private List<Double> notas=new ArrayList<>();
	
	public void guardarNota(double nota) {
		notas.add(nota);
	}
	
	public void subirNotas() {
		notas.replaceAll(n->n+1);
	}
	
	public void eliminarSuspensos() {
		notas.removeIf(n->n<5);
	}
	
	public List<Double> obtenerNotas() {
		return notas;
	}
	
	// devolver el total de aprobados
	
	public int aprobados() {
		
		return(int)notas
				.stream()
				.filter(n->n>=5)
				.count();
	}
	
	/*
	public double aprobados(){
		Stream<Double> st = notas.stream();
		
		double aprobados = st.filter(n->n>=5).count();
		return aprobados;
		
	}
	*/
	
	
	// devolver si ha habido sobresalientes
	
	public boolean sobresalientes() {
		
		return(boolean)notas
				.stream()
				.anyMatch(n->n>=9);
				
	}
	
	public double notaMax() {
		return notas
				.stream()
				.max((a,b)->Double.compare(a,b))
				.orElse(-1.0);
	}
	
	public double notaMin() {
		return notas
				.stream()
				.min((a,b)->Double.compare(a,b))
				.orElse(-1.0); // devuelve o el valor que encuentre o el valor que le asignemos por defecto si no encuentra nada
	}
	
	// nota media
	public double notaMedia() {
		return notas
				.stream()
				.mapToDouble(n->n)
				.average()
				.orElse(0.0);
	}
	
}
