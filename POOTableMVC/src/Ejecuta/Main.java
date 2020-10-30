package Ejecuta;

import Controlador.Controlador;
import Modelo.ConnectPersona;
import Vista.VistaFrame;

public class Main {
	public static VistaFrame vista;
	public static ConnectPersona modelo;
	public static Controlador control;
	
	public static void main(String[] args) {
		vista = new VistaFrame();
	    modelo  = new ConnectPersona();
	    
	    @SuppressWarnings("unused")
		Controlador cp = new Controlador(modelo, vista);
		vista.setVisible(true);
	}	
}
