package Exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCconnectionQns {
	public static void main(String args[]) {
		try {
			//Load the JDBC driver
			Class.forName("com.mysql.jdbc.Diver");
			
			//Establish Connection
			String url = "jbdc:mysql://localhost:9000/test";
			String username = "root";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			//Create Statement
			Statement st = con.createStatement();
			
			//Execute Statement
			ResultSet rs = st.executeQuery("select name from studnet where district = 'kathmandu'");
			while(rs.next()) {
				String name = rs.getString("name");
				System.out.println("Name:" + name);
			}
			st.close();
			
		}catch(SQLException sqlExcep) {
			System.out.println("Error " + sqlExcep.getMessage());
		}
	}


}
