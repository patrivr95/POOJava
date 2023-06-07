package model;

import java.time.LocalDate;

public class Movimientos {
	
	private double cantidad;
	private String tipo;
	private LocalDate fecha;
	
	public Movimientos(double cantidad, String tipo, LocalDate fecha) {
		this.cantidad = cantidad;
		this.tipo = tipo;
		this.fecha = fecha;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
