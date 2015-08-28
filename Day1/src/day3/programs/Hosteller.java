package day3.programs;
import java.util.Scanner;

public class Hosteller extends Student {
	Scanner i =new Scanner(System.in);
	public double hostelFee;
	Hosteller()
	{
		System.out.println("Enter the hostel fee");
		hostelFee=i.nextDouble();
		
	}
}
