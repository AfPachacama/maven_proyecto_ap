package tarea.menu.programacion;

import java.util.Scanner;

public class MainLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Esctructura lista = null;
		 Scanner leer = new Scanner(System.in);
		 int opcion= 0;
		 String numero;
		 
		 while(true) {
			 System.out.println("1.Ingresar Estudiante");
			 System.out.println("2. Mostrar Datos");
			 System.out.println("3. Buscar");
			 System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

			 System.out.println("Seleccione su opcion: ");
			 opcion = leer.nextInt();
			 switch(opcion) {
			 case 1:{
				 
				 System.out.println("Ingresar su Nombre,Apellido,Carrera:");
				 numero = leer.next();
//				 System.out.println("Ingresar Apellido:");
//				 numero = leer.next();
				 Esctructura aux = new Esctructura();
				 aux.numero = numero;
				 aux.anterior = lista;
				 lista = aux;
				 System.out.println(" Se Ingreso Correctamente");
				 System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
				 break;

			 }
			 case 2:{
				 if(lista==null) {
					 System.out.println("No Hay Datos Registrados");
				 }else {
					 System.out.println(" Los Datos Registrados son: ");
					 Esctructura aux = lista;
					 while(aux != null) {
					 System.out.println(""+ aux.numero);
					 aux=aux.anterior;
				 }
			 }
	 
			 }
			 break;
			 
			 case 3:
			 {
				 int encontrado= 0;
				 if(lista==null) {
					 System.out.println("No Hay Datos Registrados");
					 break;
				 }
				 else {
				
					 String buscar;
					 System.out.println("Ingrese Nombres");
					 buscar = leer.nextLine();
					 Esctructura aux = lista;
					 while(aux != null) {
						 if(aux.numero == buscar) {
							 System.out.println("Resultado: "+ aux.numero);
							 aux = null;
							 encontrado = 1;
						 }
						 else {
							 aux = aux.anterior;
						 }
					 }
					 
					 
				 }
				 if(encontrado == 0) {
					 System.out.println("No hay Resultados ");
					 
				 }
				 
					 
			 }
				 
		
			 

			 
		 }
		

	}

	}
}
