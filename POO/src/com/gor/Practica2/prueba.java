package com.gor.Practica2;

import java.text.DecimalFormat;

public class prueba {
	public static void main(String[] args) {
		Energias Resultados = new Energias(20,10,15);
		
		DecimalFormat formato = new DecimalFormat("#.##");
		
		System.out.println("Energ�a cin�tica: " + formato.format(Resultados.CalcEcinetica()));
		System.out.println("Energ�a potencial: " + formato.format(Resultados.CalcEpotencial()));
		System.out.println("Energ�a total: " + formato.format(Resultados.CalcEtotal()));
	}

}
