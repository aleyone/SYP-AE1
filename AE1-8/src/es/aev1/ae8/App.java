package es.aev1.ae8;

public class App {
		
	/**
	 * esPrimo: calcula si es primo o no desde el 2 hasta el número que se le pasa
	 * @param numero: se pasa el valor del número
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
	     * Este método calcula si los números que están en el intervalo son o no primos.
	     * @param num1 - parámetro inicial - se recoge del método tiempoEjecución
	     * @param num2 - segundo parámetro - se recoge del método tiempoEjecución
	     */
		public void Intervalo (int num1, int num2) {
			for (int i=num1; i<=num2; i++) {
				if(esPrimo(i)==true) {
					System.out.println("El número "+i+" es primo.");
				} else System.out.println("El número "+i+" no es primo.");
				
			}
		}
		
		/**
		 * tiempoEjecución: recoge fecha antes de la ejecución del método Intervalo y después
		 * @param num1 primer valor del intervalo
		 * @param num2 segundo valor del intervalo
		 * @return devuelve el tiempo de ejecución
		 */
		public long tiempoEjecucion (int num1, int num2) {
			long TiempoInicial = System.currentTimeMillis();
			Intervalo(num1, num2);
			long TiempoFinal=System.currentTimeMillis();
		    long tiempotranscurrido = (TiempoFinal-TiempoInicial);
			
			
			return tiempotranscurrido;
		}
}
