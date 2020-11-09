/* @file Main.java
*  @brief Se encarga de inicializar el controlador, el modelo y 
*  la vista del programa
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

package Ejecuta;

import Controlador.Controlador;
import Modelo.GetDBData;
import Vista.VistaFrame;

public class Main {
	public static VistaFrame vista = new VistaFrame();
	public static GetDBData modelo = new GetDBData();
	public static Controlador control;
	
	public static void main(String[] args) {
	    @SuppressWarnings("unused")
		Controlador cp = new Controlador();
		vista.setVisible(true);
	}	
}
