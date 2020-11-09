/* @file RadioButtons.java
*  @brief Se encarga de crear radio buttons para insertarlos 
*  en el frame principal
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

package Vista;

import java.awt.Font;

import javax.swing.JRadioButton;

public class RadioButtons {
	public static JRadioButton[] createRButton(int number, String[] Text) {
		JRadioButton[] buttons = new JRadioButton[number];
		for(int i = 0; i < number; i++) {
			buttons[i] = new JRadioButton(Text[i], false);
			buttons[i].setFont(new Font("calibri", Font.ITALIC, 14));
		}
		return buttons;
	}
}
