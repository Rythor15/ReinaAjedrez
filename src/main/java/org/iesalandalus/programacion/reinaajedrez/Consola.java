package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}

	public void mostrarMenu() {
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

	public int elegirOpcionMenu() {
		int opcion;
		do {
			System.out.println("-------------------------------------");
			System.out.println("Seleccione una opcion");
			System.out.println("-------------------------------------");
			opcion = Entrada.entero();
		} while (opcion < 1 && opcion > 4);
		System.out.print("Su opción escogida fue: ");
		return Entrada.entero();
	}

}