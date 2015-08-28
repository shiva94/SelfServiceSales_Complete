package jdbc;
import java.sql.*;
import java.util.Scanner;
public class Jdbc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver"); //Registering JDBC driver
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger"); //Opening connection
		Statement smt = con.createStatement();
		/*for(int i=0;i<2;i++)
		{
		PreparedStatement st = con.prepareStatement("insert into harry values(?,?,?,?,?)"); 
		System.out.println("Enter Name");
		st.setString(1,in.nextLine());
		System.out.println("Enter House");
		st.setString(2,in.nextLine());
		System.out.println("Enter role");
		st.setString(3, in.nextLine());
		System.out.println("Enter status");
		st.setString(4,in.nextLine());
		System.out.println("Is the character dead");
		st.setString(5, in.nextLine());
		int j =st.executeUpdate();
		}*/	
		String sq1="select name from harry where house='Gryffindor' ";
		ResultSet rs= smt.executeQuery(sq1);
		System.out.println();
		while(rs.next())
		{
			
			System.out.println(rs.getString(1));
		}
		System.out.println();
		String sq2="select name,house from harry where dies like 'No' order by house ";
		rs=smt.executeQuery(sq2);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
		System.out.println();
		String sq3= "select name from harry where status='Family' ";
		rs=smt.executeQuery(sq3);
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		System.out.println();
		String sq5="select name from harry where dies like 'Yes' and role like 'Faculty'  order by name asc";
		rs=smt.executeQuery(sq5);
		System.out.println("Died");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}