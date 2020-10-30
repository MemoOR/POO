package com.gor.Practica2;

public class Energias {
	private int velocidad, masa, altura;
	private double Ecinetica, Epotencial, Etotal;
	private double gravedad = 9.81;
	
	public Energias(int velocidad, int masa, int altura) {
		this.velocidad = velocidad;
		this.masa = masa;
		this.altura = altura;
	}
	
	public double CalcEcinetica() {
		Ecinetica = 0.5* masa*(velocidad*velocidad);
		return Ecinetica;
	}
	public double CalcEpotencial() {
		Epotencial = masa*gravedad*altura;
		return Epotencial;
	}
	public double CalcEtotal() {
		Etotal = Ecinetica + Epotencial;
		return Etotal;
	}
}
