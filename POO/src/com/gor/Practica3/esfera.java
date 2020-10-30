package com.gor.Practica3;

public class esfera extends FiguraGeometrica{
	private double radio, area;
	
	public double pi = 3.1416;
	
	public esfera(String color, String nombre, double radio) {
		super(color, nombre);
		this.radio = radio;
	}
	
	public void muestraArea() {
		System.out.println("Area esfera: " + this.area);
	}
	
	public void calculaArea() {
		this.area = 4 * pi * radio * radio;
	}
}
