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
		int cant = 0;
		for(Asiento asiento:asientos){
			if(asiento != null){
				cant++;
			}
		}
		return cant;
	}
	
	String verificarIntegridad() {
		String mensaje ="Las piezas no son originales";
		if(registro == motor.registro) {
			for(Asiento asiento:asientos) {
				if(registro != asiento.registro) {
					mensaje = "Las piezas no son originales";
				}
			}
			mensaje = "Auto original";
			return mensaje;
		}
		return mensaje;
	}
}