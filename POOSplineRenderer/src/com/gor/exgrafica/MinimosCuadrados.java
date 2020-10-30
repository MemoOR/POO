package com.gor.exgrafica;

import java.util.ArrayList;

import com.gor.PracticaTable.Coordenada;

public class MinimosCuadrados {
	
	private String formula;
	
	private double sumX;
	private double sumY;
	private double sumXY;
	private double sumX2;
	private double n;
	private double m, b;
	
	public MinimosCuadrados(ArrayList<Coordenada> data) {
		this.setSumX(0);
		this.setSumY(0);
		this.setSumXY(0);
		this.setSumX2(0);
		this.setN(Frame.table.getModel().getRowCount());
		
		
		//Obtiene valores para realizar el metodo
		for(int i = 0; i < Frame.table.getModel().getRowCount(); i++) {
			this.setSumX(this.getSumX() + data.get(i).getXx());
			this.setSumY(this.getSumY() + data.get(i).getYy());
			this.setSumXY(this.getSumXY() + data.get(i).getXx() * data.get(i).getYy());
			this.setSumX2(this.getSumX2() + Math.pow(data.get(i).getXx(), 2));
		}
		
		this.setM(((this.getN() * this.getSumXY()) - (this.getSumX() * this.getSumY()))
				/ ((this.getN() * this.getSumX2()) - Math.pow(Math.abs(this.getSumX()), 2)));
		
		this.setB(((this.getSumY() * this.getSumX2()) - (this.getSumX() * this.getSumXY()))
				/ ((this.getN() * this.getSumX2()) - Math.pow(Math.abs(this.getSumX()), 2)));
		
		//Realiza el string para la formula de la gráfica
		this.setFormula("Y = " + String. format("%.2f",this.getM()) + 
				"X + " + String. format("%.2f", this.getB()));
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public double getSumX() {
		return sumX;
	}

	public void setSumX(double sumX) {
		this.sumX = sumX;
	}

	public double getSumY() {
		return sumY;
	}

	public void setSumY(double sumY) {
		this.sumY = sumY;
	}

	public double getSumXY() {
		return sumXY;
	}

	public void setSumXY(double sumXY) {
		this.sumXY = sumXY;
	}

	public double getSumX2() {
		return sumX2;
	}

	public void setSumX2(double sumX2) {
		this.sumX2 = sumX2;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
}
