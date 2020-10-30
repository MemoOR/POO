package com.gor.persona;

import java.util.Arrays;
import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String puesto;
	public int edad;
	
	public Persona(String nombre,  int edad, String puesto) {
		this.setNombre(nombre);
		this.edad=edad;
		this.setPuesto(puesto);
	}
	
	public static String[] mayores(Persona[] personas) {
		int size=0,x=0;
		for(int i=0;i<personas.length;i++) {
			if(personas[i].edad >= 60) {
				size++;
			}
		}

		String[] nombres = new String[size];	
		
		for(int i=0; i<=personas.length-1; i++) {
			if(personas[i].edad >= 60) {
				nombres[x]=personas[i].getNombre();
				x++;
			}
		}
		
		return nombres;
	}
	
	public static int[] ordenaEdad(Persona[] personas) {
		int size=0,x=0;
		for(int i=0;i<personas.length;i++) {
			size++;
		}

		int[] edades = new int[size];	
		
		for(int i=0; i<personas.length; i++) {
			edades[x]=personas[i].edad;
			x++;
		}
		Arrays.sort(edades);
		
		return edades;
	}
	
	public static ArrayList<String> encuentraPuesto(Persona[] persona, String puesto) {
		ArrayList <String> nombres = new ArrayList<>();
		
		for(Persona txt:persona) {
			System.out.println(txt.getPuesto());
			if(txt.getPuesto().equals(puesto)) {
				nombres.add(txt.getNombre());
			}
		}
		return nombres;
	}
	
	public static ArrayList<Persona> recibeValoresGUI(String nombre, int edad, String puesto) {
		ArrayList <Persona> personas = new ArrayList<>();
		
		Persona datos = new Persona(nombre, edad, puesto);
		
		personas.add(datos);
		
		return personas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}
