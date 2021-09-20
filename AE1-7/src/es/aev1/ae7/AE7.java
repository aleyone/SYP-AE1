package es.aev1.ae7;

import java.util.Scanner;

public class AE7 {

	public static void main(String[] args) {
		App miapp = new App();
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime tu nombre: ");
		String nombre=teclado.nextLine();
		System.out.print("Dime tus años de experiencia: ");
		int anyos = teclado.nextInt();
		
		System.out.println("Hola "+nombre);
		System.out.print("Tu salario: "+miapp.ClasificaTrabajador(anyos));
		teclado.close();
	}

}
