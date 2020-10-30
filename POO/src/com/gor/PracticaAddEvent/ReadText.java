package com.gor.PracticaAddEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.gor.persona.Persona;


public class ReadText implements ActionListener{

	public void actionPerformed(ActionEvent readEvent) {
		
		if(readEvent.getSource() == Panel3.button) {
			int i=0;
			try {
				String nombre = Panel1.Areas[0].getText();
				i++;
				int edad = Integer.parseInt(Panel1.Areas[1].getText());
				i++;
				String puesto = Panel1.Areas[2].getText();
				
				ArrayList<Persona> datos = Persona.recibeValoresGUI(nombre,edad,puesto);
				
				Panel3.Obs.setText(datos.get(0).getNombre() + "    " + datos.get(0).edad 
						+ "    " + datos.get(0).getPuesto());
			
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Introduce datos válidos: " + Panel1.Areas[i].getText().toString(),
						"Error de entrada", JOptionPane.ERROR_MESSAGE);
			}
		}	
	}
}
