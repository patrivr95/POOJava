package service;

public class Cuenta {
	private double saldo;

	//constructores
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta() {
		saldo = 50;
	}
	
	
	//métodos
	public void ingresarSaldo(double cantidad) {
		saldo += cantidad;
	}
	
	public void extraerSaldo(double cantidad) {
		saldo -= cantidad;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
}
