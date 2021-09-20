package es.aev1.ae6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AE6 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		app miapp = new app();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe 5 números");
		for (int i=1; i<=5; i++) {
			System.out.print("Número "+i+": ");
			int num=teclado.nextInt();
			numeros.add(num);
		}
		
		System.out.println("Lista: ");
		for (int j=0; j<numeros.size(); j++) {
			
		System.out.print(numeros.get(j)+" ");
		}
		
		System.out.print("\nLista inversa: "+miapp.OrdenaLista(numeros));
		System.out.print("\nSuma lista: "+miapp.SumaLista(numeros));
		
		teclado.close();
	}

}
