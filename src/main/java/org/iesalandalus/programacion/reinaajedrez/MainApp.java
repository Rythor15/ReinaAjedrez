package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;
	//Opciones para elegir
	public static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			crearReinaPorDefecto();
			mostrarReina();
			break;// Crear reina por defecto
		case 2:
			crearReinaColor();
			mostrarReina();
			break;// Crear reina eligiendo el color
		case 3:
			try {
				mover();
			} catch (NullPointerException e) {
			}
			mostrarReina();
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
		try {
			reina.mover(Consola.elegirDireccion(), Consola.Pasos());
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	public static void mostrarReina() {
		if (reina != null) {
			System.out.println(reina.toString());
		} else {
			System.out.println("Ninguna reina ha sido creada.");
		}

	}

	public static void main(String[] args) {
		int opcion;

		do {
			Consola.mostrarMenu();
			opcion = Consola.elegirOpcionMenu();
			ejecutarOpcion(opcion);
		} while (opcion != 4);

	}
}
