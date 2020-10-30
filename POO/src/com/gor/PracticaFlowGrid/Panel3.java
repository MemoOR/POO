package com.gor.PracticaFlowGrid;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//import java.awt.image.ImageObserver;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
//import javax.swing.SwingConstants;

public class Panel3 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	JTextArea txtObs;
	JLabel Obs;
	JButton button;
	
	public Panel3() {
		
		txtObs = InputTXT.createTA();
		Obs = Labels.createLabel("Observaciones:");
		button = new JButton("Enviar");
		
		Obs.setFont (Obs.getFont ().deriveFont (32.0f));
		//Obs.setPreferredSize(new Dimension(ImageObserver.WIDTH,ImageObserver.HEIGHT));
		
		button.setPreferredSize(new Dimension(800, 50));
		//button.setPreferredSize(new Dimension(ImageObserver.WIDTH,ImageObserver.HEIGHT));
		
		
		
		setLayout(new BorderLayout());
		this.add(Obs, BorderLayout.NORTH);
		this.add(txtObs, BorderLayout.CENTER);
		this.add(button, BorderLayout.SOUTH);
	}
}