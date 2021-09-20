package es.aev1.ae5;

import java.util.ArrayList;
import java.util.List;

public class AE5 {

	public static void main(String[] args) {
		int num;
		List<Integer> valores = new ArrayList<Integer>();
		ComparaValor micomparador = new ComparaValor();
		for (int i=0; i<10; i++) {
			num = (int) (Math.random()*10);
			valores.add(num);
		}
		
		System.out.println("Lista: ");
		for (int j=0; j<valores.size(); j++) {
			
		System.out.print(valores.get(j)+" ");
		}
		
		System.out.print("El número menor de la lista es: "+micomparador.CualMenor(valores));

	}
}