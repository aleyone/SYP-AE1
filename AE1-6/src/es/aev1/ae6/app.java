package es.aev1.ae6;

import java.util.ArrayList;
import java.util.List;

public class app {
	
	/**
	 * OrdenaLista reordena la lista a la inversa creando una copia del array
	 * @param numeros pasamos la lista de enteros
	 * @return devolvemos la copia de la lista ordenada a la inversa
	 */
	public List<Integer> OrdenaLista (List<Integer> numeros){
		List<Integer> copialista = new ArrayList<Integer>();
		for (int k=numeros.size()-1;k>=0; k--) {
			copialista.add(numeros.get(k));
		}
		
		return copialista;
	}
	
	/**
	 * SumaLista: suma valores de la lista de enteros
	 * @param numeros: se recoge la lista de enteros
	 * @return devuelve la suma
	 */
	public int SumaLista (List <Integer> numeros) {
		int suma=0;
		for (int l=0; l<numeros.size(); l++) {
			suma=suma+numeros.get(l);
		}
		
		return suma;
	}

}
