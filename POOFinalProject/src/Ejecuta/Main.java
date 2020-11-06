package Ejecuta;

import Controlador.Controlador;
import Modelo.GetDBData;
import Vista.VistaFrame;

public class Main {
	public static VistaFrame vista;
	public static GetDBData modelo;
	public static Controlador control;
	
	public static void main(String[] args) {
		vista = new VistaFrame();
	    modelo  = new GetDBData();
	    
	    @SuppressWarnings("unused")
		Controlador cp = new Controlador(modelo, vista);
		vista.setVisible(true);
	}	
}
