package com.gor.PracticaTable;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class Panel2 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public Panel2() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		
		JLabel text = Labels.createLabel("Tabla");
		add(text, BorderLayout.CENTER);
	}
}
