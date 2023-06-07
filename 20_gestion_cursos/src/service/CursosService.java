package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.Curso;

public class CursosService {
	
	List<Curso> cursos = new ArrayList<>();
	
	int precio=0;

	
	//Añadir curso: Recibe los datos de un curso y lo guarda
	
	
	public void guardarCurso(String nombre, int duracion, double precio) {
		cursos.add(new Curso(nombre, duracion, precio));
	}
	

	//Cursos por duración: Recibe como parámetro una duración y devuelve los cursos cuya duración máxima sea ese valor
	
	public List<Curso> duracionCurso(int max) {
		List<Curso> listaCursoDuracion = new ArrayList<>();
		cursos.forEach(n->{
			if(n.getDuracion()<max) {
				listaCursoDuracion.add(n);
			}
		});
		
		return listaCursoDuracion;
	}
	
	
	
	//Eliminar cursos: Recibe una condición, y elimina los cursos que la cumplen
	
	public void eliminarCurso(Predicate<Curso> cond){
		List<Curso> nuevaListaCurso = new ArrayList<>();
		
		cursos.removeIf(cond);
		
		//lo que cumpla la condición, lo eliminas. Es el método más simple.
	}
	
	
	
	//Subir precio: Recibe una cantidad y aumenta el precio de todos los cursos en esa cantidad
	
	public void subirPrecio(double cantidad) {
		
		cursos.forEach(n -> n.setPrecio(n.getPrecio()+cantidad));
	}
	
	
	//Ordenar por precio: Devuelve la lista de cursos ordenada por precio, de menor a mayor
	
	
	public List<Curso> ordenarPrecio() {
		
		cursos.sort((a, b)->Double.compare(a.getPrecio(), b.getPrecio()));
		return cursos;
		
		
	}
	
	
	
}
