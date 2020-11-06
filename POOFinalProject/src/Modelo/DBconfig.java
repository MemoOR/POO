package Modelo;

public class DBconfig {
	
	private static final String user = "MEMOOR";
	private static final String password = "DBApasMOR";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	
	public static String getUser() {
		return user;
	}
	public static String getPassword() {
		return password;
	}
	public static String getUrl() {
		return url;
	}
	public static String getDriver() {
		return driver;
	}
	

}
