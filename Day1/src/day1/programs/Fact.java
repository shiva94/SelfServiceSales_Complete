package day1.programs;
import java.util.Scanner;
public class Fact {
	public static void main(String[] args) {
		int i=0;
		long fact=1;
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a number from 1-20");
		i=in.nextInt();
		if(i<21)
		{
			while(i>0)
			{
				fact=fact*i;
				i--;
			}
			System.out.println("fact is "+ fact);
		}
		else
		{
			System.out.println("Invalid Number");
			
		}
		
	}
}
