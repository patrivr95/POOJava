package service;

public class Calculadora {
	private int x, y; //atributos, variables donde cada objeto tiene sus propios valores
	private static final int v=4; //variables de clase, no asociada a objetos
	public Calculadora(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//devuelve la suma de los atributos
	public int suma() {
		return x+y;
	}
	//devuelve el producto de los atributos
	public int multiplica() {
		return x*y;
	}
	//devuelve un número aleatorio entre 1 y 10
	public static double aleatorio() {
		return (int)(Math.random()*10+1)*v;
	}
	//devuelve el factorial del número recibido
	public static int factorial(int num) {
		return num*2*v;
	}
	//devuelve la suma del número recibido más los atributos
	public int sumatotal(int num) {
		return x+y+num;
	}
}
