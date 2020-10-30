package com.gor.ModeloVista;

public class Modelo {
	private double centigrado;
	private double farenheit;
	
	public Modelo() {
		this.setCentigrado(0);
		this.setFarenheit(0);
	}
	
	public void CtoF() {
		double c = this.getCentigrado();
		double f = (c*1.8) + 32;
		this.setFarenheit(f);
	}

	public double getCentigrado() {
		return centigrado;
	}

	public void setCentigrado(double centigrado) {
		this.centigrado = centigrado;
	}

	public double getFarenheit() {
		return farenheit;
	}

	public void setFarenheit(double farenheit) {
		this.farenheit = farenheit;
	}

}
