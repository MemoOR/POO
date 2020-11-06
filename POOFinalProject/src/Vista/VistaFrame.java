package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class VistaFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public JPanel panelO;
	public JPanel panelG;
	public JPanel[] paneles = new JPanel[3];
	
	public JComboBox<String> combo1;	
	
	public String[] sexLabel = {"Hombres", "Mujeres", "Total"};
	public String[] sickLabel = {"Diabetes","EPOC", "Asma", "Hipertensi�n",
								"Cardiovascular", "Obesidad", "Tabaquismo", "Total"};
	public String[] deadLabel = {"Contagios", "Defunciones", "Total"};
	public String[] ageLabel = {"Si", "No"};
	
	public static JRadioButton[] sexR, sickR, deadR, ageR;
	public ButtonGroup SexG, sickG, deadG, ageG;
	
	public ImageIcon img;
	public JLabel imgL;
	
	public VistaFrame(){
		super("Estad�stica COVID-19 en M�xico");
		//(width, height)
		setSize(1200, 600);
		setLocation(150, 100);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(false);

	    getContentPane().setLayout(new GridLayout(1,2));
	    
	    panelO = new PanelOpciones();
	    panelO.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
	    
	    for(int i = 0; i < paneles.length; i++) {
	    	paneles[i] = new JPanel();
	    }
	    
	    //Insertar gif en frame
	    addGif();
	    
	    //Posicion de Combobox
	    combo1 = ComboBox.CreateCombo();
	    paneles[0].setLayout(new FlowLayout(FlowLayout.LEFT));
	    paneles[0].add(Labels.createLabel("Selecciona un estado:   "));
	    paneles[0].add(combo1);

	    //Posicion de radio buttons
	    paneles[1].setLayout(new BoxLayout(paneles[1], BoxLayout.Y_AXIS));
	    paneles[1].add(Labels.createLabel("   "));
	    paneles[1].add(Labels.createLabel("Sexo: ", 16));
	    
	    paneles[2].setLayout(new BoxLayout(paneles[2], BoxLayout.Y_AXIS));
	    paneles[2].add(Labels.createLabel("   "));
	    paneles[2].add(Labels.createLabel("Estad�stica: ", 16));
	    
	    //A�ade todos los paneles creados para las opciones
	    panelO.add(paneles[0], BorderLayout.NORTH);
	    panelO.add(paneles[1], BorderLayout.WEST);
	    panelO.add(paneles[2], BorderLayout.EAST);
	    panelO.add(imgL, BorderLayout.CENTER);
	    
	    addRButtons();

	    //Panel de la grafica 
	    panelG = new PanelGrafica();
	    panelG.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
	    
	    getContentPane().add(panelO);
	    getContentPane().add(panelG);

	 }
	
	//crea y a�ade los radio buttons y radio groups al panel 
	//que les corresponde
	public void addRButtons() {
		sexR = RadioButtons.createRButton(sexLabel.length, sexLabel);
	    sickR = RadioButtons.createRButton(sickLabel.length, sickLabel);
	    deadR = RadioButtons.createRButton(deadLabel.length, deadLabel);
	    ageR = RadioButtons.createRButton(ageLabel.length, ageLabel);
	    
	    sexR[2].setSelected(true);
	    sickR[0].setSelected(true);
	    deadR[2].setSelected(true);
	    ageR[1].setSelected(true);
	    
	    SexG = RadioGroup.createRadioGroup(sexR);
	    sickG = RadioGroup.createRadioGroup(sickR);
	    deadG = RadioGroup.createRadioGroup(deadR);
	    ageG = RadioGroup.createRadioGroup(ageR);
	    
		for(int i = 0; i < sexR.length; i++) {
	    	paneles[1].add(sexR[i]);
	    }
		
		paneles[1].add(Labels.createLabel("   "));
		paneles[1].add(Labels.createLabel("Diagn�stico: ", 16));
		for(int i = 0; i < sickR.length; i++) {
	    	paneles[1].add(sickR[i]);
	    }
		
	    for(JRadioButton button : deadR) {
	    	paneles[2].add(button);
	    }
	    
	    paneles[2].add(Labels.createLabel("   "));
		paneles[2].add(Labels.createLabel("Filtrar por edad: ", 16));
	    for(JRadioButton button : ageR) {
	    	paneles[2].add(button);
	    }
	}
	
	//Crea un label que contiene un gif
	public void addGif() {
		img = new ImageIcon("C:/Users/dethk/git/POO/POOFinalProject/model.gif");
		
		//resize gives less resolution
	    img.setImage(img.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT));
	    imgL = Labels.createLabel(img);
	}
}
