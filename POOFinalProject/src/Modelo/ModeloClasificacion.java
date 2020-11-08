package Modelo;

public class ModeloClasificacion {
	int id;
	String clasificacion;
	String descripcion;
	
	public ModeloClasificacion(){
		id=0;
		clasificacion="";
		descripcion="";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setClasificacion(String clas) {
		this.clasificacion = clas;
	}
	
	public String getClasificacion() {
		return clasificacion;
	}
	
	public void setDescripcion(String clas) {
		this.descripcion = clas;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

}
