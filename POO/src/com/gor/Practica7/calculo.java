package com.gor.Practica7;

public class calculo {
	private double limInf, limSup, deltax;
		
		public calculo(double Inf, double Sup, double D) {
			this.limInf = Inf;
			this.limSup = Sup;
			this.deltax = D;
		}
		
		public double funcion1() {
			double area=0;
			
			for(double i = this.limInf; i <= this.limSup; i += this.deltax) {
				area += (Math.pow(i, 2) + 1)*deltax;
			}
			System.out.println("Área función 1: " +area);
			return area;
		}
		
		public double funcion2() throws Exception{
			double area=0;
			
			if(this.limInf < 3) {
				throw new ArithmeticException("Error funcion2");
			}else {
				for(double i = this.limInf; i <= this.limSup; i += this.deltax) {
					area += (Math.sqrt(i + 3))*deltax;
				}
				System.out.println("Área función 2: " +area);
				return area;
			}
		}
		
		public double funcion3() throws Exception{
			double area=0;
			
			if((this.limInf > -Math.sqrt(3) && this.limInf < Math.sqrt(3)) || (this.limSup > -Math.sqrt(3) && this.limSup < Math.sqrt(3))) {
				throw new ArithmeticException("Error funcion3");
			}else {
				for(double i = this.limInf; i <= this.limSup; i += this.deltax) {
					area += (Math.sqrt(Math.pow(i, 2)-3))*deltax;
				}
			}
			System.out.println("Área función 3: " +area);
			return area;
		}
		
		public double funcion4() {
			double area=0;
			
			for(double i = this.limInf; i <= this.limSup; i += this.deltax) {
				area += (i)*deltax;
			}
			System.out.println("Área función 4: " +area);
			return area;
		}
		
		static double areaTotal(double ... area) {
			double areaTotal=0;
			
			for (double i:area) {
				areaTotal += i;
			}
			return areaTotal;
		}
}
