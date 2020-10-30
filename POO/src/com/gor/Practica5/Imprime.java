package com.gor.Practica5;

public class Imprime {

	static double distancia2D, distancia3D;
	
	public static void main(String args[]) {
		
		Puntos P1 = new Puntos(5,3);
		Puntos P2 = new Puntos(2,1);
		Puntos P3 = new Puntos(5,3,4);
		Puntos P4 = new Puntos(2,6,7);
		
		distancia2D = Puntos.distanciaDosD(P1, P2);
		System.out.println(distancia2D);
		System.out.println();
		
		distancia3D = Puntos.distanciaTresD(P3, P4);
		System.out.println(distancia3D);
	}
}
