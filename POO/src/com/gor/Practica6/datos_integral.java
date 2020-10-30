package com.gor.Practica6;

public class datos_integral {
	private double limInf, limSup, deltax;
	
	public datos_integral(double Inf, double Sup, double D) {
		this.limInf = Inf;
		this.limSup = Sup;
		this.deltax = D;
	}
	
	public double SumaIntegral() {
		double area=0;
		
		for(double i = this.limInf; i <= this.limSup; i += this.deltax) {
			area += (Math.pow(i, 2) + 1)*deltax;
		}
		
		return area;
	}
}
