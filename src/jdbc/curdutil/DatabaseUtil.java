package jdbc.curdutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	private static final String ORACLE_USER ="hr";
	private static final String ORACLE_PASSWORD ="hr";
	private static final String MYSQL_USER ="root" ;
	private static final String MYSQL_PASSWORD ="mysql";
	private static final String ORACLE_CONNECTION_STRING ="jdbc:oracle:thin:@localhost:1521:exe";
	private static final String MYSQL_CONNECTION_STRING ="jdbc:mysql://localhost:3306/adv_java";
	
	
	private static Connection getConnection(DatabaseType databaseType ) {
		switch (databaseType) {
		case ORACLEDB:{
			
			Connection connection =null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			
			
	
			  connection = DriverManager.getConnection(ORACLE_CONNECTION_STRING, ORACLE_USER, ORACLE_PASSWORD);
				return connection;
				
			} catch (ClassNotFoundException e) {
				System.out.println("Exception :>>"+e);
				
				
			} catch (SQLException e) {
				System.out.println("Exception :>>"+e);
				
			}
			return connection;
		}
		case MYSQLDB:{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING,MYSQL_USER,MYSQL_PASSWORD);
				return connection;
				
			} catch (ClassNotFoundException e) {
				System.out.println("Exception :>>"+e);
				
				
			} catch (SQLException e) {
				System.out.println("Exception :>>"+e);
			
		
		}
		}
	}
	return null;
}

    static public  void testOracleConnection() {
    	Connection connection =null;
    	connection =DatabaseUtil.getConnection(DatabaseType.ORACLEDB);
    	System.out.println("connected to oracle");
    }
    
    static public  void testMYSQLConnection() {
    	Connection connection =null;
    	connection =DatabaseUtil.getConnection(DatabaseType.MYSQLDB);
    	System.out.println("connected to Mysql");
    
			
		}
		
}
