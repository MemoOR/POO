package com.gor.exgrafica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.gor.PracticaTable.Coordenada;
import com.gor.PracticaTable.Labels;

public class PanelGrafica extends JPanel{
	private static final long serialVersionUID = 1L;
	
	double[] XM, YM;
	Renderer appFrame;
	JLabel formLabel;
	//String formula;
	
	public PanelGrafica(ArrayList<Coordenada> data) {	

		if(Frame.tableSet) {
			XM = new double[Frame.table.getModel().getRowCount()];
			YM = new double[Frame.table.getModel().getRowCount()];
	
			if(data != null) {
				
				for(int i = 0; i < Frame.table.getModel().getRowCount(); i++) {
					XM[i] = data.get(i).getXx();
					YM[i] = data.get(i).getYy();
				}
				setLayout(new GridLayout());
				setLayout(new BorderLayout());
				Renderer appFrame = new Renderer(XM, YM);
		        add(appFrame);
		        MinimosCuadrados getFormula = new MinimosCuadrados(data);
		        formLabel = Labels.createLabel(getFormula.getFormula());
		        add(formLabel, BorderLayout.SOUTH);
			}
		}else {
			setLayout(new GridLayout());
			JLabel text = Labels.createLabel("Gráfica");
			add(text, BorderLayout.CENTER);
		}
	}
}
