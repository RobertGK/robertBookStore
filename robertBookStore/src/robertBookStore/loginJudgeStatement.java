package robertBookStore;
import java.sql.*;

public class loginJudgeStatement {
	public static void main(String [] args){
		System.out.println(new loginJudgeStatement().loginJudge("houguohui","102866"));
		
	}
	public String loginJudge(String user,String password){
		String s = "can't get the result";
		try{			
			SqlConnections sqlconn = new SqlConnections();
			Connection conn = sqlconn.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from robertid where name = '" + user +"'");
//			System.out.println("ok");
			while(rs.next()){
				String pass = rs.getString(3);
//				System.out.println(rs.getString(3));
				if(password.equals(pass)){
					s= "right";
				}
				else
					s =  "wrong";
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return s;
	}
}
