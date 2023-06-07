package geometria;

public class DatosFiguras {

	public static void main(String[] args) {
		//se crean tres objetos, uno de cada tipo de figura, con datos cualquiera, y se muestra
		//el tipo de figura, su color y su superficie
		Circulo cir=new Circulo("verde",6);
		Triangulo tr=new Triangulo("naranja", 10, 7);
		Rectangulo rt=new Rectangulo("azul", 4, 8);
		//mostramos datos de cada figura
		System.out.println("Tipo círculo: ");
		System.out.println("Color: "+cir.getColor());
		System.out.println("Superfice: "+cir.superficie());
		System.out.println("Tipo Triángulo: ");
		System.out.println("Color: "+tr.getColor());
		System.out.println("Superfice: "+tr.superficie());
		System.out.println("Tipo Rectángulo: ");
		System.out.println("Color: "+rt.getColor());
		System.out.println("Superfice: "+rt.superficie());

	}

}
