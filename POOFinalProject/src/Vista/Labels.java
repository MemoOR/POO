/* @file Labels.java
*  @brief Objeto para crear labelse insertarlos en el frame
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

package Vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Labels {
	
	public static JLabel createLabel(String LabelTXT) {
			
		JLabel Label = new JLabel(LabelTXT);
		Label.setSize(50, 20);
		Label.setFont (new Font("Times New Roman", Font.BOLD, 24));
		return Label;
	}
	
	public static JLabel createLabel(String LabelTXT, int size) {
		JLabel Label = new JLabel(LabelTXT);
		Label.setSize(50, 20);
		if(size == 16)
			Label.setFont (new Font("Times New Roman", Font.BOLD, size));
		else if(size == 14)
			Label.setFont (new Font("calibri", Font.PLAIN, size));
		else if(size == 12)
			Label.setFont (new Font("Times New Roman", Font.BOLD, size));
		return Label;
	}
	
	public static JLabel createLabel(ImageIcon img) {
		
		JLabel Label = new JLabel(img, SwingConstants.CENTER);
		Label.setBounds(100, 100, 100, 100);
		return Label;
	}
}
