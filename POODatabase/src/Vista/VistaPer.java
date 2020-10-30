package Vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
//
//import com.gor.PracticaTable.*;

public class VistaPer extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public  JButton button;
	public JTextArea txta;
	
	public VistaPer(){
		super("Práctia Base de datos");
		//(width, height)
		setSize(550, 280);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(true);
	    setLayout(new BorderLayout());
	     button = new JButton( "Imprimir" );
	     add(button,BorderLayout.SOUTH);
	     
	     txta = new JTextArea();
	     add(txta,BorderLayout.CENTER);		 
	 }
}
