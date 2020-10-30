package com.gor.FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.ImageObserver;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutMFG extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel etiqueta;
	private JTextField txtF;
	private JButton button;
	
	public FlowLayoutMFG() {
		setSize(600,200);
		setBackground(Color.yellow);
		
		etiqueta = new JLabel("Nombre: ");
		txtF = new JTextField();
		button = new JButton("Aceptar");
		
		
		
		setLayout(null);

		this.add(etiqueta);
		this.add(txtF);
		this.add(button);	
	}
}
