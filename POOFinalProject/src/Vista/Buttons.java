/* @file Buttons.java
*  @brief Objeto de tipo button para crear botones en el frame
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

package Vista;

import java.awt.Font;

import javax.swing.JButton;

public class Buttons {
	
	public static JButton createButton(String txt) {
			
			JButton button = new JButton(txt);
			button.setFont(new Font("Times New Roman", Font.ITALIC, 12));
			button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            button.setOpaque(true);
			return button;
			
		}
}
