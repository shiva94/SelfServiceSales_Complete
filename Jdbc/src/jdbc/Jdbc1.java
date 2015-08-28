package jdbc;
import java.sql.*;
import java.util.Scanner;
public class Jdbc1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //Registering JDBC driver
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger"); //Opening connection
			
			PreparedStatement st = con.prepareStatement("insert into empt1 values(?,?)"); 
			/*st.setInt(1, 8);
			st.setString(2, "abs");
			st.setString(3, "o");
			st.setInt(4,5000);*/
			st.setInt(1,in.nextInt());
			st.setString(2,"Rama");
			int i =st.executeUpdate();
			System.out.println(i + "Updated");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
