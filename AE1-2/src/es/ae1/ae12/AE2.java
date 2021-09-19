package es.ae1.ae12;

import java.util.ArrayList;
import java.util.List;

public class AE2 {

	public static void main(String[] args) {
		String [] arrAlumnos = new String[6];
		arrAlumnos[0] = "Xavi";
		arrAlumnos[1] = "Iván";
		arrAlumnos[2] = "Guillermo";
		arrAlumnos[3] = "Carla";
		arrAlumnos[4] = "Manu";
		arrAlumnos[5] = "Alex";
		System.out.println("Imprimimos array");

			
		for (int i=0; i<arrAlumnos.length;i++) {
			System.out.println(arrAlumnos[i]);
		}
		
		List<String> listaAlumnos = new ArrayList<String>();
		listaAlumnos.add("Xavi");
		listaAlumnos.add("Iván");
		listaAlumnos.add("Guillermo");
		listaAlumnos.add("Carla");
		listaAlumnos.add("Manu");
		listaAlumnos.add("Alex");
		System.out.println("\nImprimimos lista");
		
		for (int j=0; j<listaAlumnos.size();j++) {
			System.out.println(listaAlumnos.get(j));
		}
	
	}

}
