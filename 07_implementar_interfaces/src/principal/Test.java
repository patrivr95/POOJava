package principal;

import interfaces.Ficheros;
import interfaces.Impresiones;
import interfaces.Pantalla;

public class Test {

	public static void main(String[] args) {
		procesar(new Ficheros(),"una cadena");
		procesar(new Pantalla(),"otra cadena");

	}
	
	//llamada a los métodos de la interfaz sobre cualquier objeto
	//que la implemente
	
	public static void procesar(Impresiones imp, String dato) {
		imp.printer(dato);
	}

}
