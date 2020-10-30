package com.gor.primerGUI;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayoutMFG extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	public BorderLayoutMFG() {
		setSize(400,400);
		
		button1 = new JButton("Botón 1");
		button2 = new JButton("Botón 2");
		button3 = new JButton("Botón 3");
		button4 = new JButton("Botón 4");
		button5 = new JButton("5");
		
		setLayout(new BorderLayout());
		
		this.add(button1,BorderLayout.WEST);
		this.add(button2,BorderLayout.EAST);
		this.add(button3,BorderLayout.NORTH);
		this.add(button4,BorderLayout.SOUTH);
		this.add(button5,BorderLayout.CENTER);
		
	}

}
