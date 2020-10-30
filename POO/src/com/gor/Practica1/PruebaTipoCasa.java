package com.gor.Practica1;

public class PruebaTipoCasa {
	
	public static void main(String[] args) {
		
		CasaChalet chalet1 = new CasaChalet();
		chalet1.setNpuertas(5);
		chalet1.setNventanas(15);
		chalet1.setColor("Azul");
		chalet1.setmJardin("SI");
		chalet1.setasador("SI");
		
		System.out.println("La casa chalet1 tiene: " + chalet1.getNpuertas() + " puertas");
		System.out.println("La casa chalet1 tiene: " + chalet1.getNventanas() + " ventanas");
		System.out.println("La casa chalet1 es de color: " + chalet1.getColor());
		System.out.println("La casa chalet1: " + chalet1.getmJardin() + " tiene jardín");
		System.out.println("La casa chalet1: " + chalet1.getasador() + " tiene asador");
	}
}
