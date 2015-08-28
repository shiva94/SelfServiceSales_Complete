package day1.programs;
import java.util.Scanner;
public class Arr {

	public static void main(String[] args) {
		int [] c= new int[5];
		Scanner in =new Scanner(System.in);
		System.out.println("enter values");
		for(int i=0;i<5;i++)
		{
			c[i]=in.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("c" + c[i]);
		}
	}

}
