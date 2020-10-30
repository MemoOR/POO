package com.gor.PracticaAddEvent;

import java.awt.Color;
//import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

public class InputTXT {
	
	static JTextArea createTA() {
		
		JTextArea txtA = new JTextArea();
		txtA.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		return txtA;
		
	}

}
