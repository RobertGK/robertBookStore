package robertBookStore;
import java.sql.*;

public class SqlConnections{
	private static String url = "jdbc:mysql://localhost:3306/robertbook";
	private static String user = "root";
	private static String password = "HOUguohui102866" ;
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			System.out.println("can't find the driver!");
		}
	}
	static Connection conn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Connection getConnection(){
		if(conn == null){
			try{
				conn = DriverManager.getConnection(url,user,password);
			}
			catch(SQLException e){
				System.out.println("can't build the connection!");
			}
		}
		return conn;
	}
}
