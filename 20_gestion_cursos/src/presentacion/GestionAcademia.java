package presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Curso;
import service.CursosService;

public class GestionAcademia {
	
	static Scanner sc = new Scanner(System.in);
	static CursosService cursosService = new CursosService();
	
	
	public static void main(String[] args) {
		
		// añadimos cinco cursos
		
		// eliminamos los cursos cuya duracion sea superior a un valor
		
		// subimos 50 euros los precios de los cursos
		
		// mostramos los nombres de los cursos, de menos a más precio
		
		
		System.out.println("Elige una opción: " + 
		"1. Añadir curso " + 
		"2. Eliminar curso según duración " +
		"3. Subir 50€ cada curso " + 
		"4. Mostrar nombres de cursos según precio");
		
		int opcion;
		
		do {
			opcion = Integer.parseInt(sc.nextLine());
			switch(opcion) {
				case 1:
					crearCurso();
					break;
				case 2:
					eliminarCursos();
					break;
				case 3:
					subirPrecio();
					break;
				case 4:
					ordenarCursos();
					break;
			}
			
		} while(opcion != 4);
		
	}
	
	
	
	public static void crearCurso() {
		System.out.println("Introduce el nombre del curso: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce la duración del curso: ");
		int duracion = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el precio del curso: ");
		double precio = Double.parseDouble(sc.nextLine());
		
		cursosService.guardarCurso(nombre, duracion, precio);
	}
	
	
	public static void eliminarCursos() {
		
		System.out.println("Introduce una duración en meses: ");
		int duracion = Integer.parseInt(sc.nextLine());
		
		cursosService.duracionCurso(duracion);
		cursosService.eliminarCurso(c->c.getDuracion()>duracion);
		
	}
	
	
	public static void subirPrecio() {
		cursosService.subirPrecio(50);
	}
	
	public static void ordenarCursos() {
		cursosService.ordenarPrecio().forEach(c->System.out.println(c.getNombre()));;
		
	}

}
