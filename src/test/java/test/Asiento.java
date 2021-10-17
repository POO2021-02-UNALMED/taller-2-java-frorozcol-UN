package test;

import java.util.Arrays;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		String [] valoresAceptados = {"rojo", "verde", "amarillo", "negro", "blanco"};
		if(Arrays.asList(valoresAceptados).contains(color)) {
			this.color = color;
		}
	}
}
