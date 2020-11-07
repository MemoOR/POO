package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class PanelGrafica extends JPanel{
	private static final long serialVersionUID = 1L;

	public PanelGrafica() {	
		setLayout(new GridLayout());
		setLayout(new BorderLayout());
		
		CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
	}
	
	private CategoryDataset createDataset() {

        var dataset = new DefaultCategoryDataset();
        dataset.setValue(2365584, "Gold medals", "Total de casos");

        return dataset;
    }
	
	private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "Casos de COVID-19 en México hasta Octubre 2020",
                "",
                "Número de casos",
                dataset,
                PlotOrientation.VERTICAL,
                false, false, false);

        return barChart;
    }
}
