package es.aev1.ae6;

import java.util.ArrayList;
import java.util.List;

public class app {
	
	public List<Integer> OrdenaLista (List<Integer> numeros){
		List<Integer> copialista = new ArrayList<Integer>();
		for (int k=numeros.size()-1;k>=0; k--) {
			copialista.add(numeros.get(k));
		}
		
		return copialista;
	}
	
	public int SumaLista (List <Integer> numeros) {
		int suma=0;
		for (int l=0; l<numeros.size(); l++) {
			suma=suma+numeros.get(l);
		}
		
		return suma;
	}

}
