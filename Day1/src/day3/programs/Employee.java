package day3.programs;
import java.util.Scanner;
public class Employee {
	Scanner in= new Scanner(System.in);
	Employee()
	{
		System.out.println("Please enter the details");
	}
	public String name;
	public String empId;
	public int salary;
	public void setName()
	{
		System.out.println("Please enter the employee name");

	}
	public void getName()
	{
	name=in.nextLine();
		System.out.println("The employee name is " +name);
	}
	public void empId()
	{	
		System.out.println("Enter the employee id");
		empId=in.nextLine();
		System.out.println("The employee id "+empId);
	}
	public void setSalary()
	{
		System.out.println("Please enter the salary of the employee");
		salary=in.nextInt();
		
	}
	public void getSalary()
	{
		
		System.out.println("The salary is "+salary);
	}
	
}
