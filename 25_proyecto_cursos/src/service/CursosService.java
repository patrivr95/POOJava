package service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Curso;

public class CursosService {
	
	List<Curso> cursos = new ArrayList<>();
	
	
	// Alta curso: Se reciben los datos de un curso y se guarda. Hay que evitar cursos duplicados (mismo nombre y misma fecha de inicio)
	
	public boolean altaCurso(Curso curso) {
		if(cursos.stream()
				.noneMatch(c->c.getNombre().equals(curso.getNombre())
						&&c.getFechaInicio().isEqual(curso.getFechaInicio()))) {
			cursos.add(curso);
			return true;
		}
		return false;
	}
	
	
	// Existe curso: Se recibe un nombre de curso y devuelve true si existe un curso con dicho nombre
	
	
	public boolean buscarCurso(String nombre) {
		return cursos
				.stream()
				.anyMatch(n->n.equals(nombre));
	}
	
	
	// Total cursos tematica: Se recibe el nombre de la temática y se devuelve el número de cursos de dicha tematica
	
	public long cursosTematica(String tematica) {
		return cursos
				.stream()
				.filter(c->c.getTematica().equals(tematica))
				.count();
	}
	
	
	// Total temáticas: Devuelve el total de temáticas de cursos
	
	public int totalTematicas() {
		return (int)cursos
				.stream()
				.map(c->c.getTematica())
				.distinct()
				.count();
	}
	
	
	// Precio medio: Recibe la temática y deuelve el precio método de los cursos de dicha temática
	
	public double precioMedio(String tematica) {
		return cursos
				.stream()
				.filter(c->c.equals(tematica))
				.mapToDouble(c->c.getPrecio())
				.average()
				.orElse(0.0);
	}
	
	
	
	// Cursos en fecha. Recibe una fecha y devuelve el total de cursos que finalizan después de esa fecha
	
	public long cursosFecha(LocalDate fecha) {
		
		return cursos
				.stream()
				.filter(c->c.getFechaFin().isAfter(fecha))
				.count();
	}
	
	
	// lista de cursos de la tematica recibida como parámetro
	
	public List<Curso> listaTematicas (String tematica){
		
		return cursos
				.stream()
				.filter(c->c.equals(tematica))
				.collect(Collectors.toList());
	}
	
	// conjunto de tematicas
	
	public Set<String> conjunTema(){
		
		return cursos
				.stream()
				.map(c->c.getTematica()) // se transforma es un Stream<String>
				.distinct()
				.collect(Collectors.toSet()); // Set<String>
	}
	
	// lista de cursos cuyos precios se encuentran entre los dos valores recibidos como parámetro
	
	public List<Curso> cursosSegunPrecio (double precioMin, double precioMax){
		
		return cursos
				.stream()
				.filter(c->c.getPrecio() >= precioMin && c.getPrecio() <= precioMax)
				.collect(Collectors.toList());
	}
	
	// lista de cursos cuya duración sea inferior a los meses que se reciben como parámetro
	
	
	public List<Curso> cursosDuracionMenos(int meses){
		
		return cursos
				.stream()
				.filter(c->Period.between(c.getFechaInicio(), c.getFechaFin()).toTotalMonths() < meses)
				.collect(Collectors.toList());
	}
	
	// Tabla de cursos, donde la clave sea la duracion del curso (en meses) y el valor el nombre del curso
	
	public Map<Integer, String> nuevaTabla(){
		
		return cursos
				.stream()
				.collect(Collectors.toMap(m->(int)Period.between(m.getFechaInicio(), m.getFechaFin()).toTotalMonths(), n->n.getNombre(),
						(a,b) -> a + "," + b)); 
	}
	
	// tabla con los cursos divididos entre caros y baratos, Caros, los que superen el precio recibido, barato si no lo superan o iguales
	
	public Map<Boolean, List<Curso>> cursosSegunPrecio(double precio){
		
		return cursos
				.stream()
				.collect(Collectors.partitioningBy(c->c.getPrecio()<=precio));
	}
	
	// devuelve una cadena con los nombres de todos los cursos separados por una coma
	
	public String nombresCursos(){
		
		return cursos
				.stream()
				.map(c->c.getNombre())
				.collect(Collectors.joining(","));
	}
	
	
}
