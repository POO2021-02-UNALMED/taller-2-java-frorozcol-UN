package test;

import java.util.Arrays;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	void asignarTipo(String tipo) {
		String [] valoresAceptados = {"electrico", "gasolina"};
		if(Arrays.asList(valoresAceptados).contains(tipo)) {
			this.tipo = tipo;
		}
	}
}
