package service;

public class CuentaNueva extends Cuenta {
	
	private double limite;
	
	
	public CuentaNueva(double limite) {
		this.limite = limite;
	}
	
	
	public CuentaNueva() {
		limite = 500;
	}
	
	
	@Override
	public void extraerSaldo(double saldo) {
		
		if(saldo < limite) {
			super.extraerSaldo(saldo);
		} else {
			super.extraerSaldo(limite);
		}
		
	}
	
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	
}
