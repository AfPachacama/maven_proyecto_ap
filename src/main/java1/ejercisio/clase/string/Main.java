package ejercisio.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. contains
		String: una clase utilitaria para el manejo de cadenas
		String frase = "El que madruga Dios le ayuda ";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese Una Palabra");
		String palabra = teclado.nextLine();
		
		
		boolean resultado = frase.contains("Dios");
		System.out.println(resultado);
		
		
		
//		2. Equals
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
		String cadena1= "Alex";
		System.out.println("Ingrese la segunda cadena a comparar: ");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: "+resultado2);

//		3 y 4 Upper Lower
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
		String nombre= "alex fernando";
		String nombreEnMayuscula=nombre.toUpperCase();
		System.out.println("Nombre En Mayuscula: "+nombreEnMayuscula);

		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
		String nombre2= "ALEX FERNANDO";
		String nombreEnMinuscula=nombre2.toLowerCase();
		System.out.println("Nombre En Mayuscula: "+nombreEnMinuscula);

	}

}
