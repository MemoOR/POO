package Vista;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Tables extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	
	private static JTable table;
	private static DefaultTableModel model;
	private static WordWrapRenderer wrapCellRenderer;
	private static DefaultTableCellRenderer cellRenderer;
	
	public static JTable createTable(String data[][], String cNames[]) {
		table = new JTable() {
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column){  
		        return false;
		      }  
		};
 
		model = (DefaultTableModel)table.getModel();
		cellRenderer = new DefaultTableCellRenderer();
		cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		cellRenderer.setVerticalAlignment(SwingConstants.CENTER);
		wrapCellRenderer = new WordWrapRenderer();

		for(int i=0; i<cNames.length; i++) {
			model.addColumn(cNames[i]);
		}
		
		if(cNames.length != 0) {
			table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);	
			table.getColumnModel().getColumn(1).setCellRenderer(wrapCellRenderer);
			table.getColumnModel().getColumn(2).setCellRenderer(wrapCellRenderer);
		}
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(400);
		
		for(int i = 0; i < data.length; i++) {
			model.addRow(new Object[0]);
			if(data != null) {
				for(int j = 0; j < cNames.length; j++) {
					model.setValueAt(data[i][j], i, j);
				}
			}
		}
		
	  return table;
	}
}
