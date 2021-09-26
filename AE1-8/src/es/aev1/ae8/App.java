package es.aev1.ae8;

public class App {
		
	/**
	 * esPrimo: calcula si es primo o no desde el 2 hasta el n�mero que se le pasa
	 * @param numero: se pasa el valor del n�mero
	 * @return devolvemos true o false
	 */
	public boolean esPrimo(int numero) {
			
			int operador =2;
			Boolean primo = true;
			
			while(primo == true && operador !=numero) {
				if(numero % operador == 0)
					primo = false;
					operador++;						
			}
			return primo;
		}
		
	    /** 
	     * Este m�todo calcula si los n�meros que est�n en el intervalo son o no primos.
	     * @param num1 - par�metro inicial - se recoge del m�todo tiempoEjecuci�n
	     * @param num2 - segundo par�metro - se recoge del m�todo tiempoEjecuci�n
	     */
		public void Intervalo (int num1, int num2) {
			for (int i=num1; i<=num2; i++) {
				if(esPrimo(i)==true) {
					System.out.println("El n�mero "+i+" es primo.");
				} else System.out.println("El n�mero "+i+" no es primo.");
				
			}
		}
		
		/**
		 * tiempoEjecuci�n: recoge fecha antes de la ejecuci�n del m�todo Intervalo y despu�s
		 * @param num1 primer valor del intervalo
		 * @param num2 segundo valor del intervalo
		 * @return devuelve el tiempo de ejecuci�n
		 */
		public long tiempoEjecucion (int num1, int num2) {
			long TiempoInicial = System.currentTimeMillis();
			Intervalo(num1, num2);
			long TiempoFinal=System.currentTimeMillis();
		    long tiempotranscurrido = (TiempoFinal-TiempoInicial);
			
			
			return tiempotranscurrido;
		}
}
