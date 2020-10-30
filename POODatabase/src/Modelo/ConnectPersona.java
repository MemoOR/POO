package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConnectPersona {
	ConnectDB newConnection;
	
	public ConnectPersona(){
		newConnection = new ConnectDB();
	}

	public ArrayList<ModeloPer> listaPersonas(){
		
		ArrayList<ModeloPer> listaPersonas = new ArrayList<ModeloPer>();
		ModeloPer persona;
		
		try{
			// recupera la conexion
			Connection conn = ConnectDB.getConnection();
			// depende del nombre de su tabla. 
			PreparedStatement prest = conn.prepareStatement("SELECT * FROM PERSONAS");
            ResultSet rs = prest.executeQuery();
            
            while(rs.next()){
            	// Lee cada uno de las columnas de la tabla
            	persona = new ModeloPer();
            	persona.setId(rs.getInt(1));
            	persona.setNombre(rs.getString(2));
            	persona.setAMaterno(rs.getString(3));
            	persona.setApaterno(rs.getString(4));
            	listaPersonas.add(persona);
            }
		}catch(Exception ex){
			
			ex.printStackTrace () ;	  
			System.out.println(" SQLException : " + ex.getMessage() );	
			
		}
		return listaPersonas;
	}

}
