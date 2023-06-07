package service;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Movimientos;

public class RegistrarMovimientos extends CuentaNueva {
	
	
	private ArrayList<Movimientos> movimientos = new ArrayList<>();
	
	public RegistrarMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}
	
	public ArrayList<Movimientos> getMovimientos() {
		return movimientos;
	}
	
	
	@Override
	public void extraerSaldo(double cantidad) {
		movimientos.add(new Movimientos(cantidad, "Extraer", new Date()));
		super.ingresarSaldo(cantidad);
	}
	
	@Override
	public void ingresarSaldo(double cantidad) {
		movimientos.add(new Movimientos(cantidad, "Ingreso", new Date()));
		super.ingresarSaldo(cantidad);
		
		
	}


	
	
	
	
	
	
	
	
}
