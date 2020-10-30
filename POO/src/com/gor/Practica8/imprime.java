package com.gor.Practica8;

import com.gor.Practica5.Puntos;

public class imprime {

	public static void main(String args[]) {
		double total;
		
		Puntos P1 = new Puntos(3,2);
		Puntos P2 = new Puntos(4,7);
		Puntos P3 = new Puntos(6,9);
		Puntos P4 = new Puntos(12.622,7.158);
		Puntos P5 = new Puntos(16.74,9.858);
		Puntos P6 = new Puntos(19.92,7.158);
		
		Puntos conjuntoPuntos[] = {P1,P2,P3,P4,P5,P6};
		
		total = distanciaSuma.sumaDistancia(conjuntoPuntos);
		
		System.out.println("Distancia total: "+ total);
		
	}

}
