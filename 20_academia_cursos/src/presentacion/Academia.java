package presentacion;

import service.CursosService;

public class Academia {

	public static void main(String[] args) {
		//añadimos cinco cursos
		//eliminamos los cursos cuya duración sea superior a un valor
		//subimos 50 euros los precios de los cursos
		//mostramos los nombres de los cursos, de menos a más precio
		CursosService cursosService=new CursosService();
		
		cursosService.eliminarCondicion(c->c.getDuracion()>100);
		cursosService.subirPrecio(50);
		cursosService.ordenarPorPrecio().forEach(c->System.out.println(c.getNombre()));
	}

}
