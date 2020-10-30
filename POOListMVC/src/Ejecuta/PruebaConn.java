package Ejecuta;

import Controlador.Controlador;
import Modelo.ConnectPersona;
import Vista.VistaList;

public class PruebaConn {
	public static VistaList vista;
	public static ConnectPersona modelo;
	public static Controlador control;
	
	public static void main(String[] args) {
		vista = new VistaList();
	    modelo  = new ConnectPersona();
	    
	    @SuppressWarnings("unused")
		Controlador cp = new Controlador(modelo, vista);
		vista.setVisible(true);
	}	
}
