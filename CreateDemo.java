package p1;
import java.sql.*;
public class CreateDemo 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			System.out.println("Connection established successfully");
			Statement stmt=con.createStatement();
			stmt.execute("create table student1(rollno int primary key,sname varchar2(10), marks number(10))");
			System.out.println("Table student1 created");
		}catch(Exception e)
		{
			System.err.println(e);
		}
		
	}
}
