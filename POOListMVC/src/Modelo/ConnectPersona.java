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

	public ArrayList<ModeloPersona> listaPersonas(){
		
		ArrayList<ModeloPersona> listaPersonas = new ArrayList<ModeloPersona>();
		ModeloPersona persona;
		
		try{
			// recupera la conexion
			Connection conn = ConnectDB.getConnection();
			// depende del nombre de su tabla. 
			PreparedStatement prest = conn.prepareStatement("SELECT * FROM PERSONAS");
            ResultSet rs = prest.executeQuery();
            
            while(rs.next()){
            	// Lee cada uno de las columnas de la tabla
            	persona = new ModeloPersona();
            	persona.setId(rs.getInt(1));
            	persona.setNombre(rs.getString(2));
            	persona.setApaterno(rs.getString(3));
            	persona.setAMaterno(rs.getString(4));
            	persona.setEdad(rs.getInt(5));
            	listaPersonas.add(persona);
            }
		}catch(Exception ex){
			
			ex.printStackTrace () ;	  
			System.out.println(" SQLException : " + ex.getMessage() );	
			
		}
		return listaPersonas;
	}

}
