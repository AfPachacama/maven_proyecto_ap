package ejercisios.nonacces.finall;

public class EstudianteOdontologia extends EstudianteMedicina {

//	No se puede sobreescribir un metodo final del padre
	protected void realizarPracticas() {

		System.out.println(" Realizar 100 horas practica");

	}

	protected void realizarPasantias() {
		System.out.println(" Realizar 200 horas pasantias ");

	}
}
