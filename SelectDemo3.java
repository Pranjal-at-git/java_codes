package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo3 {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			PreparedStatement pstmt=con.prepareStatement("select marks from student1 where rollno=?");
			pstmt.setInt(1,Integer.parseInt(args[0]));
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			System.out.println("Marks is : "+rs.getInt(1));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
