package com.gor.PracticaAddEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Labels {
	
	static JLabel createLabel(String LabelTXT) {
			
			JLabel Label = new JLabel(LabelTXT, SwingConstants.CENTER);
			Label.setFont (Label.getFont().deriveFont (20.0f));
			return Label;
			
		}
}
