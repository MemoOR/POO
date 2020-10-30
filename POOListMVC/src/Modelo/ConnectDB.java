package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private static Connection conn; //Objeto de tipo Connection 
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String user = "admin";
	private static final String password = "admin";
	
	private static final String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
	
	public ConnectDB() {
		conn = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			
			if (conn != null){
				System.out.println("Se conect�");
			}
			
		}catch (ClassNotFoundException | SQLException e){
			
			System.out.println("NO Se conect�");
		}
	}
 
	// Recupera el objeto de tipo Connection
	public static Connection getConnection(){
		return conn;
	}

	// M�todo para cerrar la conexi�n. 
	public void DesConnecton(){
		conn = null;
		if(conn == null){
			System.out.println("Termin� conexi�n");
		}
   }
}