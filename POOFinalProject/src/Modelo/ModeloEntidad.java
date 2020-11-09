/* @file ModeloEntidad.java
*  @brief Modelo de datos para obtener de la base de 
*  datos los nombres de las entidades 
*
*  @author Guillermo Ortega Romo
*  @date 09/11/2020
*/

package Modelo;

public class ModeloEntidad {
	// de  acuerdo a los campos de la BD
		int id;
		String entidad;
		
		public ModeloEntidad(){
			id=0;
			entidad="";
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		public void setEntidad(String Entidad) {
			this.entidad = Entidad;
		}
		
		public String getEntidad() {
			return entidad;
		}
}
