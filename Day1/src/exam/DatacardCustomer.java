package exam;
import java.util.Scanner;
public class DatacardCustomer extends CustomerForTelecomServices {
	Scanner in = new Scanner(System.in);
	public int cno;
	public String cname;
	public int speed;
	public int usage;
	public int  limit;
	public int bal;
	@Override
	public void custNo() {
		// TODO Auto-generated method stub
		System.out.println("Enter the customer number");
		cno=in.nextInt();
	}

	@Override
	public void custName() {
		// TODO Auto-generated method stub
		System.out.println("Enter the customer name");
		cname=in.nextLine();
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Speed");
		speed=in.nextInt();
	}
	public void dLimit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the limit");
		limit=in.nextInt();
	}
	@Override
	public void CUsage() {
		// TODO Auto-generated method stub
		System.out.println("Enter the usage");
		usage=in.nextInt();
	}
	
	public void bal()
	{
	 bal=limit-usage; 
	 System.out.println("bal is"+bal);
	}
	
	public void display()
	{
		System.out.println("The customer details are");
		System.out.println("Cust num "+ cno);
		System.out.println("Cust name "+ cname);
		System.out.println("Speed "+ speed);
		System.out.println("limit "+ limit);
		System.out.println("usage "+ usage);
		System.out.println("Balance "+ bal);
		
		
	}
	
	

}
