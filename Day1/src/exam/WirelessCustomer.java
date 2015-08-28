package exam;
import java.util.Scanner;
public class WirelessCustomer extends CustomerForTelecomServices {
	Scanner s = new Scanner(System.in);
	public int num1;
	public String cname1;
	public int speed1;
	public int usage1;
	public int limit1;
	public int  bal1;
	@Override
	public void custNo() {
		// TODO Auto-generated method stub
		System.out.println("Enter the cust num");
		num1=s.nextInt();
	}

	@Override
	public void custName() {
		// TODO Auto-generated method stub
		System.out.println("Enter the cust name");
		cname1=s.nextLine();
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Enter the speeed");
		speed1=s.nextInt();
	}
	public void dLimit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the limit");
		limit1=s.nextInt();
	}

	@Override
	public void CUsage() {
		// TODO Auto-generated method stub
		System.out.println("Enter the usage");
		usage1=s.nextInt();
	}
	
	public void bal()
	{
	 bal1=limit1-usage1; 
	}
	public void display()
	{
		System.out.println("The customer details are");
		System.out.println("Cust num "+ num1);
		System.out.println("Cust name "+ cname1);
		System.out.println("Speed "+ speed1);
		System.out.println("limit "+ limit1);
		System.out.println("usage "+ usage1);
		System.out.println("Balance "+ bal1);
		
		
	}

}
