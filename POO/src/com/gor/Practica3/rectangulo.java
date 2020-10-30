package com.gor.Practica3;

public class rectangulo extends FiguraGeometrica{
	private double base, altura, area;
	
	public rectangulo(String color, String nombre, double base, double altura) {
		super(color, nombre);
		this.base = base;
		this.altura = altura;
	}
	
	public void muestraArea() {
		System.out.println("Area rectángulo: " + this.area);
	}
	
	public void calculaArea() {
		this.area = base * altura;
	}
}
