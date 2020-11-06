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
