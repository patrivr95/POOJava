package service;

import java.util.ArrayList;
import java.util.List;

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
	
}
