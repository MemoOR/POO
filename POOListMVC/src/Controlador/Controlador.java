package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ConnectPersona;
import Vista.VistaList;

public class Controlador implements ActionListener{
	
	private ConnectPersona modelo = new ConnectPersona();
	private VistaList vista = new VistaList();
	private boolean ComboSet = false;

	//Constructor
	public Controlador(ConnectPersona modelo, VistaList vista) {
		this.setModelo(modelo);
		this.setVista(vista);
		this.vista.button.addActionListener(this);
		this.vista.combo.addActionListener(this);
	}

	//Button Pressed
	public void actionPerformed(ActionEvent e){

		//llenar datos en ComboBox
		if(e.getSource() == this.vista.button){
//			System.out.println("Show names");
			this.vista.txta.selectAll();
			this.vista.txta.replaceSelection("");
			
			if(this.isComboSet() == true) {
				this.vista.combo.removeAllItems();
				this.setComboSet(false);
			}
			if (this.isComboSet() == false){
				for(int i=0; i < modelo.listaPersonas().size(); i++){
					this.vista.combo.addItem(modelo.listaPersonas().get(i).getNombre().toString());
				}
				this.setComboSet(true);
			}

			this.vista.txta.updateUI();
			this.vista.txta.repaint();
		}
		
		//Mostrar datos de la seleccion del combobox en el txtarea
		if(e.getSource() == this.vista.combo) {
//			System.out.println("Combo select");
			this.vista.txta.selectAll();
			this.vista.txta.replaceSelection("");

			for(int i=0; i < modelo.listaPersonas().size(); i++){
				if(modelo.listaPersonas().get(i).getNombre().equals(this.vista.combo.getSelectedItem())) {
					String nombre = modelo.listaPersonas().get(i).getNombre();
					String Pat = modelo.listaPersonas().get(i).getApaterno();
					String Mat = modelo.listaPersonas().get(i).getAMaterno();
					int edad = modelo.listaPersonas().get(i).getEdad();
					
					this.vista.txta.append("Nombre: " + nombre +" "+ Pat +" "+ Mat +"\nEdad: "+ edad);
				}
			}
			
			this.vista.txta.updateUI();
			this.vista.txta.repaint();
		}
	}

	public ConnectPersona getModelo() {
		return modelo;
	}

	public void setModelo(ConnectPersona modelo2) {
		this.modelo = modelo2;
	}

	public VistaList getVista() {
		return vista;
	}

	public void setVista(VistaList vista) {
		this.vista = vista;
	}

	public boolean isComboSet() {
		return ComboSet;
	}

	public void setComboSet(boolean comboSet) {
		ComboSet = comboSet;
	}

}
