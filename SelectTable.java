package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class SelectTable {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			PreparedStatement pstmt=con.prepareStatement("select * from student1");
			ResultSet rs=pstmt.executeQuery();
			ResultSetMetaData rm=rs.getMetaData();
			int n=rm.getColumnCount();
			for(int i=1;i<=n;i++)
			{
				System.out.print(rm.getColumnName(i)+"\t"); 
			}
			System.out.println();
			while(rs.next())
			{
				System.out.print(rs.getInt("rollno")+"\t");
				System.out.print(rs.getString("sname")+"\t");
				System.out.println(rs.getInt("marks"));
			}
		}catch(Exception e)
		{}
	}

}
