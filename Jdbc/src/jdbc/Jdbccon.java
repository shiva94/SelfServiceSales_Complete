package jdbc;
import java.sql.DriverManager;
import java.sql.*;
public class Jdbccon {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //Registering JDBC driver
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger"); //Opening connection
			
			Statement st = con.createStatement(); //Executing query
			//Statement st1 = con.createStatement();
			//String sq1 = "select * from emp";
			String sq2 = "update emp set empno=1114 where ENAME='JONES' ";
			//String sq1= "select * from holidays";
			//String sq1="delete from emp where ename='ALLEN' ";
			
			st.executeQuery(sq2);
			System.out.println("hi..");
			
			ResultSet rs= st.executeQuery("select * from w");
			//System.out.println(rs2.next());
			
			while(rs.next())
			{
				System.out.println("Updated");
				System.out.println(rs.getInt(1)+" "+ rs.getInt(2));
			}
			//System.out.println(rs2.next());
			rs = st.executeQuery("select * from holiday");
			while(rs.next())
			{
				//System.out.println("Updated");
				System.out.println(rs.getDate(1)+" "+ rs.getString(2));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
