package es.aev1.ae8;

import java.util.Scanner;

public class AE8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		App miapp = new App();
		System.out.print("Escribe número 1: ");
		int numero1 = teclado.nextInt();
		System.out.print("Escribe número 2: ");
		int numero2 = teclado.nextInt();
		//miapp.Intervalo(numero1, numero2);
		System.out.print("El tiempo que ha necesitado el método Intervalo es: "+miapp.tiempoEjecucion(numero1, numero2)+" segundos.");


		
		teclado.close();
	}

}
