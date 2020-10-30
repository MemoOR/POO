package com.gor.PracticaTable;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Frame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	static String datos[][];
	static String[] columnNames = {"No", "X", "Y"};
	static Panel2 panelTable;
	static Panel3 panel3;
	static JTable table;
	static JTextArea txtArea;
	static boolean tableSet = false;

	public Frame() {
		super("Práctia Tabla");
		setSize(330, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,20);
		setResizable(true);

		setLayout(new GridLayout(3,1));
		Panel1 panel1 = new Panel1();
		add(panel1);
		
		panelTable = new Panel2();
		add(panelTable);
		
		panel3 = new Panel3();
		add(panel3);
		
		ReadEvents Evento = new ReadEvents();
		Panel1.getButton1().addActionListener(Evento);
		Panel3.getButton2().addActionListener(Evento);
	}
}
