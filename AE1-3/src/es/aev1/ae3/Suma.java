package es.aev1.ae3;

public class Suma {

	public int Calcula (int parametro) {
		int suma=0;
		
		if (parametro%2==0) {
			while (parametro!=0) {
				suma=suma+parametro;
				parametro=parametro-2;
			}
		} else if (parametro%2!=0) {
			parametro--;
			while (parametro!=0) {
				suma=suma+parametro;
				parametro=parametro-2;
			}	
		}
		
		return suma;
	}
}