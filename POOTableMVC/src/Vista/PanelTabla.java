package Vista;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelTabla extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public PanelTabla(JTable Tabla, JScrollPane scrollPane) {
		setLayout(new GridLayout());
	    Tabla = Tables.createTable(VistaFrame.data, VistaFrame.cNames);
	    
	    scrollPane.setViewportView(Tabla);
	    add(scrollPane);
	}
}
