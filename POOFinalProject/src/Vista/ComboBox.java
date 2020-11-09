/* @file ComboBox.java
*  @brief Objeto de tipo Combobox para insertarlos en el frame
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;

public class ComboBox {
	
	public static JComboBox<String> CreateCombo() {
		JComboBox<String> combo = new JComboBox<>();
		combo.setBackground(Color.white);
		combo.setFont(Font.decode("Dialog"));
		combo.setBorder(new EmptyBorder(0, 0, 0, 0));
		return combo;
	}
}
