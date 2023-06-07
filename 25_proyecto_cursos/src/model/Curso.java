package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Curso {
	private String nombre;
	private String tematica;
	private double precio;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
}
