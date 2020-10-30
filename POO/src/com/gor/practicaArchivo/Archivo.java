package com.gor.practicaArchivo;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Archivo {
	
	public static ArrayList<String> readArray(BufferedReader archivo) {
		String linea;
		ArrayList <String> text = new ArrayList<>();
		
		try {
			while((linea = archivo.readLine()) != null) {
				text.add(linea);
			}
		} catch (Exception e) {
			System.out.println("Error de lectura");
		}
		
		return text;
	}
	
	public static HashMap <Integer,String> readHash(BufferedReader archivo){
		String ids,nombre,linea;
		int id;
		HashMap<Integer, String> text = new HashMap<Integer, String>();
		
		try {
			while((linea = archivo.readLine()) != null) {
				ids = linea.substring(0,3);
				nombre = linea.substring(3);
				id = Integer.parseInt(ids);
				text.put(id, nombre);
			}
		} catch (Exception e) {
			System.out.println("Error de lectura");
		}
		
		return text;
	}
}
