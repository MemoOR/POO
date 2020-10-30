package com.gor.PracticaTable;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Labels {
	
	public static JLabel createLabel(String LabelTXT) {
			
			JLabel Label = new JLabel(LabelTXT, SwingConstants.CENTER);
			Label.setSize(50, 20);
			Label.setFont (new Font("Times New Roman", Font.PLAIN, 24));
			return Label;
			
		}
}
