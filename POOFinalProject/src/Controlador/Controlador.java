package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;
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
		this.vista.combo2.addActionListener(this);
		this.vista.infoButton.addActionListener(this);
		
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
		//obtiene seleccion de ComboBox de entidad
		if(e.getSource() == this.vista.combo1){
			this.getVista().dataLabel[0] = this.getVista().combo1.getSelectedItem().toString();
			
			this.vista.Data[0].setText("Población: " + this.getVista().dataLabel[0]);
			this.vista.Data[0].repaint();
		}

		//Obtiene cada radio button seleccionado
		sexRButtonListeners(e);
		sickRButtonListeners(e);
		deadRButtonListeners(e);
		ageRButtonListeners(e);
		
		//obtiene seleccion de ComboBox de clasificacion
		if(e.getSource() == this.vista.combo2) {
			this.getVista().dataLabel[5] = this.getVista().combo2.getSelectedItem().toString();
			if(this.getVista().dataLabel[5].equals("TOTAL"))
				this.vista.Data[5].setText("Clasificación: " + this.getVista().dataLabel[5]);
			else
				this.vista.Data[5].setText("Clasificación: " + this.getVista().dataLabel[5].charAt(0));
			this.vista.Data[5].repaint();
		}
		
		//obtiene seleccion de ComboBox de clasificacion
		if(e.getSource() == this.vista.infoButton) {
			this.fillInfoTable();
			JOptionPane.showMessageDialog(this.vista, this.vista.scrollPane);
		}
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
	
	//Inserta datos en ambos comboBox
	public void fillComboBox() {
		for(int i=0; i < modelo.listaEntidades().size(); i++){
			if(i==0) {
				this.vista.combo1.addItem("TOTAL");
			}
			this.vista.combo1.addItem(modelo.listaEntidades().
					get(i).getEntidad().toString());
		}
		
		for(int i=0; i < modelo.listaClasificacion().size(); i++){
			if(i==0) {
				this.vista.combo2.addItem("TOTAL");
			}
			this.vista.combo2.addItem((i+1) + ".- " + modelo.listaClasificacion().get(i).getClasificacion().toString());
		}
	}
	
	//llena datos de clasificacion para la tabla de informacion
	public void fillInfoTable() {
		this.vista.data = new String[this.modelo.listaClasificacion().size()][modelo.listaClasificacion().size()];
		
		for(int row = 0; row < this.modelo.listaClasificacion().size(); row++) {
			this.vista.data[row][0] = String.valueOf(modelo.listaClasificacion().get(row).getId());
			this.vista.data[row][1] = String.valueOf(modelo.listaClasificacion().get(row).getClasificacion());
			this.vista.data[row][2] = String.valueOf(modelo.listaClasificacion().get(row).getDescripcion());
		}
		for(int row = 0; row < this.modelo.listaClasificacion().size(); row++) {
			for(int col = 0; col < this.vista.cNames.length; col++) {
				System.out.println(this.vista.data[row][col]);
			}
		}
		this.vista.Tabla = Tables.createTable(this.vista.data, this.vista.cNames);
		this.vista.scrollPane.setViewportView(this.vista.Tabla);
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
