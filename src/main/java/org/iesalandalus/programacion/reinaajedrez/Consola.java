package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}

	public static void mostrarMenu() {
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("Menu Incial:");
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("1.- Crear reina por defecto");
		System.out.println("2.- Crear reina eligiendo el color");
		System.out.println("3.- Mover");
		System.out.println("4.- Salir");
		System.out.println("");
		System.out.println("-------------------------------------");

	}

	public static int elegirOpcionMenu() {
		int opcion;
		do {
			System.out.println("-------------------------------------");
			System.out.println("Seleccione una opcion");
			System.out.println("-------------------------------------");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);
		System.out.print("Su opción escogida fue: ");
		return opcion;
	}

	public static Color elegirColor() {
		int opcion;
		do {
			System.out.println("-------------------------------------");
			System.out.println("Seleccione una opcion");
			System.out.println("-------------------------------------");
			System.out.println("Opcion 1º-" + Color.BLANCO.toString());
			System.out.println("Opcion 2º-" + Color.NEGRO.toString());
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 2);
		if (opcion == 1) {
			return Color.BLANCO;
		} else {
			return Color.NEGRO;
		}

	}
}