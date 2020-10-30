package com.gor.ModeloVista;

public class Main {
	public static Vista vista;
	public static Modelo modelo;
	public static Controlador control;
	
	public static void main(String args[]) {
		modelo = new Modelo();
		vista = new Vista();
		
		control = new Controlador(modelo, vista);
		vista.setVisible(true);
	}
}
