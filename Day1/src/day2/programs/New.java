package day2.programs;

import java.util.Scanner;
 class Square1 extends Shape {
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
 class Triangle1 extends Shape{
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
public class New {

	public static void main(String[] args) {
		Square1 sq = new Square1();
		sq.area();
		sq.area(10,20);
		Triangle1 t= new Triangle1();
		t.area();

	}

}
