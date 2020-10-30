package com.gor.Practica2;

import java.text.DecimalFormat;

public class prueba {
	public static void main(String[] args) {
		Energias Resultados = new Energias(20,10,15);
		
		DecimalFormat formato = new DecimalFormat("#.##");
		
		System.out.println("Energía cinética: " + formato.format(Resultados.CalcEcinetica()));
		System.out.println("Energía potencial: " + formato.format(Resultados.CalcEpotencial()));
		System.out.println("Energía total: " + formato.format(Resultados.CalcEtotal()));
	}

}
