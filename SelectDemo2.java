package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class SelectDemo2 {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
			ResultSetMetaData rm=rs.getMetaData();
			int n=rm.getColumnCount();
			for(int i=1;i<=n;i++)
			{
				System.out.print(rm.getColumnName(i)+"\t");
			}
			System.out.println();
			/* while(rs.next())
			{
				System.out.print(rs.getInt("rollno")+"\t");
				System.out.print(rs.getString("sname")+"\t");
				System.out.println(rs.getInt("marks"));
			}
			*/
			while(rs.next())
			{
				for(int i=1;i<=n;i++)
				{
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
			/*the above steps are also used to retrieve data from database*/
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
