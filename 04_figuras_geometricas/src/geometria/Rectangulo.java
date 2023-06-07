package geometria;

public class Rectangulo extends Figura {
	private int alto;
	private int ancho;
	
	public Rectangulo(String color, int alto, int ancho) {
		super(color);
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public double superficie() {
		return alto*ancho;
	}

}
