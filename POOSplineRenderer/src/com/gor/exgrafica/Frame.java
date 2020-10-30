package com.gor.exgrafica;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;

import com.gor.PracticaTable.Panel1;
import com.gor.PracticaTable.Panel3;

public class Frame extends JFrame{
private static final long serialVersionUID = 1L;
	
	static String datos[][];
	static String[] columnNames = {"No", "X", "Y"};
	static PanelTabla panelT;
	static PanelGrafica panelG;
	static JTable table;
	static JTextArea txtArea;
	static boolean tableSet = false;
	static boolean DataSet = false;
	 
	static int wth = 1000, hht = 500, locx = 250, locy = 100;

	public Frame() {
		super("Práctia Crea gráfica");
		setSize(wth, hht);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(locx,locy);
		setResizable(true);
		
		setLayout(new GridLayout(1,2));
		
		//Panel para ingresar datos en tabla
		panelT = new PanelTabla();
		panelT.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		add(panelT);
		
		//Panel para mostrar gráfica
		panelG = new PanelGrafica(null);
		panelG.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		add(panelG);
		
		//Eventos 
		ReadEvents Evento = new ReadEvents();
		Panel1.getButton1().addActionListener(Evento);
		Panel3.getButton2().addActionListener(Evento);
	}
}
