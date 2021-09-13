package ejercisios.nonacces.finall;

public final class EstudianteCiencias extends Estudiante {
	
	public final String horarioEntrada="08:00 ";
	public String ciudadNacimiento="Quito";
	private String velocidadInternet;
	
	
	
//	No se puede reasigan un valor a un atributo final.
	public EstudianteCiencias() {
		horarioEntrada="08:30 ";
		ciudadNacimiento="Guayaquil";
		
		
	}

}
