package com.gor.PracticaTable;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

public class Panel1 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private static JTextArea numDatos;
	JLabel txtLabel;
	private static JButton button1;
	
	public Panel1() {
		
		setNumDatos(TextAreas.createTA(1, 20));
		getNumDatos().setText("10");
		txtLabel = Labels.createLabel("Número de puntos");
		txtLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setButton1(Buttons.createButton("Ingresar Datos"));
		
		add(txtLabel);
		add(getNumDatos());
		add(getButton1());
	}

	public static JButton getButton1() {
		return button1;
	}

	public static void setButton1(JButton button1) {
		Panel1.button1 = button1;
	}

	public static JTextArea getNumDatos() {
		return numDatos;
	}

	public static void setNumDatos(JTextArea numDatos) {
		Panel1.numDatos = numDatos;
	}
}