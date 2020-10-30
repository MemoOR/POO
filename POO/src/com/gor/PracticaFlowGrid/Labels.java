package com.gor.PracticaFlowGrid;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Labels {
	
	static JLabel createLabel(String LabelTXT) {
			
			JLabel Label = new JLabel(LabelTXT, SwingConstants.CENTER);
			return Label;
			
		}
}
