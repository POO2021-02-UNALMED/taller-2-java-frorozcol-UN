package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		return asientos.length;
	}
	
	String verificarIntegridad() {
		for (Asiento asiento : asientos) {
			if (!((registro == motor.registro)&&(registro == asiento.registro))) {
				String mensaje = "Las piezas no son originales";
				return  mensaje;
			}
		}
		String mensaje = "Las piezas no son originales";
		return mensaje;
	}
}
