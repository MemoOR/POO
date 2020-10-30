package com.gor.practicaHashMap;

import java.util.HashMap;

public class Imprime {
	
	public static void main(String args[]) {
		
		Enfermedades hipertension = new Enfermedades(1,"Hipertensión",1000);
		Enfermedades diabetes = new Enfermedades(2,"Diabetes",1300);
		Enfermedades obesidad = new Enfermedades(3,"Obesidad",5200);
		Enfermedades enfermedad[] = {hipertension,diabetes,obesidad};
		
		HashMap<Integer, String> getData = new HashMap<Integer, String>();
		
		getData = Enfermedades.getMap(enfermedad);
		
		for(int i:getData.keySet()) {
			System.out.println(i);
		}
		for(String i:getData.values()) {
			System.out.println(i);
		}
		
		System.out.println(getData);
	}
}
