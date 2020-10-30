package com.gor.exgrafica;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import com.gor.PracticaTable.Coordenada;
import com.gor.PracticaTable.Panel1;
import com.gor.PracticaTable.Panel3;
import com.gor.PracticaTable.Tables;
import com.gor.PracticaTable.TextAreas;

public class ReadEvents extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public static int xDatos;
	static Frame ventanaG;

	public void actionPerformed(ActionEvent readEvent) {
		//Evento botón crear tabla
		if(readEvent.getSource() == Panel1.getButton1()) {
			try {
				xDatos = Integer.parseInt(Panel1.getNumDatos().getText());
				JScrollPane scrollPane = new JScrollPane(); 
				Frame.datos = new String[xDatos][3];
				
				for(int fila=0;fila<Frame.datos.length;fila++) {
						Frame.datos[fila][0] = String.valueOf(fila+1);
				}			
				PanelTabla.panelTable.updateUI();
				PanelTabla.panelTable.repaint();
				PanelTabla.panelTable.removeAll();
				
				Frame.table = Tables.createTable(Frame.datos, Frame.columnNames);
				for(int i = 0; i < Frame.table.getRowCount(); i++) {
					Frame.table.isCellEditable(i, 0);
				}
				scrollPane.setViewportView(Frame.table);
				PanelTabla.panelTable.add(scrollPane);
				
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
					//Inserta Tabla con datos
					JScrollPane scrollPane = new JScrollPane(); 
					//Lista de datos de la tabla
					ArrayList<Coordenada> coordenadas = new ArrayList<>();
//					System.out.println(Frame.table.getModel().getRowCount());
					for(fila=0; fila<Frame.table.getModel().getRowCount(); fila++) {
						x = Double.parseDouble(String.valueOf(Frame.table.getValueAt(fila, 1)));
						col = 'Y';
						y = Double.parseDouble(String.valueOf(Frame.table.getValueAt(fila, 2)));
						col = 'X';
						coordenadas.add(new Coordenada(x, y));
					}
					PanelTabla.panel3.remove(1);
					PanelTabla.panel3.updateUI();
					PanelTabla.panel3.repaint();
					
					Frame.txtArea = TextAreas.createTA(8, 8);
					Frame.txtArea.setEditable(false);
					
					for(Coordenada c:coordenadas) {
						Frame.txtArea.append("("+c.getXx()+","+c.getYy()+")");
						Frame.txtArea.append("\n");
					}
					
					scrollPane.setViewportView(Frame.txtArea);
					PanelTabla.panel3.add(scrollPane, BorderLayout.NORTH);
					
					//Inserta gráfica
					Frame.panelG.updateUI();
					Frame.panelG.repaint();
					Frame.panelG.removeAll();
					
					PanelGrafica graph = new PanelGrafica(coordenadas);
					Frame.panelG.add(graph);
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
