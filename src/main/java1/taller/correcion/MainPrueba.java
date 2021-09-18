package taller.correcion;

import java.util.Scanner;

public class MainPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String claveIngresada;
		String opcionMenu;
		int saldoInicial = 2500;
		
	

		
		System.out.println(" Ingrese clave: ");
		Scanner lector = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);

		
		claveIngresada = lector.nextLine();
		
		if(claveIngresada.equals("85DB")) {
			
			do {
			System.out.println(" BANCO PICHINCHA ,  Elija una opcion:");
			System.out.println("1. Consultar Pagos");
			System.out.println("2. Realizar tranferencia");
			System.out.println("3. Salir");
			opcionMenu = lector.nextLine();
				
			if (opcionMenu.equals("1")) {	
			System.out.println("No tiene ningun pago pendiente");

			claveIngresada = "0";
		}else if(opcionMenu.equals("2")) {
			
			System.out.println("Ingrese la cuenta de destino:");
			String cuentaDestino = lector.nextLine();
			System.out.println("Ingrese el monto:");
			int montoTransferir = lectorInt.nextInt();
			saldoInicial = saldoInicial - montoTransferir;
			System.out.println("Su nuevo saldo es:"+saldoInicial);
		}
			


			
			
		}while(!opcionMenu.equals("3"));
		claveIngresada = "0";
		System.out.println("Gracias por preferirnos");

	} else {
		System.out.println("La clave no es la correcta");
	}
	
	 while(!claveIngresada.equals("-1"));
	System.out.println("Gracias por preferirnos");
//	System.out.println(variable);

}
}
