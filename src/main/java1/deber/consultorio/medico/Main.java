package deber.consultorio.medico;


import java.util.Scanner;

public class Main extends Pacientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int opcion;
		do {
			do {
				System.out.println("1. Registrar paciente");
				System.out.println("2. Imprimir Reporte");
				System.out.println("3. Salir");

				System.out.println(" Ingrese una opcion: ");
				opcion = lector.nextInt();

			} while (opcion < 1 || opcion > 4);
			switch (opcion) {
			case 1:
				Scanner lector1 = new Scanner(System.in);
				Scanner tecladoInt = new Scanner(System.in);

				
				System.out.println(" Ingrese datos del pasajero ");
				
				System.out.println(" Ingrese Nombre: ");
				String nombre = lector1.nextLine();
				System.out.println(" Ingrese Apellido: ");
				String apellido = lector1.nextLine();
				System.out.println(" Ingrese Edad: ");
				int edad = tecladoInt.nextInt();
				System.out.println(" Ingrese Sintoma: ");
				String sintoma = lector1.nextLine();
				System.out.println("");

				
				
				Pacientes p1 = new Pacientes();
				p1.setNombre(nombre);
				p1.setApellido(apellido);
				p1.setEdad(edad);
				p1.setSintoma(sintoma);
				
				Pacientes p2 = new Pacientes();
				p2.setNombre(nombre);
				p2.setApellido(apellido);
				p2.setEdad(edad);
				p2.setSintoma(sintoma);
				
				
				Pacientes p3 = new Pacientes();
				p3.setNombre(nombre);
				p3.setApellido(apellido);
				p3.setEdad(edad);
				p3.setSintoma(sintoma);
				
				
				Pacientes fila[] = new Pacientes[3];
				fila[0] = p1;
				fila[1] = p2;
				fila[2] = p3;
				
				int posicion = tecladoInt.nextInt();
				System.out.println(" Reporte de pacientes:"+fila[posicion]);
				
			case 2:
				System.out.println(" Reporte de pacientes:");
				

				break;
			case 3:
				System.out.println(" Clinica San Francisco");
				System.out.println(" Autor: Alex Pachacama ");

				System.exit(0);
				break;

			}

		} while (opcion != 4);

	}
}
