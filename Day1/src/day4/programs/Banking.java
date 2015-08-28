package day4.programs;

import java.util.Scanner;

public class Banking{
	Scanner in =new Scanner(System.in);
	public int dep;
	public int withDraw;
	public int bal;
	public void depositMoney()
	{
		System.out.println("Enter the amount you want to deposit");
		dep=in.nextInt();
		System.out.println("Amount :" +dep);
		bal=dep;
	}
	
	public void withdrawMoney() throws ExcepClass
	{
		System.out.println("Enter the amount to be withdrawn");
		withDraw=in.nextInt();  
		if(bal<withDraw)
		{
			throw new ExcepClass("Insufficient Balance");
		}
		
		else
		{
			bal=dep-withDraw;
		}
	}
	
	public void	balance()
	{
		System.out.println("Remaining balance in your account: "+bal);
	}
	

public static void main(String[] args) {
	
		Banking b =new Banking();
		b.depositMoney();
		try
		{
			b.withdrawMoney();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		b.balance();

	}
}