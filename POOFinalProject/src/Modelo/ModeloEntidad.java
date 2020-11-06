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
