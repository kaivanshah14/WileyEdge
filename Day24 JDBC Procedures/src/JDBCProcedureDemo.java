import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCProcedureDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String url = "jdbc:mysql://localhost:3306/technocrats";
//		String username = "root";
//		String password = "root";
		
//		FileInputStream fis = new FileInputStream("application.properties");
//		Properties p = new Properties();
//		p.load(fis);
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println(p.get("url"));
//		Connection con = DriverManager.getConnection(p.get("url").toString(), p.getProperty("username"), p.getProperty("password"));
//		System.out.println("Connection Established");
		
		Connection con = DBConnect.getConnection();
		
//		CallableStatement c = con.prepareCall("{call getCustomerDataTest(?)}");
//		c.setString(1, "Yash");
//		ResultSet rs = c.executeQuery();
		
		CallableStatement c = con.prepareCall("{call getCustomerDataTest2(?,?)}");
		c.setString(1, "Yash");
		c.registerOutParameter(2, java.sql.Types.VARCHAR);
		
//		Querying and storing in result set for OUT procedure
//		ResultSet rs = c.executeQuery();
//		if(rs.wasNull()) System.out.println();
//		while(rs.next()) {
//			System.out.println(rs.getString(1) );
//		}
		
//		Checking if resultSet is empty or not for OUT Procedure
//		if(!rs.isBeforeFirst()) System.out.println("Empty");
//		else System.out.println("Not empty");
		
//		Executing Update and getting the address
//		c.executeQuery();
		System.out.println(c.execute() + " " + c.getString(2));
//		System.out.println(c.executeUpdate() + " " + c.getString(2));
		System.out.println(c.executeQuery() + " " + c.getString(2));
	}

}
