package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			Statement stmt=con.createStatement();
			stmt.addBatch("insert into student1 values(10,'mohan',65)");
			stmt.addBatch("update student1 set marks=30 where rollno=4");
			stmt.addBatch("delete from student1 where rollno=9");
			stmt.executeBatch();
			System.out.println("All record updated successfully");
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
