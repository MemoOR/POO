package com.gor.exgrafica;

import javax.swing.JPanel;

import com.gor.PracticaTable.Panel1;
import com.gor.PracticaTable.Panel2;
import com.gor.PracticaTable.Panel3;

import java.awt.GridLayout;

public class PanelTabla extends JPanel {
	private static final long serialVersionUID = 1L;
	
	static Panel2 panelTable;
	static Panel3 panel3;
	static Panel1 panel1;

	public PanelTabla() {
		setLayout(new GridLayout(3,1));
		//Panel que ingresa numero de datos 
		panel1 = new Panel1();
		add(panel1);
		//Panel con la tabla
		panelTable = new Panel2();
		add(panelTable);
		//Panel que muestra los puntos ingresados
		panel3 = new Panel3();
		Panel3.getButton2().setText("Mostrar y graficar");
		add(panel3);
	}
}

