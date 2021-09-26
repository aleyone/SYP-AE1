package es.aev1.ae7;

public class App {

	/**
	 * clasificaTrabajador: devuelve un String con la categoría y sueldo de un
	 * trabajador
	 * 
	 * @param anyos: se recoge experiencia
	 * @return devuelve categoría y sueldo
	 */
	public String clasificaTrabajador(int anyos) {
		String respuesta;
		if (anyos <= 1) {
			respuesta = "Desarrollador Junior L1 – 15000-18000";
		} else if (anyos > 1 && anyos <= 2) {
			respuesta = "Desarrollador Junior L2 – 18000-22000";
		} else if (anyos > 2 && anyos <= 5) {
			respuesta = "Desarrollador Senior L1 – 22000-28000";
		} else if (anyos > 5 && anyos <= 8) {
			respuesta = "Desarrollador Senior L2 – 28000-36000";
		} else
			respuesta = "Analista / Arquitecto. Salario a convenir en base a rol";

		return respuesta;
	}
}
