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
//		String[] inQuery = new String[12];
//		
//		if(options[0] == 0 && options[0] == 0 && options[0] == 0 && options[0] == 0 &&
//		   options[0] == 0 && options[0] == 0 && options[0] == 0 && options[0] == 0 &&
//		   options[0] == 0 && options[0] == 0 && options[0] == 0 && options[0] == 0) {
//			
//		}
		
		query = "SELECT " 
			    + "COUNT(ID_CASO) FROM DATOS_COVID WHERE " 
			    + "SEXO IN(1, 2, 3) AND " 
			    + "ENTIDAD_RES IN(SELECT ID_ENTIDAD FROM ENTIDADES) AND " 
			    + "DEFUNCION IN(1, 2) AND " 
			    + "DIABETES IN(SELECT ID_SN FROM SI_NO) AND " 
			    + "EPOC IN(SELECT ID_SN FROM SI_NO) AND " 
			    + "ASMA IN(SELECT ID_SN FROM SI_NO) AND " 
			    + "HIPERTENSION IN(SELECT ID_SN FROM SI_NO) AND " 
			    + "CARDIOVASCULAR IN(SELECT ID_SN FROM SI_NO) AND " 
			    + "OBESIDAD IN(SELECT ID_SN FROM SI_NO) AND "
			    + "TABAQUISMO IN(SELECT ID_SN FROM SI_NO) AND "
			    + "DIABETES IN(SELECT ID_SN FROM SI_NO) AND "
			    + "CLASIFICACION IN(SELECT ID_CLASIFICACION FROM CLASIFICACION) "
			    + "GROUP BY DEFUNCION";
		return query;
	}
}
