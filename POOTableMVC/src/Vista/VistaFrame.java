package Vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VistaFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public JButton button;
	public JPanel panel1 = new Panel1();
	
	public static String data[][] = {{}};
	public static String cNames[] = {};
	
	public JPanel panelTabla;
	public JScrollPane scrollPane = new JScrollPane(); 
	public JTable Tabla = Tables.createTable(data, cNames);
	
	public VistaFrame(){
		super("Práctia Base de datos con tabla");
		//(width, height)
		setSize(550, 600);
		setLocation(200,200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(true);
	    setLayout(new BorderLayout());
	    
	    button = Buttons.createButton("Mostrar datos");
	    panel1.add(button);
	    add(panel1, BorderLayout.NORTH); 
	    
	    panelTabla = new PanelTabla(Tabla, scrollPane);
	    add(panelTabla);
	 }
}
