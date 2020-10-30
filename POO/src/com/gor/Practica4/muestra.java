package com.gor.Practica4;

public class muestra {
	
	public static void main(String args[]) {
		
		double suma,resta,multiplicacion,division;
		
		operaciones objeto = new operaciones(25,3.3);
		suma = objeto.suma();
		resta = objeto.resta();
		multiplicacion = objeto.multipliacion();
		division = objeto.division();
		
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicación: " + multiplicacion);
		System.out.println("División: " + division);
	}

}
