package model;

import java.util.Date;

public class Movimiento {
	private double cantidad;
	private String operacion;
	private Date fecha;
	public Movimiento(double cantidad, String operacion, Date fecha) {
		super();
		this.cantidad = cantidad;
		this.operacion = operacion;
		this.fecha = fecha;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
