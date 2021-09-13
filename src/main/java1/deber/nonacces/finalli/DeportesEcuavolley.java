package deber.nonacces.finalli;

public final class DeportesEcuavolley extends Deportes {
	public final String horarioEntrenamiento="07:00 Am ";
	public String sede="Quito";
	public String campeonatoProvincial;
	
	public DeportesEcuavolley() {
//		No se puede reasigan un valor a un atributo final.
		horarioEntrenamiento="09:00 Am ";
		sede="Quito";
		
	}

		

}
