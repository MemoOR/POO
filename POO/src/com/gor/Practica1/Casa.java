package com.gor.Practica1;

public class Casa {
	private int npuertas;
	private int nventanas;
	private String color;
	
	public void abrirVentanas() {
		System.out.println("Ventanas abiertas");
	}

	public void cerrarVentanas() {
		System.out.println("Ventanas cerradas");
	}
	
	public int getNpuertas() {
		return npuertas;
	}
	
	public int getNventanas() {
		return nventanas;
	}
	
	public String getColor() {
		return color;
	}

	public void setNpuertas(int npuertas) {
		this.npuertas = npuertas;
	}

	public void setNventanas(int nventanas) {
		this.nventanas = nventanas;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
