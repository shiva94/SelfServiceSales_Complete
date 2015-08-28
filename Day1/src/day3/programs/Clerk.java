package day3.programs;
import java.util.Scanner;

public class Clerk extends Employee {
	Scanner c =new Scanner(System.in);
	String speed;
	String accuracy;
	Clerk()
	{
		System.out.println("Please enter details of the clerk");
		speed= c.nextLine();
		accuracy = c.nextLine();
	}
	
	public void setSalary()
	{
		System.out.println("Please enter the salary of the clerk");
		 salary=c.nextInt();
		
	
}
}
