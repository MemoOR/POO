package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class GetDBData {
	ConnectDB newConnection;
	
	public GetDBData(){
		newConnection = new ConnectDB();
		newConnection.setConnection();
	}

	//Obtiene de la base de datos el nombre de las entidades
	//para insertarlos en el Combobox
	public ArrayList<ModeloEntidad> listaEntidades(){
		//Nombres de columnas
		ArrayList<ModeloEntidad> Entidades = new ArrayList<>();
		ModeloEntidad Name = new ModeloEntidad();
		
		try {
			// recupera la conexion
			Connection conn = ConnectDB.getConnection();
			Statement stmt = conn.createStatement();
			try {
			    ResultSet rs = stmt.executeQuery( "SELECT ENTIDAD FROM ENTIDADES" );
			    try {
			        while ( rs.next() ) {
			        	Name = new ModeloEntidad();
		            	Name.setEntidad(rs.getString(1));
		            	Entidades.add(Name);
			        }
			    } finally {
			        try { rs.close(); } catch (Exception ignore) { }
			    }
			} finally {
			    try { stmt.close(); } catch (Exception ignore) { }
			}
		}catch(Exception ex){
    			
			ex.printStackTrace () ;	  
			System.out.println(" SQLException : " + ex.getMessage() );	
			
		}
    	return Entidades;
	}
	
	//Obtiene de la base de datos el tipo de clasificacion final
	//para insertarlos en el segundo Combobox
	public ArrayList<ModeloClasificacion> listaClasificacion(){
		//Nombres de columnas
		ArrayList<ModeloClasificacion> clasificacion = new ArrayList<>();
		ModeloClasificacion Tipo = new ModeloClasificacion();
		
		try {
			// recupera la conexion
			Connection conn = ConnectDB.getConnection();
			Statement stmt = conn.createStatement();
			try {
			    ResultSet rs = stmt.executeQuery( "SELECT * FROM CLASIFICACION" );
			    try {
			        while ( rs.next() ) {
			        	Tipo = new ModeloClasificacion();
			        	Tipo.setId(rs.getInt(1));
		            	Tipo.setClasificacion(rs.getString(2));
		            	Tipo.setDescripcion(rs.getString(3));
		            	clasificacion.add(Tipo);
			        }
			    } finally {
			        try { rs.close(); } catch (Exception ignore) { }
			    }
			} finally {
			    try { stmt.close(); } catch (Exception ignore) { }
			}
		}catch(Exception ex){
    			
			ex.printStackTrace () ;	  
			System.out.println(" SQLException : " + ex.getMessage() );	
			
		}
    	return clasificacion;
	}
	
	//obtiene de la base de datos la informacion para llenar el dataset
	//de la gráfica
	public ArrayList<ModeloDataset> listaDataset(int[] options){
		String query = createQuery(options);
		
		ArrayList<ModeloDataset> data = new ArrayList<>();
		ModeloDataset row = new ModeloDataset();
		
		try {
			// recupera la conexion
			Connection conn = ConnectDB.getConnection();
			Statement stmt = conn.createStatement();
			try {
			    ResultSet rs = stmt.executeQuery(query);
			    try {
			    	while(rs.next()) {
			    		row = new ModeloDataset();
			    		row.setCount(rs.getInt(1));
			    		data.add(row);
			    	}
			    } finally {
			        try { rs.close(); } catch (Exception ignore) { }
			    }
			} finally {
			    try { stmt.close(); } catch (Exception ignore) { }
			}
		}catch(Exception ex){
    			
			ex.printStackTrace () ;	  
			System.out.println(" SQLException : " + ex.getMessage() );	
			
		}
    	return data;
	}
	
	public String createQuery(int[] options) {
		String query = "";
		String[] inQuery = new String[12];
		
		getQueryEntSexEstClas(options, inQuery);
		getQuerySick(options, inQuery);

		query = "SELECT " 
			    + "COUNT(ID_CASO) FROM DATOS_COVID WHERE " 
			    + "ENTIDAD_RES IN(" + inQuery[0] + ") AND " 
			    + "SEXO IN(" + inQuery[1] + ") AND " 
			    + "DEFUNCION IN(" + inQuery[2] + ") AND " 
			    + "DIABETES IN(" + inQuery[3] + ") AND " 
			    + "EPOC IN(" + inQuery[4] + ") AND " 
			    + "ASMA IN(" + inQuery[5] + ") AND " 
			    + "HIPERTENSION IN(" + inQuery[6] + ") AND " 
			    + "CARDIOVASCULAR IN(" + inQuery[7] + ") AND " 
			    + "OBESIDAD IN(" + inQuery[8] + ") AND "
			    + "TABAQUISMO IN(" + inQuery[9] + ") AND "
			    + "CLASIFICACION IN(" + inQuery[10] + ") "
			    + "GROUP BY DEFUNCION";
		
		return query;
	}
	
	public void getQueryEntSexEstClas(int[] options, String[] inQuery) {
		
		//crea la porcion del query para validar la entidad elegida
		if(options[0] == 0)
			inQuery[0] = "SELECT ID_ENTIDAD FROM ENTIDADES";
		else
			inQuery[0] = String.valueOf(options[0]);
		
		//crea la porcion del query para validar el sexo elegido
		if(options[1] == 0)
			inQuery[1] = "1, 2, 3";
		else if(options[1] == 1)
			inQuery[1] = String.valueOf(options[1]);
		else if(options[1] == 2)
			inQuery[1] = String.valueOf(options[1]);
		
		//crea la porcion del query para validar la estadistica elegida
		if(options[2] == 0 || options[2] == 3)
			inQuery[2] = "1, 2";
		else if(options[2] == 1)
			inQuery[2] = "2";
		else if(options[2] == 2)
			inQuery[2] = "1";
		
		//crea la porcion del query para validar la clasificacion elegida
		if(options[10] == 0)
			inQuery[10] = "SELECT ID_CLASIFICACION FROM CLASIFICACION";
		else
			inQuery[10] = String.valueOf(options[10]);
	}
	
	public void getQuerySick(int[] options, String[] inQuery) {
		//crea la porcion del query para validar si se escogio Diabetes
		if(options[3] == 0 || options[3] == 2)
			inQuery[3] = "SELECT ID_SN FROM SI_NO";
		else if(options[3] == 1)
			inQuery[3] = String.valueOf(options[3]);
		
		//crea la porcion del query para validar si se escogio EPOC
		if(options[4] == 0 || options[4] == 2)
			inQuery[4] = "SELECT ID_SN FROM SI_NO";
		else if(options[4] == 1)
			inQuery[4] = String.valueOf(options[4]);
		
		//crea la porcion del query para validar si se escogio Asma
		if(options[5] == 0 || options[5] == 2)
			inQuery[5] = "SELECT ID_SN FROM SI_NO";
		else if(options[5] == 1)
			inQuery[5] = String.valueOf(options[5]);
		
		//crea la porcion del query para validar si se escogio Hipertensión
		if(options[6] == 0 || options[6] == 2)
			inQuery[6] = "SELECT ID_SN FROM SI_NO";
		else if(options[6] == 1)
			inQuery[6] = String.valueOf(options[6]);
		
		//crea la porcion del query para validar si se escogio Cardiovascular
		if(options[7] == 0 || options[7] == 2)
			inQuery[7] = "SELECT ID_SN FROM SI_NO";
		else if(options[7] == 1)
			inQuery[7] = String.valueOf(options[7]);
		
		//crea la porcion del query para validar si se escogio Obesidad
		if(options[8] == 0 || options[8] == 2)
			inQuery[8] = "SELECT ID_SN FROM SI_NO";
		else if(options[8] == 1)
			inQuery[8] = String.valueOf(options[8]);
		
		//crea la porcion del query para validar si se escogio Tabaquismo
		if(options[9] == 0 || options[9] == 2)
			inQuery[9] = "SELECT ID_SN FROM SI_NO";
		else if(options[9] == 1)
			inQuery[9] = String.valueOf(options[9]);
	}
}
