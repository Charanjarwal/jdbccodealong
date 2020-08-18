package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		//Register the Driver class
		Class.forName("oracle.jdbc.OracleDriver");
		//create the  Connection object
         Connection con=null;
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	    if(con!=null) {
	    	System.out.println("Connection Established");
	    }
          return con;
	}

}
