package com.gor.Practica5;

public class Puntos {
	private double X, Y, Z;
	
	public Puntos(double X, double Y) {
		this.X = X;
		this.Y = Y;
	}
	public Puntos(double X, double Y, double Z) {
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}
	
	public static double distanciaDosD(Puntos P1, Puntos P2) {
		double x1,y1,x2,y2,distancia;
		
		x1=P1.X;x2=P2.X;
		y1=P1.Y;y2=P2.Y;
		
		distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Distancia entre los puntos: ("+P1.X+","+P1.Y+") ("+P2.X+","+P2.Y+"): " + distancia);
		return distancia;
	}
	
	static double distanciaTresD(Puntos P1, Puntos P2) {
		double x1,y1,z1,x2,y2,z2,distancia;
		
		x1=P1.X;x2=P2.X;
		y1=P1.Y;y2=P2.Y;
		z1=P1.Z;z2=P2.Z;
		
		distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)+Math.pow(z2-z1,2));
		System.out.printf("Distancia entre los puntos: ("+P1.X+","+P1.Y+","+P1.Z+") ("+P2.X+","+P2.Y+","+P2.Z+"): ");
		return distancia;
	}
}
