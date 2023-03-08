package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectMoveDemo
{
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select * from student1");
			rs.absolute(2);
			System.out.print(rs.getInt("rollno")+"\t");
			System.out.print(rs.getString("sname")+"\t");
			System.out.println(rs.getInt("marks"));
			System.out.println(rs);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
