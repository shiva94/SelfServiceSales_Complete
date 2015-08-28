package day2.programs;
import java.util.Scanner;
public class Inheritance extends Class1{

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String x;
		Class1 A=new Class1();
		System.out.println("Enter a string");
		x=in.nextLine();
		A.disp(x);
	}
	private void disp1()
	{
		System.out.println("hi..");
	}

}
