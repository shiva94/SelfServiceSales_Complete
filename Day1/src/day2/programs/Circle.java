package day2.programs;
import java.util.Scanner;
public class Circle extends Shape {
	Scanner c =new Scanner(System.in);
	int r;
	public void area()
	{
		System.out.println("Enter the radius");
		r=c.nextInt();
		double ca=Math.PI*r*r;
		System.out.println("The area pf the circle is "+ ca);

}
}
