/* @file WordWrapRenderer.java
*  @brief Recibe una celda de una tabla y se encarga de ajustar el tamaño
*  de la celda para ajustar correctamente el texto.
*
*  @author Unknown
*  @href https://stackoverflow.com/questions/37768335/how-to-word-wrap-inside-a-jtable-row/37768834
*  @date 09/11/2020
*/

package Vista;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

//Esta clase se encarga de ajustar el texto al tamaño de la celda en la tabla
public class WordWrapRenderer extends JTextArea implements TableCellRenderer{

	private static final long serialVersionUID = 1L;

	public WordWrapRenderer(){
        setLineWrap(true);
        setWrapStyleWord(true);
    }

	public Component getTableCellRendererComponent(JTable table, Object value,
    		boolean isSelected, boolean hasFocus, int row, int column){
    	
        setText( (value == null) ? "" : value.toString() );
        setSize(table.getColumnModel().getColumn(column).getWidth(), table.getRowHeight(row));

        //  Recalculate the preferred height now that the text and renderer width have been set.

        int preferredHeight = getPreferredSize().height;

        if (table.getRowHeight(row) != preferredHeight){
            table.setRowHeight(row, preferredHeight);
        }

        return this;
    }
}
