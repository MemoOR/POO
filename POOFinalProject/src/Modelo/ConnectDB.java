package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	//Configuracion de la base de datos obtenida del archivo DBconfig
	//Por seguridad DBConfig no se subira al repositorio
	private static Connection conn; //Objeto de tipo Connection 
	private static final String driver = DBconfig.getDriver();
	private static final String user = DBconfig.getUser();
	private static final String password = DBconfig.getPassword();
	
	private static final String url = DBconfig.getUrl();
	
	public ConnectDB() {
		conn = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		}catch (ClassNotFoundException | SQLException e){
			
			System.out.println("NO Se conect�");
		}
	}
 
	// Recupera el objeto de tipo Connection
	public static Connection getConnection(){
		return conn;
	}

	// M�todo para cerrar la conexi�n. 
	public void DesConnection(){
		conn = null;
		if(conn == null){
			System.out.println("Termin� conexi�n");
		}
   }
}