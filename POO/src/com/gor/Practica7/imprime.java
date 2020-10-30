package com.gor.Practica7;

public class imprime {
	public static void main(String ars[]) {
			double area1,area2=0,area3=0,area4,areaTotal;
			
			calculo areaF1 = new calculo(-1.5,2.3,0.001);
			calculo areaF2 = new calculo(-4,6,0.001);
			calculo areaF3 = new calculo(0,6,0.001);
			calculo areaF4 = new calculo(0,3,0.001);
			
			area1 = areaF1.funcion1();
			System.out.println();
			
			try {
				area2 = areaF2.funcion2();
				System.out.println();
			} catch(Exception e1){
				System.out.println("Límite inferior menor a 3");
				System.out.println("Tipo: " +e1.toString());
				System.out.println();
			} finally {
			}
			
			try {
				area3 = areaF3.funcion3();
				System.out.println();
			} catch(Exception e1){
				System.out.println("Integral fuera del dominio de la función");
				System.out.println("Tipo: " +e1.toString());
				System.out.println();
			} finally {
			}
			
			area4 = areaF4.funcion4();
			System.out.println();
			
			areaTotal = calculo.areaTotal(area1,area2,area3,area4);
			
			System.out.print("El área aproximada debajo de la curva es: " +areaTotal);
		}
}
