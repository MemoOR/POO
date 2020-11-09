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
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VistaFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Paneles y componentes para el panel de opciones
	public JPanel panelO;
	public JPanel[] paneles = new JPanel[6];
	public JComboBox<String> combo1, combo2;	
	public JButton infoButton;
	//labels para radio buttons
	public String[] sexLabel = {"Hombres", "Mujeres", "Total"};
	public String[] sickLabel = {"Diabetes","EPOC", "Asma", "Hipertensión",
								"Cardiovascular", "Obesidad", "Tabaquismo", "Total"};
	public String[] deadLabel = {"Contagios", "Defunciones", "C vs D", "Total"};
	public String[] ageLabel = {"Si", "No"};
	public JRadioButton[] sexR, sickR, deadR, ageR;
	public ButtonGroup SexG, sickG, deadG, ageG;
	//iconos
	public ImageIcon img, imgInfo;
	public JLabel imgL;
	//componentes para la tabla de informacion
	public String data[][] = {{}};
	public String cNames[] = {"ID", "Tipo", "Descripción"};
	public JScrollPane scrollPane = new JScrollPane(); 
	public JTable Tabla = new JTable();
	
	//Paneles y componentes para el panel de la gráfica
	public JPanel panelG;
	public String[] dataLabel = {"Población: TOTAL", "Sexo: Total",
								"Diagnóstico: Total", "Estadística: Total",
								"Filtro de edad: No", "Clasificación: TOTAL"};
	public JLabel[] Data = new JLabel[dataLabel.length];
	public JPanel DisplayData;
	//dataset para la grafica
	public DefaultCategoryDataset dataset;
	
	//Frame principal
	public VistaFrame(){
		//Configuracion del frame
		super("Estadística COVID-19 en México");
		//(width, height)
		setSize(1200, 600);
		setLocation(150, 100);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(true);
	    getContentPane().setLayout(new GridLayout(1,2));
	    addIcon();
	    
	    //Inserta los elementos del panel de opciones
	    createOptionsPanel();
	    getContentPane().add(panelO);
	    
	    //Panel de la grafica 
	    dataset = new DefaultCategoryDataset();
	    panelG = new PanelGrafica(dataset);
	    panelG.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
	    
	    DisplayData = new JPanel();
		DisplayData.setLayout(new GridLayout(3,2));
		
		for(int i = 0; i < dataLabel.length; i++) {
			Data[i] = Labels.createLabel(dataLabel[i], 14);
			DisplayData.add(Data[i]);
		}
		
		panelG.add(DisplayData, BorderLayout.NORTH);

	    getContentPane().add(panelG);
	}
	
	//Crea los elementos que contenerá el panel de opciones
	public void createOptionsPanel() {
		panelO = new PanelOpciones();
	    panelO.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
	    
	    for(int i = 0; i < paneles.length; i++) {
	    	paneles[i] = new JPanel();
	    }
	    
	    //Insertar gif en frame
	    addGif();
	    
	    //Posicion de Combobox
	    combo1 = ComboBox.CreateCombo();
	    combo2 = ComboBox.CreateCombo();
	    
	    paneles[0].setLayout(new FlowLayout(FlowLayout.LEFT));
	    paneles[0].add(Labels.createLabel("Selecciona un estado:   "));
	    paneles[0].add(combo1);

	    //Posicion de radio buttons
	    paneles[1].setLayout(new BoxLayout(paneles[1], BoxLayout.Y_AXIS));
	    paneles[1].add(Labels.createLabel("   "));
	    paneles[1].add(Labels.createLabel("Sexo: ", 16));
	    
	    paneles[2].setLayout(new BoxLayout(paneles[2], BoxLayout.Y_AXIS));
	    paneles[2].add(Labels.createLabel("   "));
	    paneles[2].add(Labels.createLabel("Estadística: ", 16));
	    
	    //Combo box para clasificacion
	    paneles[3].setLayout(new GridLayout(2,1));
	    paneles[4].setLayout(new FlowLayout(FlowLayout.LEFT));
	    paneles[5].setLayout(new FlowLayout(FlowLayout.LEFT));
	    paneles[4].add(Labels.createLabel("Tipo de clasificación: "));
	    addInfoIcon();
	    paneles[5].add(combo2);
	    
	    paneles[3].add(paneles[4]);
	    paneles[3].add(paneles[5]);

	    //Añade todos los paneles creados para las opciones
	    panelO.add(paneles[0], BorderLayout.NORTH);
	    panelO.add(paneles[1], BorderLayout.WEST);
	    panelO.add(paneles[2], BorderLayout.EAST);
	    panelO.add(paneles[3], BorderLayout.SOUTH);
	    panelO.add(imgL, BorderLayout.CENTER);
	    
	    addRButtons();
	}
	
	//crea y añade los radio buttons y radio groups al panel 
	//que les corresponde
	public void addRButtons() {
		sexR = RadioButtons.createRButton(sexLabel.length, sexLabel);
	    sickR = RadioButtons.createRButton(sickLabel.length, sickLabel);
	    deadR = RadioButtons.createRButton(deadLabel.length, deadLabel);
	    ageR = RadioButtons.createRButton(ageLabel.length, ageLabel);
	    
	    //sleccion inicial de cada radiogroup
	    sexR[2].setSelected(true);
	    sickR[7].setSelected(true);
	    deadR[3].setSelected(true);
	    ageR[1].setSelected(true);
	    
	    SexG = RadioGroup.createRadioGroup(sexR);
	    sickG = RadioGroup.createRadioGroup(sickR);
	    deadG = RadioGroup.createRadioGroup(deadR);
	    ageG = RadioGroup.createRadioGroup(ageR);
	    
		for(int i = 0; i < sexR.length; i++) {
	    	paneles[1].add(sexR[i]);
	    }
		
		paneles[1].add(Labels.createLabel("   "));
		paneles[1].add(Labels.createLabel("Diagnóstico: ", 16));
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
	
	//cambia el icono de la ventana
	public void addIcon() {
		ImageIcon icon = new ImageIcon(
				"C:/Users/dethk/git/POO/POOFinalProject/icon.png");
		setIconImage(icon.getImage());  
	}
	
	//icono de informacion de clasificacion
	public void addInfoIcon() {
		imgInfo = new ImageIcon("C:/Users/dethk/git/POO/POOFinalProject/infoIcon.png");
	    infoButton = Buttons.createButton(""); 
	    infoButton.setIcon(imgInfo);
	    paneles[4].add(infoButton);
	}
		
	//Crea un label que contiene un gif
	public void addGif() {
		img = new ImageIcon("C:/Users/dethk/git/POO/POOFinalProject/model.gif");
		
		//resize gives less resolution
	    img.setImage(img.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT));
	    imgL = Labels.createLabel(img);
	}
}
