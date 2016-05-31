/**
 * 
 */

/**
 * @author Jimmy
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static ConnectionFactory instance = new ConnectionFactory();
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/VotingSystem";
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	
	static final String USER = "root"; 
	static final String PASS = "root";
	
	private ConnectionFactory() {
        try {
            Class.forName(JDBC_DRIVER);
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
     
    private Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }   
     
    public static Connection getConnection() {
        return instance.createConnection();
    }
	

}
