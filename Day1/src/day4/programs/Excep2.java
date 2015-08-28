package day4.programs;
import java.util.Scanner;
import java.lang.Exception;




public class Excep2 extends Exception {
	Excep2(String f1)
	{
		System.out.println(f1);
	}
	public static void main(String[] args) throws Exception {
		int age;
		Scanner in =new Scanner(System.in);
		age=in.nextInt();
		if(age<18)
		{
			try
			{
			throw new Excep2("minor");
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Major");
		}

	}

}
