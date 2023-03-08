package p1;
import java.sql.*;
public class Demo {
	
public static void main(String[] args) {
	
	try {
		Class c= Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		System.out.println("Connection successdully established");
	}catch(Exception e)
	{
		System.out.println(e);
	}
}

}
