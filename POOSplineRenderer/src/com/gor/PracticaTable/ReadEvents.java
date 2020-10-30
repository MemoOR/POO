package com.gor.PracticaTable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class ReadEvents implements ActionListener{

	public void actionPerformed(ActionEvent readEvent) {
		//Evento botón crear tabla
		if(readEvent.getSource() == Panel1.getButton1()) {
			try {
				int xDatos = Integer.parseInt(Panel1.getNumDatos().getText());
				JScrollPane scrollPane = new JScrollPane(); 
				Frame.datos = new String[xDatos][3];
				
				for(int fila=0;fila<Frame.datos.length;fila++) {
						Frame.datos[fila][0] = String.valueOf(fila+1);
				}			
				
				Frame.panelTable.updateUI();
				Frame.panelTable.repaint();
				Frame.panelTable.removeAll();
				
				Frame.table = Tables.createTable(Frame.datos, Frame.columnNames);
				scrollPane.setViewportView(Frame.table);
				Frame.panelTable.add(scrollPane);
				
				Frame.tableSet = true;			
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Ingresa un valor válido: "
				+ Panel1.getNumDatos().getText(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		//Evento botón leer tabla
		if(readEvent.getSource() == Panel3.getButton2()) {
			double x = 0, y = 0;
			char col = 'X';
			int fila = 0;
			try {
				if(Frame.tableSet) {
					JScrollPane scrollPane = new JScrollPane(); 
					ArrayList<Coordenada> coordenadas = new ArrayList<>();
					System.out.println(Frame.table.getModel().getRowCount());
					for(fila=0; fila<Frame.table.getModel().getRowCount(); fila++) {
						x = Double.parseDouble(String.valueOf(Frame.table.getValueAt(fila, 1)));
						col = 'Y';
						y = Double.parseDouble(String.valueOf(Frame.table.getValueAt(fila, 2)));
						col = 'X';
						coordenadas.add(new Coordenada(x, y));
					}
					
					Frame.panel3.updateUI();
					Frame.panel3.repaint();
					
					Frame.txtArea = TextAreas.createTA(8, 8);
					
					for(Coordenada c:coordenadas) {
						Frame.txtArea.append("("+c.getXx()+","+c.getYy()+")");
						Frame.txtArea.append("\n");
					}
					
					scrollPane.setViewportView(Frame.txtArea);
					Frame.panel3.add(scrollPane, BorderLayout.NORTH);
				}else {
					JOptionPane.showMessageDialog(null, "Crea primero una tabla",
							"Error de entrada", JOptionPane.ERROR_MESSAGE);
				}
			}catch(Exception e){
				int f = fila+1;
				JOptionPane.showMessageDialog(null, "Introduce datos válidos en el valor: "
				+ f + " de la columna " + col, "Error de entrada", JOptionPane.ERROR_MESSAGE);
			}
		}	
	}
}
