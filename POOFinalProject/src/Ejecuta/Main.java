package Ejecuta;

import Controlador.Controlador;
import Modelo.GetDBData;
import Vista.VistaFrame;

public class Main {
	public static VistaFrame vista = new VistaFrame();
	public static GetDBData modelo = new GetDBData();
	public static Controlador control;
	
	public static void main(String[] args) {
//		vista = new VistaFrame();
//	    modelo  = new GetDBData();
	    
	    @SuppressWarnings("unused")
		Controlador cp = new Controlador();
		vista.setVisible(true);
	}	
}
