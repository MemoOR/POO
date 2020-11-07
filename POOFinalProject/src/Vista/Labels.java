package Vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Labels {
	
	public static JLabel createLabel(String LabelTXT) {
			
		JLabel Label = new JLabel(LabelTXT, SwingConstants.CENTER);
		Label.setSize(50, 20);
		Label.setFont (new Font("Times New Roman", Font.BOLD, 24));
		return Label;
	}
	
	public static JLabel createLabel(String LabelTXT, int size) {
		
		JLabel Label = new JLabel(LabelTXT);
		Label.setSize(50, 20);
		Label.setFont (new Font("Times New Roman", Font.BOLD, size));
		return Label;
	}
	
	public static JLabel createLabel(ImageIcon img) {
		
		JLabel Label = new JLabel(img, SwingConstants.CENTER);
		Label.setBounds(100, 100, 100, 100);
		return Label;
	}
}
