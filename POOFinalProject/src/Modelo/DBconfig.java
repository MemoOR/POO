package Modelo;

public class DBconfig {
	
	private static final String username = "MEMOOR";
	private static final String password = "DBApassMOR";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	
	//Obtiene el usuario de la base de datos
	public static String getUsername() {
		return username;
	}
	
	//Obtiene la contraseña de usuario
	public static String getPassword() {
		return password;
	}
	
	//Obtiene el url de coneccion a la base de datos
	public static String getUrl() {
		return url;
	}

	public static String getDriver() {
		return driver;
	}

}
