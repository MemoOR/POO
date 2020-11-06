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
