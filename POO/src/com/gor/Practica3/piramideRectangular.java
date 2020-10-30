package com.gor.Practica3;

public class piramideRectangular extends FiguraGeometrica{
	private double rectan_A, rectan_B, altura, A, B, C, area;
	
	public piramideRectangular(String color, String nombre, double rectan_A, double rectan_B,
			double altura) {
		super(color, nombre);
		this.rectan_A = rectan_A;
		this.rectan_B = rectan_B;
		this.altura = altura;
	}
	
	public void muestraArea() {
		System.out.println("Area pirámide: " + this.area);
	}
	
	public void calculaArea() {
		this.A = rectan_A * rectan_B;
		this.B = rectan_A * Math.sqrt(altura*altura + (rectan_B*rectan_B)/4);
		this.C = rectan_B * Math.sqrt(altura*altura + (rectan_A*rectan_A)/4);
		this.area = A + B + C;
	}
}
