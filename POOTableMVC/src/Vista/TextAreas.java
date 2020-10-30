package Vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;

public class TextAreas {
	
	public static JTextArea createTA() {
		
		JTextArea txtA = new JTextArea();
		txtA.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		return txtA;
		
	}
	
	public static JTextArea createTA(int dimy, int dimx) {
		
		JTextArea txtA = new JTextArea(dimy, dimx);
		txtA.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));
		return txtA;
		
	}

}
