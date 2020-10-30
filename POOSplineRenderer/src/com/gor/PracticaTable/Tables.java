package com.gor.PracticaTable;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Tables extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	
	private static JTable table;
	private static DefaultTableModel model;
	private static DefaultTableCellRenderer cellRenderer;
	
	public static JTable createTable(String data[][], String cNames[]) {
		table = new JTable() {
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column){  
		        if(column == 0)
		        	return false; 
		        return true;
		      }  
		};
 
		model = (DefaultTableModel)table.getModel();
		for(int i=0; i<cNames.length; i++) {
			model.addColumn(cNames[i]);
		}
		
		for(int i = 0;i < data.length; i++) {
			model.addRow(new Object[0]);
			model.setValueAt(i+1, i, 0);	
		}
		
		table.getColumnModel().getColumn(1).setPreferredWidth(300);
		table.getColumnModel().getColumn(2).setPreferredWidth(300);
		
		cellRenderer = new DefaultTableCellRenderer();
	    cellRenderer.setHorizontalAlignment(JLabel.CENTER);
	    table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
	    table.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
	    table.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
		
	    return table;	
	}
}
