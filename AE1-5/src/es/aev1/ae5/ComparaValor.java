package es.aev1.ae5;

import java.util.List;

public class ComparaValor {
	
	int menor, maxmenor;
	
	public int CualMenor (List<Integer> numeros) {
		
		for(int k=0; k<numeros.size(); k++) {
			for(int l=1; l<k;l++) {
				if(numeros.get(k)<numeros.get(l)) {
					menor=numeros.get(k);
				} else if(numeros.get(l)<numeros.get(k)) {
					menor=numeros.get(l);
				}
				
				if (menor < maxmenor) {
					maxmenor=menor;
				}
			}
		}
		
		return maxmenor;
	}

}
