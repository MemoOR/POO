package Ejecuta;

import Controlador.Controlador;
import Modelo.ConnectPersona;
import Vista.VistaPer;

public class PruebaConn {
	public static VistaPer vista;
	public static ConnectPersona modelo;
	public static Controlador control;
	
	public static void main(String[] args) {
		vista = new VistaPer();
	    modelo  = new ConnectPersona();
	    
	    @SuppressWarnings("unused")
		Controlador cp = new Controlador(modelo, vista);
		vista.setVisible(true);
	}	
}
