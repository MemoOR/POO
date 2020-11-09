/* @file RadioGroup.java
*  @brief }Recibe como parámetro varios radiobuttons y 
*  crea un button group con ellos
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

package Vista;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class RadioGroup {

	public static ButtonGroup createRadioGroup(JRadioButton[] buttons) {
		ButtonGroup Group = new ButtonGroup();
		for(int i = 0; i < buttons.length; i++) {
			Group.add(buttons[i]);
		}
		return Group;
	}
}
