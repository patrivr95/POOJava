package service;

public class Cuenta {
	private double saldo;
	//constructores
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	public Cuenta() {
		saldo=50;
	}	
	//métodos
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
