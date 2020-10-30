package com.gor.PracticaGUI;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	JTextArea area1;
	JButton button1;

	public Panel() {
		area1 = new JTextArea();
		button1 = new JButton("Enviar");
		
		setSize(400,400);
		setLayout(new BorderLayout());
		button1.setPreferredSize(new Dimension(10,30));
		add(area1,BorderLayout.CENTER);
		add(button1,BorderLayout.SOUTH);
	}
}
