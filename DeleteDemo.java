package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id of the student to delete: ");
			int id=sc.nextInt();
			con.setAutoCommit(false);
			PreparedStatement pstmt=con.prepareStatement("delete from student1 where rollno=?");
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			System.out.println("Do you want to save changes yes/no");
			String option=sc.next();
			if(option.equalsIgnoreCase("yes"))
			{
				con.commit();
				System.out.println("One record deleted successfully");
			}else {
				con.rollback();
				System.out.println("Cancel successfully");
			}
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
