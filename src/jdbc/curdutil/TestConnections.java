package jdbc.curdutil;

public class TestConnections {
	public static void main(String[] args) {
		DatabaseUtil.testOracleConnection();
		DatabaseUtil.testMYSQLConnection();
	}

}
