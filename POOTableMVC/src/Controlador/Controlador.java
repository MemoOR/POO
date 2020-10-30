package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Modelo.ConnectPersona;
import Vista.*;

public class Controlador implements ActionListener{
	private ConnectPersona modelo = new ConnectPersona();
	private VistaFrame vista = new VistaFrame();
	private boolean TableSet = false;
	
	//Constructor
	public Controlador(ConnectPersona modelo, VistaFrame vista) {
		this.setModelo(modelo);
		this.setVista(vista);
		this.vista.button.addActionListener(this);
	}

	//Button Pressed
	public void actionPerformed(ActionEvent e){
//		llenar datos en tabla
		if(e.getSource() == this.vista.button){
			
			if(this.isTableSet() == true) {
				this.vista.panelTabla.removeAll();
				this.setTableSet(false);
			}
			if (this.isTableSet() == false){
				
//				System.out.println("N Columnas:"+modelo.listaColumnas().size());
//				System.out.println(this.modelo.listaPersonas().size());
				
				VistaFrame.data = new String[this.modelo.listaPersonas().size()][modelo.listaColumnas().size()];
				VistaFrame.cNames = new String[modelo.listaColumnas().size()];
				
				for(int i = 0; i < modelo.listaColumnas().size(); i++) {
					VistaFrame.cNames[i] = modelo.listaColumnas().get(i).getColumn();
//					System.out.println(VistaFrame.cNames[i]);
				}
				
				for(int row = 0; row < this.modelo.listaPersonas().size(); row++) {
					VistaFrame.data[row][0] = String.valueOf(modelo.listaPersonas().get(row).getId());
					VistaFrame.data[row][1] = String.valueOf(modelo.listaPersonas().get(row).getNombre());
					VistaFrame.data[row][2] = String.valueOf(modelo.listaPersonas().get(row).getApaterno());
					VistaFrame.data[row][3] = String.valueOf(modelo.listaPersonas().get(row).getAMaterno());
					VistaFrame.data[row][4] = String.valueOf(modelo.listaPersonas().get(row).getEdad());
				}
//				for(int row = 0; row < this.modelo.listaPersonas().size(); row++) {
//					for(int col = 0; col < this.modelo.listaColumnas().size(); col++) {
//						System.out.println(VistaFrame.data[row][col]);
//					}
//				}
				this.vista.Tabla = Tables.createTable(VistaFrame.data, VistaFrame.cNames);
				this.vista.scrollPane.setViewportView(this.vista.Tabla);
				this.vista.panelTabla.add(this.vista.scrollPane);
				
				this.setTableSet(true);
			}

			this.vista.panelTabla.updateUI();
			this.vista.panelTabla.repaint();
		}
	}

	public ConnectPersona getModelo() {
		return modelo;
	}

	public void setModelo(ConnectPersona modelo2) {
		this.modelo = modelo2;
	}

	public VistaFrame getVista() {
		return vista;
	}

	public void setVista(VistaFrame vista) {
		this.vista = vista;
	}

	public boolean isTableSet() {
		return TableSet;
	}

	public void setTableSet(boolean tableSet) {
		TableSet = tableSet;
	}

}
