import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect {

	public static Connection getConnection() throws Exception {
//		FileInputStream fis = new FileInputStream("application.properties");
		Properties p = new Properties();
		p.setProperty("url", "jdbc:mysql://localhost:3306/technocrats");
		p.setProperty("user", "root");
		p.setProperty("password", "root");
//		p.load(fis);
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection(p.get("url").toString(), p.getProperty("username"), p.getProperty("password"));
		Connection con = DriverManager.getConnection(p.get("url").toString(), p);
		System.out.println("Connection Established");
		return con;
	}

}
