package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.Curso;

public class CursosService {
	List<Curso> cursos=new ArrayList<>();
	public void agregarCurso(String nombre, int duracion, double precio) {
		cursos.add(new Curso(nombre,duracion,precio));
	}
	
	public List<Curso> cursosDuracion(int max){
		List<Curso> aux=new ArrayList<>();
		cursos.forEach(c->{
			if(c.getDuracion()<max) {
				aux.add(c);
			}
		});
		return aux;
	}
	
	public void eliminarCondicion(Predicate<Curso> cond) {
		cursos.removeIf(cond);
	}
	public void subirPrecio(double cantidad) {
		cursos.forEach(c->c.setPrecio(c.getPrecio()+cantidad));
	}
	public List<Curso> ordenarPorPrecio(){
		cursos.sort((a,b)->Double.compare(a.getPrecio(), b.getPrecio()));
		return cursos;
	}
}
