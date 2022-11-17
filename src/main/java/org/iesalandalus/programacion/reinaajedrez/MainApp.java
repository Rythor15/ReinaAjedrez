package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;

	public static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			crearReinaPorDefecto();
			break;// Crear reina por defecto
		case 2:
			crearReinaColor();
			break;// Crear reina eligiendo el color
		case 3:
			break;// Mover
		case 4:
			Consola.despedirse();
			break;// Salir
		}
	}
	
	public static void crearReinaPorDefecto() {
		reina = new Reina();
	}
	public static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());
	}
	
	
	
	

	public static void main(String[] args) {
	}
}
