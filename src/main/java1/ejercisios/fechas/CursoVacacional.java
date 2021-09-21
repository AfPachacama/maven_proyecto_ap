package ejercisios.fechas;

import java.time.LocalDate;

public class CursoVacacional{
	
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		FechaFin = fechaFin;
	}
	private LocalDate FechaInicio;
	private LocalDate FechaFin;
	
	
	
	

	

}
