package Vista;

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
		        return false;
		      }  
		};
		//Para ordenar datos de la tabla
		table.setAutoCreateRowSorter(true);
 
		model = (DefaultTableModel)table.getModel();
		cellRenderer = new DefaultTableCellRenderer();
		cellRenderer.setHorizontalAlignment(JLabel.CENTER);

		for(int i=0; i<cNames.length; i++) {
			model.addColumn(cNames[i]);
			
		}
		if(cNames.length != 0) {
			table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);	
			table.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
			table.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
			table.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
			table.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
		}
		
		for(int i = 0; i < data.length; i++) {
			model.addRow(new Object[0]);
			for(int j = 0; j < cNames.length; j++) {
				model.setValueAt(data[i][j], i, j);
			}
		}
		
	  return table;
	}
}
