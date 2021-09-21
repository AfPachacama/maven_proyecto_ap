package ejercisios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		
		LocalDate diaHoy= LocalDate.now();
		LocalDate diaFin= LocalDate.now();

		System.out.println(diaHoy);
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Volley Principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);
		
		LocalDate diaHoy2 = LocalDate.now();
		LocalDate diaQueInicio = diaHoy2.minusDays(2);
		LocalDate diaQueFinaliza = diaQueInicio.plusDays(20);


		
		
		
		
		LocalDate fechaEspeciIni = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspeciFin = LocalDate.of(2022, 7, 10);

		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspeciIni);
		curso3.setFechaFin(fechaEspeciFin);
		
		
		LocalDate fechaVista = curso3.getFechaInicio();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		
		
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println("Nombre"+curso3.getNombre());
		System.out.println("F.I "+curso3.getFechaInicio());
		System.out.println("F.F "+curso3.getFechaFin());


		
		
		
		

		


	}

}
