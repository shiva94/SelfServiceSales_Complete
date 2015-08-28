package day2.programs;
import java.util.Scanner;
public class Square extends Shape {
	Scanner s =new Scanner(System.in);
	int a;
	
	 public void area()
	{
		System.out.println("Enter the side of the square");
		a=s.nextInt();
		int as=a*a;
		System.out.println("Area of the square is "+ as);
	}
	 public void area(int l,int b)
	 {
		 
		 System.out.println("area of rectangle is " + l*b);
	 }


}
