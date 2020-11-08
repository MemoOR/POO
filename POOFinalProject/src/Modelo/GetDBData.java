package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GetDBData {
	ConnectDB newConnection;
	
	public GetDBData(){
		newConnection = new ConnectDB();
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
}
