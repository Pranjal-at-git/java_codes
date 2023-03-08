package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
public class DatabaseOperation 
{
	Connection con;
	public void establishConn()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			System.out.println("Connection Established Successfully");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertData(int roll,String name,int marks)
	{
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into student1 values(?,?,?)");
			pstmt.setInt(1, roll);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks);
			pstmt.executeUpdate();
			System.out.println("One record "+ roll+" inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void UpdateRecord(int rollno,int marks)
	{
		try {
			PreparedStatement pstmt=con.prepareStatement("update student1 set marks=? where rollno=?");
			pstmt.setInt(1, marks);
			pstmt.setInt(2, rollno);/*here we providing data in order of query 1st marks then rollno*/
			pstmt.executeUpdate();
			System.out.println("One record "+rollno+" updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteRecord(int rollno)
	{
		
		try {
			PreparedStatement pstmt = con.prepareStatement("delete from student1 where rollno=?");
			pstmt.setInt(1, rollno);
			pstmt.executeUpdate();
			System.out.println("one Record "+ rollno +" deleted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void showTable()
	{
		try {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		String choice;
		DatabaseOperation dobj=new DatabaseOperation();
		dobj.establishConn();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Your choice :\n 1. insert record \n 2. update record \n 3. delete record \n 4. show table");
			int option=sc.nextInt();
			switch(option)
			{
			case 1: 
				System.out.println("enter rollno :");
			       int rollno=sc.nextInt();
			       System.out.println("enter name :");
			       String sname=sc.next();
			       System.out.println("enter marks :");
			       int marks=sc.nextInt();
			       dobj.insertData(rollno, sname, marks);
			       break;
			case 2: 
				System.out.println("enter rollno to update ");
				int roll=sc.nextInt();
				System.out.println("Enter new Marks to update");
				int mark=sc.nextInt();
				dobj.UpdateRecord(roll, mark);
				break;
			case 3: 
				System.out.println("Enter the rollno to delete a record");
				int roll2=sc.nextInt();
				dobj.deleteRecord(roll2);
				break;
			case 4:
				dobj.showTable();
				break;
			default:
				System.out.println("Invalid option "+option);
			}
			System.out.println("\n---------------------------------------------------");
			System.out.println("Do you want to continue opetaion yes/no");
		    choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		sc.close();
	}
}
