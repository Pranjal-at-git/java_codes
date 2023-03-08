package p1;

import java.sql.*;

public class InsertDemo {
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student1 values(2,'syam',85)");
			//stmt.executeUpdate("update student1 set marks=99 where rollno=1");
			System.out.println("One record inserted successFully");

		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
