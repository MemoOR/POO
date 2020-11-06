package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class PanelGrafica extends JPanel{
	private static final long serialVersionUID = 1L;
	
	double[] XM, YM;
	public static String[] dataLabel = {"ESTADO", "SEXO", "DIANÓSTICO", "EDAD"};
	JLabel[] Data = new JLabel[4];

	public PanelGrafica() {	
		
		setLayout(new GridLayout());
		setLayout(new BorderLayout());
		
		JPanel DisplayData = new JPanel();
		DisplayData.setLayout(new BoxLayout(DisplayData, BoxLayout.Y_AXIS));
		
		for(int i = 0; i < dataLabel.length; i++) {
			Data[i] = Labels.createLabel(dataLabel[i], 14);
			DisplayData.add(Data[i]);
		}
		
		add(DisplayData, BorderLayout.NORTH);
		
		CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
	}
	
	private CategoryDataset createDataset() {

        var dataset = new DefaultCategoryDataset();
        dataset.setValue(2365584, "Gold medals", "USA");

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
