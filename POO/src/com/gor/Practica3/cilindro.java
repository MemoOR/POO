package com.gor.Practica3;

public class cilindro extends FiguraGeometrica{
	private double radio, altura, area_circulo, area_rectangulo, area_total;
	
	public double pi = 3.1416;
	
	public cilindro(String color, String nombre, double radio, double altura) {
		super(color, nombre);
		this.radio = radio;
		this.altura = altura;
	}
	
	public void muestraArea() {
		System.out.println("Area cilindro: " + this.area_total);
	}
	
	public void calculaArea() {
		this.area_circulo = pi * (radio*radio);
		this.area_rectangulo = altura * (2*pi*radio);
		this.area_total = this.area_circulo + this.area_rectangulo;
	}
}