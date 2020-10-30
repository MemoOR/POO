package com.gor.PracticaTable;

import java.awt.Font;

import javax.swing.JButton;

public class Buttons {
	
	public static JButton createButton(String txt) {
			
			JButton button = new JButton(txt);
			button.setFont(new Font("Times New Roman", Font.BOLD, 14));
			return button;
			
		}
}
