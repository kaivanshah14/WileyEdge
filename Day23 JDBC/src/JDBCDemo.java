import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/kaidb";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established");


//		st.execute("create table users (id int AUTO_INCREMENT, username varchar(255) NOT NULL,"
//				+ " password varchar(255) NOT NULL, PRIMARY KEY(id))");
//		st.execute("drop table users");
//		st.executeUpdate("insert into users(username,password) values ('raj','raj123')");
//		ResultSet rs = st.executeQuery("select * from users");
//		while (rs.next()) {
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//		}

		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username and password to log in");
		String u = sc.nextLine();
		String p = sc.nextLine();
		PreparedStatement ps = con.prepareStatement("select username,password from users where username=? and password=?");
		ps.setString(1, u);
		ps.setString(2, p);
		ResultSet rs2 = ps.executeQuery();
//		while (rs2.next()) {
//			System.out.println(rs2.getString(1) + " " + rs2.getString(2));
//		}
//		if (!(rs2.getString(2).equals(u) && rs2.getString(3).equals(p)))
		if (!rs2.isBeforeFirst()) {
			System.out.println("Username and/or Password is incorrect, " + "do you wish to add a new combination?"
					+ " \nEnter 'Y' for Yes and 'N' for No");
			String k = sc.nextLine();
			if (k.equals("Y")) {
				System.out.println("You opted for Yes, now adding your combination");
				PreparedStatement ps2 = con.prepareStatement("insert into users(username,password) values (?,?)");
				ps2.setString(1, u);
				ps2.setString(2, p);
				int i = ps2.executeUpdate();
				System.out.println(i + " rows added");
				ps2.close();
			} else {
				System.out.println("You opted for No, now exiting program");
			}
		}
		else {
			System.out.println("Welcome " + u + " you have successfully logged in");
		}
		rs2.close();
		ps.close();
		st.close();
		con.close();
	}

}
