package Vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
//
//import com.gor.PracticaTable.*;

public class VistaList extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public  JButton button;
	public JTextArea txta;
	public JComboBox<String> combo;
	
	public VistaList(){
		super("Práctia Base de datos");
		//(width, height)
		setSize(550, 280);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(true);
	    setLayout(new BorderLayout());
	    combo = ComboBox.CreateCombo();
	    add(combo, BorderLayout.NORTH);
	    
	    button = Buttons.createButton("Mostrar nombres");
	    add(button,BorderLayout.SOUTH);
	     
	    txta = TextAreas.createTA();
	    add(txta,BorderLayout.CENTER);		 
	 }
}
