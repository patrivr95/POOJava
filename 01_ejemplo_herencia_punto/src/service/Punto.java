package service;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		x=10;
		y=5;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void imprimir() {
		System.out.print(" La coordenada x es " + x + " y la coordenada y es " + y);
	}
	
	
	
}
