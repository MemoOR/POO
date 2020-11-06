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
