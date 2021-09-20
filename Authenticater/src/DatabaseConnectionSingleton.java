import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DatabaseConnectionSingleton {
	
	private static DatabaseConnectionSingleton instance;
	private Connection connection = null;
	private DatabaseConnectionSingleton() {
		try {
			String JdbcURL = "jdbc:mysql://localhost:3306/deneme?" + "autoReconnect=true&useSSL=false";
			connection = (Connection) DriverManager.getConnection(JdbcURL, "root", "1234");
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 } 
	 
	public static DatabaseConnectionSingleton getInstance() {

       if (instance == null) {
    	   instance = new DatabaseConnectionSingleton();
       }
       return  instance;	
	}
	
	 public Connection getConnection() {
		return connection;
	 } 	  
}
