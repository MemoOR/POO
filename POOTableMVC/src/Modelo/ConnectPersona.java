package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectPersona {
	ConnectDB newConnection;
	
	public ConnectPersona(){
		newConnection = new ConnectDB();
	}

	public ArrayList<ModeloTableCNames> listaColumnas(){
		//Nombres de columnas
		ArrayList<ModeloTableCNames> ColumnNames = new ArrayList<>();
		ModeloTableCNames Name = new ModeloTableCNames();
		
		try {
			// recupera la conexion
			Connection conn = ConnectDB.getConnection();
			Statement stmt = conn.createStatement();
			try {
			    ResultSet rs = stmt.executeQuery( "SELECT column_name FROM "
						+ "USER_TAB_COLUMNS WHERE table_name = 'PERSONAS'" );
			    try {
			        while ( rs.next() ) {
			        	Name = new ModeloTableCNames();
		            	Name.setColumn(rs.getString(1));
		            	ColumnNames.add(Name);
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
    	return ColumnNames;
	}
	
	
	public ArrayList<ModeloPersona> listaPersonas(){
		
		//Datos de la Tabla
		ArrayList<ModeloPersona> listaPersonas = new ArrayList<ModeloPersona>();
		ModeloPersona persona;
		
		try{
			// recupera la conexion
			Connection conn = ConnectDB.getConnection();
			Statement stmt = conn.createStatement();
			try {
			    ResultSet rs = stmt.executeQuery("SELECT * FROM PERSONAS");
			    try {
			        while ( rs.next() ) {
			        	persona = new ModeloPersona();
		            	persona.setId(rs.getInt(1));
		            	persona.setNombre(rs.getString(2));
		            	persona.setApaterno(rs.getString(3));
		            	persona.setAMaterno(rs.getString(4));
		            	persona.setEdad(rs.getInt(5));
		            	listaPersonas.add(persona);
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
		return listaPersonas;
	}

}
