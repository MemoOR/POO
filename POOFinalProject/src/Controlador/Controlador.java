package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Modelo.GetDBData;
import Vista.*;

public class Controlador implements ActionListener{
	private GetDBData modelo = new GetDBData();
	private VistaFrame vista = new VistaFrame();
	private boolean ComboSet = false;
	
	//Constructor
	public Controlador(GetDBData modelo, VistaFrame vista) {
		this.setModelo(modelo);
		this.setVista(vista);
		this.fillComboBox();
		this.vista.combo1.addActionListener(this);
	}

	//Button Pressed
	public void actionPerformed(ActionEvent e){

		//llenar datos en ComboBox
		if(e.getSource() == this.vista.combo1){
			
		}
	}
	
	//Inserta datos de  entidades en comboBox
	public void fillComboBox() {
		if(this.isComboSet() == true) {
			this.vista.combo1.removeAllItems();
			this.setComboSet(false);
		}
		if (this.isComboSet() == false){
			for(int i=0; i < modelo.listaEntidades().size(); i++){
				if(i==0) {
					this.vista.combo1.addItem("TOTAL");
				}
				this.vista.combo1.addItem(modelo.listaEntidades().get(i).getEntidad().toString());
			}
			this.setComboSet(true);
		}
		this.getVista().combo1.repaint();
		this.getVista().combo1.updateUI();
	}

	public GetDBData getModelo() {
		return modelo;
	}

	public void setModelo(GetDBData modelo2) {
		this.modelo = modelo2;
	}

	public VistaFrame getVista() {
		return vista;
	}

	public void setVista(VistaFrame vista) {
		this.vista = vista;
	}

	public boolean isComboSet() {
		return ComboSet;
	}
	public void setComboSet(boolean comboSet) {
		ComboSet = comboSet;
	}

}
