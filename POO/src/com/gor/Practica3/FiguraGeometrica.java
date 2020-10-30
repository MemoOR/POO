package com.gor.Practica3;

public class FiguraGeometrica {
	protected String color, nombre;
	
	public FiguraGeometrica(String color, String nombre) {
		this.color = color;
		this.nombre = nombre;
	}
	
	public void muestraArea() {
		System.out.println("Depende de la figura");
	}
	
	public void calculaArea() {
		System.out.println("Area");
	}
}
