package day3.programs;
import java.util.Scanner;
public class Manager extends Employee {
	Scanner m =new Scanner(System.in);
	String type;
	Manager()
	{
		System.out.println("Enter the details of the manager");
		System.out.println("Enter the type of the manager");
		type=m.nextLine();
	}
	
	
	public void setSalary()
	{
		System.out.println("Please enter the salary of the manager");
		salary=m.nextInt();
	}
	
	
}
