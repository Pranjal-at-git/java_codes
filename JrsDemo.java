package p1;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JrsDemo 
{
	public static void main(String[] args) 
	{
		try {
			JdbcRowSet jrs=new OracleJDBCRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jrs.setUsername("mydb6pm");
			jrs.setPassword("mydb6pm");
			jrs.setCommand("select * from student1");
			jrs.execute();
			while(jrs.next())
			{
				System.out.print(jrs.getInt("rollno")+"\t");
				System.out.print(jrs.getString("sname")+"\t");
				System.out.println(jrs.getInt("marks"));
			}
		}catch(Exception e)
		{
		 System.out.println(e);	
		}
		}
}
