package students;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class Connect implements IConnection{
	public Connection createConnection() {
		String URL="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="iamengineer";
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(URL,username,password);
			Statement stmt=con.createStatement();
			String querry=" CREATE TABLE IF NOT EXISTS students (\r\n"
				       + " id INT AUTO_INCREMENT PRIMARY KEY,\r\n"
				       + " name VARCHAR(100) NOT NULL,\r\n"
				       + " age INT);";
			stmt.executeUpdate(querry);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}
}
