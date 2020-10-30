package Vista;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel1 extends JPanel{
	private static final long serialVersionUID = 1L;

	public JLabel txtLabel;
	
	public Panel1() {
		this.txtLabel = Labels.createLabel("Imprimir datos          ");

		setLayout(new FlowLayout());
		add(txtLabel);
	}
}
