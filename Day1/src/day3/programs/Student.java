package day3.programs;

import java.util.Scanner;

public class Student {
	Scanner in =new Scanner(System.in);

	public int studId;
	public String studName;
	public double examFee;
	Student()
	{
		System.out.println("Please enter the details");
		studId=in.nextInt();
		examFee=in.nextDouble();
		studName=in.nextLine();
		
	
	}
	
	public void displayDetails()
	{
		System.out.println("stud Id is"+ studId);
		System.out.println("Stud Name is"+ studName);
		System.out.println("Exam fee is"+ examFee);
		
	}
	
	public double payFee(double fee)
	{
		return fee-examFee;
	}

}
