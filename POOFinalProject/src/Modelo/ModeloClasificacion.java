/* @file ModeloClasificacion.java
*  @brief Modelo de datos para obtener la 
*  clasificación de pacientes en la base de datos
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

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
	
	public void setDescripcion(String des) {
		this.descripcion = des;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

}
