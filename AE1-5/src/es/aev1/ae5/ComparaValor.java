package es.aev1.ae5;

import java.util.List;

public class ComparaValor {
	
	int max=0;
	
	public int CualMenor (List<Integer> numeros) {
		
		for(int k=0; k<numeros.size(); k++) {
			if(numeros.get(k)>max) {
				max=numeros.get(k);
			}
		}
		
		return max;
	}

}
