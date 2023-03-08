package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingScanr {

	public static void main(String[] args)
	{
		String option2;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			do {
				System.out.println("Enter rollno : ");
				int rollno=sc.nextInt();
				System.out.println("Enter name : ");
				String name=sc.next();
				System.out.println("Enter marks : ");
				int marks=sc.nextInt();
				con.setAutoCommit(false);
				PreparedStatement pstmt=con.prepareStatement("insert into student1 values(?,?,?)");
				pstmt.setInt(1, rollno);
				pstmt.setString(2, name);
				pstmt.setInt(3, marks);
				pstmt.executeUpdate();
				/*creating save or cancel option*/
				System.out.println("do you want to save/cancel? ");
				String option=sc.next();
			
				if(option.equalsIgnoreCase("Save"))
				{
					con.commit();
					System.out.println("One record inserted successfully");
				}else if(option.equalsIgnoreCase("Cancel"))
				{
					con.rollback();
					System.out.println("Cancel successfully");
				}else
				{
					System.out.println("Invalid option");
				}
				System.out.println("Do you want to continue? ");
				option2=sc.next();
			}while(option2.equalsIgnoreCase("Yes"));
			
			sc.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
