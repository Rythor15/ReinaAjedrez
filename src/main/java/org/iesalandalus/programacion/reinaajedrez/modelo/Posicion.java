package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna;
	
	//Constructor Copia
	public Posicion(Posicion posicion) {
		fila = posicion.getFila();
		columna = posicion.getColumna();
	}

	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila <= 0 || fila > 8) {
			throw new IllegalArgumentException("La fila no tiene un valor adecuado");
		}
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if (columna <= 'a' || columna > 'h') {
			throw new IllegalArgumentException("La columna no tiene un valor adecuado");
		}
		this.columna = columna;
	}

	public Posicion(int fila, char columna) {
		if (columna <= 'a' || columna > 'h' || fila <= 0 || fila > 8) {
			throw new IllegalArgumentException("La columna o la fila introducida no tiene un valor adecuado");
		}
		setFila(fila);
		setColumna(columna);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}
	
}
