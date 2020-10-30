package com.gor.ModeloVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
	
	private Modelo modelo;
	private Vista vista;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.setModelo(modelo);
		this.setVista(vista);
		Vista.button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Vista.button) {
			String getData = Vista.txta.getText();
			double data = Double.parseDouble(getData);
			
			modelo = new Modelo();
			modelo.setCentigrado(data);
			modelo.CtoF();
			Vista.label2.setText(Double.toString(modelo.getFarenheit()) + " °F");
			
		}
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}

}
