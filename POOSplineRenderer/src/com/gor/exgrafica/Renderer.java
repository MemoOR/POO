package com.gor.exgrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import org.jfree.ui.RectangleInsets;

public class Renderer extends JPanel {
	private static final long serialVersionUID = 1L;
	
	static double[] ind;
    static double[] dep;
    static int num;
    
    // conjunto de valores x, conjunto valores y
    public Renderer(double[] indP,double[] depP) {
        Renderer.ind = new double[Frame.table.getModel().getRowCount()];
        Renderer.dep = new double[Frame.table.getModel().getRowCount()];
     
        for(int i=0; i < Frame.table.getModel().getRowCount(); i++) {
        	Renderer.ind[i] = indP[i];
        	Renderer.dep[i] = depP[i];
        }
        
        setLayout(new GridLayout());
        setLayout(new BorderLayout());
        JPanel content = createDemoPanel();
        content.setPreferredSize(new java.awt.Dimension(500, 500));
        add(content, BorderLayout.CENTER);
    }

    // Método que genera el Panel
    public static JPanel createDemoPanel() {

        // crea la gráfica.
        NumberAxis xAxis = new NumberAxis("X");
        xAxis.setAutoRangeIncludesZero(false);
        NumberAxis yAxis = new NumberAxis("Y");
        yAxis.setAutoRangeIncludesZero(false);

        XYSplineRenderer renderer1 = new XYSplineRenderer();
        // contructor de XYPlot, un parametro que recibe es el conjinto de datos.
        XYPlot plot = new XYPlot(createSampleData(), xAxis, yAxis, renderer1);
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setAxisOffset(new RectangleInsets(4, 4, 4, 4));

        // CREA Y REGRES EL PANEL. 
        JFreeChart chart = new JFreeChart("XYSplineRenderer",JFreeChart.DEFAULT_TITLE_FONT, plot, true);
//        ChartUtilities.applyCurrentTheme(chart);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setLayout(new GridLayout());
        return chartPanel;
    }

    
    // crea el conjunto de datos.
    private static XYDataset createSampleData() {
        XYSeries series = new XYSeries("Coordenadas");
        // agrega los puntos al objeto series. 
        for(int i = 0;i < Frame.table.getModel().getRowCount(); i++){
        	series.add(ind[i], dep[i]);
        }
        	
        XYSeriesCollection result = new XYSeriesCollection(series);
        return result;
    }
}