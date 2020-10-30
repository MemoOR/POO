package com.gor.PracticaGUI;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Frame extends JFrame{
	private static final long serialVersionUID = 1L;

	public Frame() {
		super("Práctia GUI");
		setSize(700,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);
		setResizable(false);
		
		Panel panel1 = new Panel();
		setLayout(new GridLayout());
		add(panel1);
	}
}
