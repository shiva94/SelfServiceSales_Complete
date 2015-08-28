package day2.programs;
import java.util.Scanner;
public class Triangle extends Shape{
	Scanner t= new Scanner(System.in);
	int b,h;
	public void area()
	{
		int b,h;
		System.out.println("Enter the dimensions of the triangle");
		b=t.nextInt();
		h=t.nextInt();
		double ta=0.5*b*h;
		System.out.println("area of the triangle is "+ ta);

	}
}
