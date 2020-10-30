package com.gor.practicaArchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class PruebaArchivo {
	
	public static void main(String args[]) {
		ArrayList <String> list = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		try {
			BufferedReader entrada1 = new BufferedReader(new FileReader(
					"C:/Users/dethk/OneDrive/Documentos/Ibero/Semestre 7/Objetos/PracticaArchivo/entrada1.txt"));
			
			list = Archivo.readArray(entrada1);
			for(String txt:list) {
				System.out.println(txt);
			}
			
			entrada1.close();
		}catch(Exception e) {
			System.out.println("Error en lectura de Archivo 1");
		}

		try {
			BufferedReader entrada2 = new BufferedReader(new FileReader(
					"C:/Users/dethk/OneDrive/Documentos/Ibero/Semestre 7/Objetos/PracticaArchivo/entrada2.txt"));
			
			map = Archivo.readHash(entrada2);
			System.out.println(map);
			
			entrada2.close();
		}catch(Exception e) {
			System.out.println("Error en lectura de Archivo 2");
		}
	}
}
