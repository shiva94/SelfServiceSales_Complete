package day1.programs;
import java.util.Scanner;
public class calculate {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r;
		double p=Math.PI;
		//circle
		System.out.println("Enter radius");
		r=in.nextInt();
		System.out.println("area is "+ p*r*r);
		System.out.println("Circumference is "+ 2*p*r);
		//square
		int a,b;
		double x;
		System.out.println("enter the square side");
		a=in.nextInt();
		System.out.println("The diagonal value is "+ Math.sqrt(2*a*a));
		//sphere
		System.out.println("The volume of the sphere is "+ (4*p*r*r*r)/3);
		System.out.println("The surface area of the sphere is" + 4*p*r*r);
	}

}
