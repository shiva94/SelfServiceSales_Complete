package day2.programs;
import java.util.Scanner;
public class Men extends TredzIT{
	Scanner b = new Scanner(System.in);
	String [] bat= new String[11];
	public void batsmen()
	{
		
		System.out.println("Enter the names of the batsmen");

		for(int i=0;i<5;i++)
		{
			bat[i]=b.nextLine();
		}
	}
	
	public void bowlers()
	{
		System.out.println("Enter the names of the bowlers");

		for(int i=5;i<9;i++)
		{
			bat[i]=b.nextLine();
		}
	}
	
	public void wKeepers()
	{
		System.out.println("Enter the name of the wicket keeper");
		bat[9]=b.nextLine();
	}
	
	public void allRounders()
	{
		System.out.println("Enter the name of the All rounder");
		bat[10]=b.nextLine();
	}

	public void display()
	{
		System.out.println("Mens Team");
		for(int i=0;i<=10;i++)
		{
			System.out.println(bat[i]);
		}
	}
}
