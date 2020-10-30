package com.gor.PracticaTable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class Panel3 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private static JButton button2;

	public Panel3() {
		setButton2(Buttons.createButton("Mostrar Puntos"));
		
		setLayout(new BorderLayout());
		this.add(getButton2(), BorderLayout.SOUTH);
		
		JLabel text = Labels.createLabel("Datos");
		add(text, BorderLayout.CENTER);
	}

	public static JButton getButton2() {
		return button2;
	}

	public static void setButton2(JButton button2) {
		Panel3.button2 = button2;
	}
}