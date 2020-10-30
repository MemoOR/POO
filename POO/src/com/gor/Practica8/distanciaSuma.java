package com.gor.Practica8;

import com.gor.Practica5.Puntos;

public class distanciaSuma {

	static double sumaDistancia(Puntos[] P) {
		double distanciaTotal=0;
		
		for(int i=0; i<=P.length-2; i++) {
			distanciaTotal += Puntos.distanciaDosD(P[i], P[i+1]);
			System.out.println("Distancia acumulada: " +distanciaTotal);
			System.out.println();
		}
		
		return distanciaTotal;
	}
}
