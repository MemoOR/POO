package com.gor.Practica4;

public class operaciones {
	private double numero1,numero2,resultado;
	
	public operaciones(double numero1,double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public double suma() {
		resultado = numero1 + numero2;
		return resultado;
	}
	
	public double resta() {
		resultado = numero1 - numero2;
		return resultado;
	}
	
	public double multipliacion() {
		resultado = numero1 * numero2;
		return resultado;
	}
	
	public double division() {
		resultado = numero1 / numero2;
		return resultado;
	}

}
