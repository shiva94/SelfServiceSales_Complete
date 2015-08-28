package day1.programs;
import java.util.Scanner;

public class SecLarge {    

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the numbers");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		if((a>b && a<c) || (a>c && a<b))
		{
			System.out.println("the second largest in "+ a);
		}
		if((b>a && b<c) || (b>c && b<a))
		{
			System.out.println("the second largest in "+ b);
		}
		if((c>b && c<a) || (c>a && c<b))
		{
			System.out.println("the second largest in "+ c);
		}
	}
}
 class A
	{

}
