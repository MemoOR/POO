package com.gor.primerGUI;

import javax.swing.JFrame;

public class PrimerGUI extends JFrame{
	private static final long serialVersionUID = 1L;

	public PrimerGUI() {
		super("Título de la ventana");
		setSize(700,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);
		setResizable(false);
		
		PrimerPanel panelUno = new PrimerPanel();
		this.add(panelUno);	
	}
}
