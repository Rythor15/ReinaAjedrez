package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
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

	public static void mostrarMenuDirecciones() {
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("Menu incial de direcciones:");
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("1.- Norte");
		System.out.println("2.- Noreste");
		System.out.println("3.- Este");
		System.out.println("4.- Sureste");
		System.out.println("5.- Sur");
		System.out.println("6.- Suroeste");
		System.out.println("7.- Oeste");
		System.out.println("8.- Noroeste");
		System.out.println("");
		System.out.println("-------------------------------------");

	}

	public static Direccion elegirDireccion() {
		int opcion;
		Direccion direccion = null;
		do {
			System.out.println("-------------------------------------");
			System.out.println("Seleccione una opcion");
			System.out.println("-------------------------------------");
			System.out.println("Opcion 1º-" + Direccion.NORTE.toString());
			System.out.println("Opcion 2º-" + Direccion.NOROESTE.toString());
			System.out.println("Opcion 3º-" + Direccion.ESTE.toString());
			System.out.println("Opcion 4º-" + Direccion.SURESTE.toString());
			System.out.println("Opcion 5º-" + Direccion.SUR.toString());
			System.out.println("Opcion 6º-" + Direccion.SUROESTE.toString());
			System.out.println("Opcion 7º-" + Direccion.OESTE.toString());
			System.out.println("Opcion 8º-" + Direccion.NOROESTE.toString());
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 8);
		switch (opcion) {
		case 1:
			direccion = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.NORTE;
			break;
		case 3:
			direccion = Direccion.NORTE;
			break;
		case 4:
			direccion = Direccion.NORTE;
			break;
		case 5:
			direccion = Direccion.NORTE;
			break;
		case 6:
			direccion = Direccion.NORTE;
			break;
		case 7:
			direccion = Direccion.NORTE;
			break;
		case 8:
			direccion = Direccion.NORTE;
			break;
		}
		return direccion;
	}

}