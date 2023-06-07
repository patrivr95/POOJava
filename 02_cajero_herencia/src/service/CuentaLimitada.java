package service;

public class CuentaLimitada extends Cuenta {
	private double limite;
	public CuentaLimitada(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	@Override
	public void extraer(double cantidad) {
		if(cantidad<limite) {
			super.extraer(cantidad);
		}else {
			super.extraer(limite);
		}
	}
	
	
	

}
