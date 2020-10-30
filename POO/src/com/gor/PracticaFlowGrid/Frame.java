package com.gor.PracticaFlowGrid;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Frame extends JFrame{
	private static final long serialVersionUID = 1L;

	public Frame() {
		super("Práctia Flow Grid");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,20);
		setResizable(false);
		
		setLayout(new GridLayout(3, 1));
		
		Panel1 panel1 = new Panel1();
		add(panel1);
		
		Panel2 panel2 = new Panel2();
		add(panel2);
		
		Panel3 panel3 = new Panel3();
		add(panel3);
	}
}
