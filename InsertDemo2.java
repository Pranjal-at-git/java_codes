package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			PreparedStatement pstmt=con.prepareStatement("insert into student1 values(?,?,?)");
			pstmt.setInt(1,Integer.parseInt(args[0]));
			pstmt.setString(2,args[1]);
			pstmt.setInt(3,Integer.parseInt(args[2]));
			pstmt.executeUpdate();
			System.out.println("One record inserted");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

