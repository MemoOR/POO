package com.gor.PracticaFlowGrid;

import javax.swing.JPanel;
//import java.awt.BorderLayout;
//import java.awt.Dimension;
import java.awt.GridLayout;
//import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
//import javax.swing.SwingConstants;

public class Panel2 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	JTextArea[] Areas = new JTextArea[6];
	String labels[] = {"peso:", "Estatura","Frecuencia Cardiaca:", "Nsangre", "Nsangre", "Nsangre"};
	JLabel txtLabels[] = new JLabel[6];
	
	public Panel2() {
		
		for(int i = 0; i < labels.length; i++) {
			txtLabels[i] = Labels.createLabel(labels[i]);
		}
		
		for(int i = 0; i < Areas.length; i++) {
			Areas[i] = InputTXT.createTA();
		}
		
		setLayout(new GridLayout(3, 4));
		this.add(txtLabels[0]); this.add(Areas[0]);
		this.add(txtLabels[1]); this.add(Areas[1]);
		this.add(txtLabels[2]); this.add(Areas[2]);
		this.add(txtLabels[3]); this.add(Areas[3]);
		this.add(txtLabels[4]); this.add(Areas[4]);
		this.add(txtLabels[5]); this.add(Areas[5]);
	}
}
