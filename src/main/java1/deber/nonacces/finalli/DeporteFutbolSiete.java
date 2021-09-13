package deber.nonacces.finalli;

public class DeporteFutbolSiete extends DeportesFutbol {


//	No se puede sobreescribir un metodo final del padre

	protected final void entrenamientoDeportivo() {

		System.out.println(" Correr 10 minutos");
		System.out.println(" Ejercisio Stretegia");
		System.out.println(" Ejercisio Dominio");

	}
	
	protected void partidosJugar() {
		System.out.println("Campeonato Provincial Futbol 7 ");
}
}