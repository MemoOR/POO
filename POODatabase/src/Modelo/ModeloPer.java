package Modelo;

public class ModeloPer {
	// de  acuerdo a los campos de la BD
		int id;
		String nombre;
		String Apaterno;
		String AMaterno;
		
		public ModeloPer(){
			id=0;
			nombre="";
			Apaterno="";
			AMaterno="";
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApaterno() {
			return Apaterno;
		}

		public void setApaterno(String apaterno) {
			Apaterno = apaterno;
		}

		public String getAMaterno() {
			return AMaterno;
		}

		public void setAMaterno(String aMaterno) {
			AMaterno = aMaterno;
		}
}
