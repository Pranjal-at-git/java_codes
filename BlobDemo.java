package p1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mydb6pm","mydb6pm");
			PreparedStatement pstmt=con.prepareStatement("insert into images values(?,?)");
			pstmt.setString(1,args[0]);
			FileInputStream fis=new FileInputStream(args[1]);
			pstmt.setBinaryStream(2,fis, fis.available());
			pstmt.executeUpdate();
			System.out.println("One image inserted to db");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
