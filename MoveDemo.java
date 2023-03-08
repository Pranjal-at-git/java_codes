package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MoveDemo {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			/*retrieving data using Enhanced ResultSet methods*/
			/*
			ResultSet rs=stmt.executeQuery("select rollno, sname, marks from student1");
			rs.absolute(3);
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3));
			*/
			/* UPDATING RECORD
			ResultSet rs=stmt.executeQuery("select rollno,sname,marks from student1");
			rs.absolute(3);
		    rs.updateInt(3, 50);
			rs.updateString(2,"VENKATESH");
			rs.updateRow();
			System.out.println("one record updated successfully");
			*/
			/* DELETING RECORD
			ResultSet rs=stmt.executeQuery("select rollno,sname,marks from student1");
			rs.absolute(6);
			rs.deleteRow();
			System.out.println("one record deleted succesfully");
			*/
			/*Inserting new record to db*/
			ResultSet rs=stmt.executeQuery("select rollno,sname,marks from student1");
			rs.moveToInsertRow();
			rs.updateInt(1,9);
			rs.updateString(2,"jones");
			rs.updateInt(3,49);
			rs.insertRow();
			System.out.println("one record inserted successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
