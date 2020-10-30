package com.gor.Practica3;

public class prueba_figuras {
	
	public static void main(String[] args) {
			
			FiguraGeometrica fig1 = new rectangulo("Azul","Rectángulo", 5, 5);
			fig1.calculaArea();
			fig1.muestraArea();
			System.out.println("-----------");
			
			FiguraGeometrica fig2 = new cilindro("Verde","Cilindro", 10, 5);
			fig2.calculaArea();
			fig2.muestraArea();
			System.out.println("-----------");

			FiguraGeometrica fig3 = new esfera("Rojo","Esfera", 5);
			fig3.calculaArea();
			fig3.muestraArea();
			System.out.println("-----------");
			
			FiguraGeometrica fig4 = new piramideRectangular("Negro","Pirámide rectangular", 5, 5, 5);
			fig4.calculaArea();
			fig4.muestraArea();
			System.out.println("-----------");
		}
	

}
