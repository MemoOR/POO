package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ConnectPersona;
import Modelo.ModeloPer;
import Vista.VistaPer;

public class Controlador implements ActionListener{
	
	private ConnectPersona modelo = new ConnectPersona();
	private VistaPer vista = new VistaPer();
	
	//Constructor
	public Controlador(ConnectPersona modelo, VistaPer vista) {
		this.setModelo(modelo);
		this.setVista(vista);
		this.vista.button.addActionListener(this);
	}

	//Button Pressed
	public void actionPerformed(ActionEvent e){

		if(e.getSource() == this.vista.button){
			System.out.println("Button pressed");
			this.vista.txta.selectAll();
			this.vista.txta.replaceSelection("");
			
			for(int i=0; i < modelo.listaPersonas().size(); i++){
				this.vista.txta.append(modelo.listaPersonas().get(i).getNombre() + " ");
			}

            for(ModeloPer x:modelo.listaPersonas()) {
            	System.out.println(x.getNombre() + " "+x.getApaterno()+" "+x.getAMaterno());
            }
			
			this.vista.txta.updateUI();
			this.vista.txta.repaint();
		}
	}

	public ConnectPersona getModelo() {
		return modelo;
	}

	public void setModelo(ConnectPersona modelo2) {
		this.modelo = modelo2;
	}

	public VistaPer getVista() {
		return vista;
	}

	public void setVista(VistaPer vista) {
		this.vista = vista;
	}

}
