package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

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
		
		for(JRadioButton rd : this.vista.sexR) {
			rd.addActionListener(this);
		}
		for(JRadioButton rd : this.vista.sickR) {
			rd.addActionListener(this);
		}
		for(JRadioButton rd : this.vista.deadR) {
			rd.addActionListener(this);
		}
		for(JRadioButton rd : this.vista.ageR) {
			rd.addActionListener(this);
		}
		
	}

	//Button Pressed
	public void actionPerformed(ActionEvent e){
		//obtiene seleccion de ComboBox
		if(e.getSource() == this.vista.combo1){
			this.getVista().dataLabel[0] = this.getVista().combo1.getSelectedItem().toString();
			
			this.vista.Data[0].setText("Población: "+ this.getVista().dataLabel[0]);
			this.vista.Data[0].repaint();
		}
		//Obtiene cada radio button seleccionado
		sexRButtonListeners(e);
		sickRButtonListeners(e);
		deadRButtonListeners(e);
		ageRButtonListeners(e);
	}
	
	//Escucha las acciones de las opciones de sexo
	public void sexRButtonListeners(ActionEvent e) {
		if(e.getSource() == this.vista.sexR[0] || e.getSource() == this.vista.sexR[1] 
				|| e.getSource() == this.vista.sexR[2]) {
			
			if(e.getSource() == this.vista.sexR[0]){
//				System.out.println("Hombre");
				this.getVista().dataLabel[1] = this.getVista().sexR[0].getText();
			}
			if(e.getSource() == this.vista.sexR[1]){
//				System.out.println("Mujer");
				this.getVista().dataLabel[1] = this.getVista().sexR[1].getText();
			}
			if(e.getSource() == this.vista.sexR[2]){
//				System.out.println("Total");
				this.getVista().dataLabel[1] = this.getVista().sexR[2].getText();
			}
			this.vista.Data[1].setText("Sexo: "+ this.getVista().dataLabel[1]);
			this.vista.Data[1].repaint();	
		}
	}
	
	//Escucha las acciones de las opciones de diagnóstico
	public void sickRButtonListeners(ActionEvent e) {
		if(e.getSource() == this.vista.sickR[0] || e.getSource() == this.vista.sickR[1] 
		|| e.getSource() == this.vista.sickR[2] || e.getSource() == this.vista.sickR[3]
		|| e.getSource() == this.vista.sickR[4] || e.getSource() == this.vista.sickR[5]
		|| e.getSource() == this.vista.sickR[6] || e.getSource() == this.vista.sickR[7]) {
			
			if(e.getSource() == this.vista.sickR[0]){
	//			System.out.println("Diabetes");
				this.getVista().dataLabel[2] = this.getVista().sickR[0].getText();
			}
			if(e.getSource() == this.vista.sickR[1]){
	//			System.out.println("EPOC");
				this.getVista().dataLabel[2] = this.getVista().sickR[1].getText();
			}
			if(e.getSource() == this.vista.sickR[2]){
	//			System.out.println("ASMA");
				this.getVista().dataLabel[2] = this.getVista().sickR[2].getText();
			}
			if(e.getSource() == this.vista.sickR[3]){
	//			System.out.println("Hipertensión");
				this.getVista().dataLabel[2] = this.getVista().sickR[3].getText();
			}
			if(e.getSource() == this.vista.sickR[4]){
	//			System.out.println("Cardio");
				this.getVista().dataLabel[2] = this.getVista().sickR[4].getText();
			}
			if(e.getSource() == this.vista.sickR[5]){
	//			System.out.println("Obesidad");
				this.getVista().dataLabel[2] = this.getVista().sickR[5].getText();
			}
			if(e.getSource() == this.vista.sickR[6]){
	//			System.out.println("Tabaquismo");
				this.getVista().dataLabel[2] = this.getVista().sickR[6].getText();
			}
			if(e.getSource() == this.vista.sickR[7]){
	//			System.out.println("Total");
				this.getVista().dataLabel[2] = this.getVista().sickR[7].getText();
			}
			this.vista.Data[2].setText("Diagnóstico: "+ this.getVista().dataLabel[2]);
			this.vista.Data[2].repaint();
		}
	}
	
	//Escucha las acciones de las opciones de estadística
	public void deadRButtonListeners(ActionEvent e) {
		if(e.getSource() == this.vista.deadR[0] || e.getSource() == this.vista.deadR[1] 
				|| e.getSource() == this.vista.deadR[2]) {
			
			if(e.getSource() == this.vista.deadR[0]){
	//			System.out.println("Vivo");
				this.getVista().dataLabel[3] = this.getVista().deadR[0].getText();
			}
			if(e.getSource() == this.vista.deadR[1]){
	//			System.out.println("Muerto");
				this.getVista().dataLabel[3] = this.getVista().deadR[1].getText();
			}
			if(e.getSource() == this.vista.deadR[2]){
	//			System.out.println("Total");
				this.getVista().dataLabel[3] = this.getVista().deadR[2].getText();
			}
			this.vista.Data[3].setText("Estadística: "+ this.getVista().dataLabel[3]);
			this.vista.Data[3].repaint();
		}
	}
	
	//Escucha las acciones de las opciones de edad
	public void ageRButtonListeners(ActionEvent e) {
		if(e.getSource() == this.vista.ageR[0] || e.getSource() == this.vista.ageR[1]) {
			
			if(e.getSource() == this.vista.ageR[0]){
	//			System.out.println("si");
				this.getVista().dataLabel[4] = this.getVista().ageR[0].getText();
			}
			if(e.getSource() == this.vista.ageR[1]){
	//			System.out.println("no");
				this.getVista().dataLabel[4] = this.getVista().ageR[1].getText();
			}
			this.vista.Data[4].setText("Filtro de edad: "+ this.getVista().dataLabel[4]);
			this.vista.Data[4].repaint();
		}
	}
	
	//Inserta datos de entidades en comboBox
	public void fillComboBox() {
		for(int i=0; i < modelo.listaEntidades().size(); i++){
			if(i==0) {
				this.vista.combo1.addItem("TOTAL");
			}
			this.vista.combo1.addItem(modelo.listaEntidades().
					get(i).getEntidad().toString());
		}
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
