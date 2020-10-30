package com.gor.PracticaAddEvent;

//import java.awt.FlowLayout;
//import java.awt.BorderLayout;
//import java.awt.Dimension;
import java.awt.GridLayout;

//import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.SwingConstants;

public class Panel1 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	static JTextArea[] Areas = new JTextArea[3];
	String labels[] = {"Nombre:", "Edad:", "Puesto:", "", ""};
	JLabel txtLabels[] = new JLabel[5];
	
	public Panel1() {
		
		for(int i = 0; i < labels.length; i++) {
			txtLabels[i] = Labels.createLabel(labels[i]);
		}
		
		for(int i = 0; i < Areas.length; i++) {
			Areas[i] = InputTXT.createTA();
		}	
		
		
		setLayout(new GridLayout(3, 3, 20, 80));
		
		this.add(txtLabels[0]); this.add(Areas[0]); this.add(txtLabels[3]);
		this.add(txtLabels[1]); this.add(Areas[1]); this.add(txtLabels[4]);
		this.add(txtLabels[2]); this.add(Areas[2]); 
	}
}