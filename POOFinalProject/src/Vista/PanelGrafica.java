/* @file PanelGrafica.java
*  @brief Contiene los componentes que muestran los datos 
*  con los que se llenará la gráfica y la gráfica
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;

public class PanelGrafica extends JPanel{
	private static final long serialVersionUID = 1L;

	public PanelGrafica(CategoryDataset dataset) {	
		setLayout(new GridLayout());
		setLayout(new BorderLayout());

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
	}
	
	private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "Casos de COVID-19 en México hasta Octubre 2020", //titulo
                "", //label eje x 
                "Número de casos", //label eje y
                dataset,//data
                PlotOrientation.VERTICAL, //orientacion
                false, //leyenda
                true, //tooltips
                false //URL
                );
        
        //Valida que el intervalo mínimo en el eje Y sea un número entero
        CategoryPlot chartPlot = barChart.getCategoryPlot();
        ValueAxis YAxis = chartPlot.getRangeAxis();
        YAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        //crea un ancho maximo para las barras de la gráfica
        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        BarRenderer br = (BarRenderer) categoryPlot.getRenderer();
        br.setMaximumBarWidth(.3); // set maximum width to 30% of chart
        
        return barChart;
    }
}
