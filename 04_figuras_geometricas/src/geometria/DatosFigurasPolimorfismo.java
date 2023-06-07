package geometria;

public class DatosFigurasPolimorfismo {

	public static void main(String[] args) {
		//se crean tres objetos, uno de cada tipo de figura, con datos cualquiera, y se muestra
		//el tipo de figura, su color y su superficie
		mostrarDatos(new Circulo("verde",6));
		mostrarDatos(new Triangulo("naranja", 10, 7));
		mostrarDatos(new Rectangulo("azul", 4, 8));
	}
	
	static void mostrarDatos(Figura figura) {
		System.out.println("Tipo "+figura.getClass().getSimpleName());
		System.out.println("Color: "+figura.getColor());
		System.out.println("Superfice: "+figura.superficie());
	}

}
