package com.gor.practicaHashMap;

import java.util.HashMap;

public class Enfermedades {
	private int id;
	private String especificacion;
	private double frecuencia;
	
	public Enfermedades(int id, String especificacion, double frecuencia) {
		this.setId(id);
		this.setEspecificacion(especificacion);
		this.setFrecuencia(frecuencia);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEspecificacion() {
		return especificacion;
	}
	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	static HashMap <Integer,String> getMap(Enfermedades[] enfermedad){
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		for(int i=0; i<enfermedad.length;i++) {
			hashMap.put(enfermedad[i].getId(), enfermedad[i].getEspecificacion());
		}
		
		return hashMap;
	}
}
