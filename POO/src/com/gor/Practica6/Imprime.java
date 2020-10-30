package com.gor.Practica6;

import java.util.Scanner;

public class Imprime {
	
	public static void main(String ars[]) {
		
		Scanner datos = new Scanner(System.in);
	    
		double limInf,limSup,delta,area;
		
		System.out.println("Ingresa Limite inferior: ");
		limInf = datos.nextDouble();
		
		System.out.println("Ingresa Limite superior: ");
		limSup = datos.nextDouble();
		
		System.out.println("Ingresa Delta de X: ");
		delta = datos.nextDouble();
		
		datos_integral Area = new datos_integral(limInf,limSup,delta);
		area = Area.SumaIntegral();
		
		System.out.print("El área aproximada debajo de la curva es: " +area );
	}
}
