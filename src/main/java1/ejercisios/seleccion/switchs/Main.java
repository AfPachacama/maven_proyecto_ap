package ejercisios.seleccion.switchs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
        String opcion;



		do {
		System.out.println("Escoja una opción");
		System.out.println("1. Realizar Transferencia");
		System.out.println("2. Consultar pagos");
		System.out.println("3. SALIR");
		opcion = teclado.nextLine();
		// El switch hasta antes de la version 1.7,solo funcionaba para byte, short, char e int
		 
		switch (opcion) {



		case "1":
		System.out.println("Ingrese número de cuenta");
		System.out.println();
		break;
        case "2":
		System.out.println("No existen pagos");
		System.out.println();
		break;
        case "3":
		System.out.println("Cerrando el sistema");
		System.out.println();
		break;

		default:
		System.out.println("No ha elegido ninguna opción válida");
		System.out.println();
		break;
		}
		

		} while (!opcion.equals ("3"));
		System.out.println("gracias por preferirnos");
		}


}
		
		
		