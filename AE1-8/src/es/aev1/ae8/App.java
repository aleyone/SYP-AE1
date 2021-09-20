package es.aev1.ae8;

public class App {
		
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
		
		public void Intervalo (int num1, int num2) {
			for (int i=num1; i<=num2; i++) {
				if(esPrimo(i)==true) {
					System.out.println("El número "+i+" es primo.");
				} else System.out.println("El número "+i+" no es primo.");
				
			}
		}
		
		
		public long tiempoEjecucion (int num1, int num2) {
			long TiempoInicial = System.currentTimeMillis();
			Intervalo(num1, num2);
			long TiempoFinal=System.currentTimeMillis();
		    long tiempotranscurrido = (TiempoFinal-TiempoInicial)/1000;
			
			
			return tiempotranscurrido;
		}
}
