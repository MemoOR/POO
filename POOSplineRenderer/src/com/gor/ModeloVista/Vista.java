package com.gor.ModeloVista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.gor.PracticaTable.Labels;
import com.gor.PracticaTable.Buttons;
import com.gor.PracticaTable.TextAreas;

public class Vista extends JFrame{
	private static final long serialVersionUID = 1L;
	
	static JLabel label1, label2;
	static JTextArea txta;
	static JButton button;
	
	public Vista() {
		super("Práctia Tabla");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);
		setResizable(true);
		
		setLayout(new FlowLayout());
		
		label1 = Labels.createLabel("Ingresa temperatura en centígrados");
		txta = TextAreas.createTA(1, 5);
		button = Buttons.createButton("Convertir");
		label2 = Labels.createLabel("");
		
		add(label1);
		add(txta);
		add(button);
		add(label2);
	}

}
