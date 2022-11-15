package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	
		private Color color;
		private Posicion posicion;
		
		
		
		public Color getColor() {
			return color;
		}
		public Posicion getPosicion() {
			return posicion;
		}
		
		private void setColor(Color color) {
			if (color == null) {
				throw new NullPointerException("ERROR: No es posible copiar un color nula.");
			}
			this.color = color;
		}
		private void setPosicion(Posicion posicion) {
			this.posicion = posicion;
		}
		
		public Reina() {
			color = Color.BLANCO;
			posicion = new Posicion(1,'d');
			
		}
		
	}

