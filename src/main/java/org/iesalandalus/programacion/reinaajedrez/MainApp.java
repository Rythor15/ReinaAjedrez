package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

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
			mover();
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

	public static void mover() {
		Consola.mostrarMenuDirecciones();
		Consola.elegirDireccion();
		try {
			reina.mover(null, 0);
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
	}
}
