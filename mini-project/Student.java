package students;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student implements IStudent {
	Scanner sc=new Scanner(System.in);
	Connection con;
	public Student() {
		IConnection db= new Connect();
		con=db.createConnection();
	}
	public void insertstudent() {
		
		try {
			System.out.print("Enter the name:");
			String name=sc.nextLine();
			System.out.print("Enter the age:");
			int age=sc.nextInt();
			Statement stmt=con.createStatement();
			String querry="INSERT INTO students(name,age) VALUES('"+name+"',"+age+");"; 
			System.out.println("Data successfully inserted");
			stmt.executeUpdate(querry);
			}
		catch(Exception e){
			System.out.print("ERROR :"+e.getMessage());
		}
	}
	public void insertmultiplestudent() {
		try {
			System.out.print("how many student to insert:");
			int count=sc.nextInt();
			sc.nextLine();
			String querry1="INSERT into students(name,age) VALUES(?,?);";
			PreparedStatement psmt=con.prepareStatement(querry1);
			for(int i=1;i<=count;i++) {
				System.out.print("Enter the name:");
				String name=sc.nextLine();
				System.out.print("Enter the age:");
				int age=sc.nextInt();
				sc.nextLine();
				
				psmt.setString(1, name);
				psmt.setInt(2, age);
				psmt.executeUpdate();
				System.out.println("Data successfully inserted");
			}
		}
		catch(Exception e) {
			System.out.print("ERROR :"+e.getMessage());
		}
	}
	public void updatestudent() {
		try {
			System.out.print("Enter the name:");
			String name=sc.nextLine();
			System.out.print("Enter the age:");
			int age=sc.nextInt();
			System.out.print("Enter the id:");
			int id=sc.nextInt();
			Statement stmt=con.createStatement();
			String querry="UPDATE students SET name='"+name+"',age="+age+" WHERE id="+id+";"; 
			int check=stmt.executeUpdate(querry);
			if(check>0) {
				System.out.println("Data successfully updated");
			}
			else {
				System.out.println("id not found");
			}
			}
		catch(Exception e) {
			System.out.print("ERROR:"+e.getMessage());
		}
	}
	public void updatemultiplestudent() {
		try {
			System.out.print("how many student to update:");
			int count=sc.nextInt();
			sc.nextLine();
			String querry2="UPDATE students SET name=?,age=? WHERE id=?";
			
			PreparedStatement psmt=con.prepareStatement(querry2);
			for(int i=1;i<=count;i++) {
				System.out.print("Enter the name:");
				String name=sc.nextLine();
				System.out.print("Enter the age:");
				int age=sc.nextInt();
				System.out.print("Enter the id:");
				int id=sc.nextInt();
				sc.nextLine();
				
				psmt.setString(1, name);
				psmt.setInt(2, age);
				psmt.setInt(3, id);
				int check=psmt.executeUpdate();
				if(check>0) {
					System.out.println("Data successfully updated");
				}
				else {
					System.out.println("id not found");
				}
			}
		}
		catch(Exception e) {
			System.out.print("ERROR:"+e.getMessage());
		}
	}
	public void deletestudent() {
		try {
			System.out.print("Enter the id:");
			int id=sc.nextInt();
			Statement stmt=con.createStatement();
			String querry="delete from students WHERE id="+id+";"; 
			int check=stmt.executeUpdate(querry);
			if(check>0) {
				System.out.println("Data successfully deleted");
			}
			else {
				System.out.println("id not found");
			}
			}
		catch(Exception e) {
			System.out.print("ERROR:"+e.getMessage());
		}
	}
	public void deletemultiplestudent() {
		try {
			System.out.print("how many student to delete:");
			int count=sc.nextInt();
			sc.nextLine();
			String querry2="delete from students WHERE id=?;";
			
			PreparedStatement psmt=con.prepareStatement(querry2);
			for(int i=1;i<=count;i++) {
				System.out.print("Enter the id:");
				int id=sc.nextInt();
				sc.nextLine();
				
				psmt.setInt(1, id);
				int check=psmt.executeUpdate();
				if(check>0) {
					System.out.println("Data successfully deleted");
				}
				else {
					System.out.println("id not found");
				}
			}
		}
		catch(Exception e) {
			System.out.print("ERROR:"+e.getMessage());
		}
	}
	public void showstudent() {
		try {
			Statement stmt=con.createStatement();
			String querry="select * from students;";
			ResultSet rs=stmt.executeQuery(querry);
			while(rs.next()) {
				System.out.println("Id:-"+rs.getInt("id"));
				System.out.println("Name:-"+rs.getString("name"));
				System.out.println("Age:-"+rs.getInt("age"));
				System.out.println("Data successfully showed");
			}
		}
		catch(Exception e) {
			System.out.print("ERROR:"+e.getMessage());
		}
	}
	public void exit() {
		try {
			System.out.println("Thank you for using database");
			con.close();
		}
		catch(Exception e) {
			System.out.print("ERROR:"+e.getMessage());
		}
	}
}
