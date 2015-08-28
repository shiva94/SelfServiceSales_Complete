package day4.programs;
import java.util.Scanner;
public class Main {
	Scanner in= new Scanner(System.in);
	int i;
	
	public void select() throws Ex1,Ex2,Ex3
	{
		System.out.println("Please enter a number");
		i=in.nextInt();
		switch(i)
		{
		case 1:
			throw new Ex1("Exception 1");
		
		case 2:
		
			throw new Ex2("Exception 2");
	
		
		case 3:
		
			throw new Ex3("Exception 3");
		
		case 4:
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		try
		{
		for(int i=0;i<4;i++)
		{
			System.out.println("Array values "+ a[i]);
		
		}
		}
		catch(Exception e1)
		{
			System.out.println("Exception-"+e1);
		}
		break;
		
		default:
			System.out.println("Invalid option");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int opt;
			Main m=new Main();
			try
			{
			m.select();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
	}
}
