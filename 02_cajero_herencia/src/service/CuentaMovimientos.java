package service;

import java.util.ArrayList;
import java.util.Date;

import model.Movimiento;

public class CuentaMovimientos extends CuentaLimitada {
	private ArrayList<Movimiento> movimientos=new ArrayList<>();

	public CuentaMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}
	
	public ArrayList<Movimiento> getMovimientos(){
		return movimientos;
	}
	//sobrescribimos extraer e ingresar para que se registren los movimientos
	@Override
	public void extraer(double cantidad) {
		movimientos.add(new Movimiento(cantidad,"Extraer",new Date()));
		super.extraer(cantidad);
	}

	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad,"Ingreso",new Date()));
		super.ingresar(cantidad);
	}
}
