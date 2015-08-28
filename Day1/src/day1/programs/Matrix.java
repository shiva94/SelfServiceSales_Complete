package day1.programs;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int [][]x=new int[10][10];
		int [][]y=new int[10][10];
		int temp=1;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				x[i][j]=0;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(x[i][j]+ " ");
				
			}
			System.out.println(" ");
		}
		System.out.println("Array elements");
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				x[i][j]+=temp;
				temp++;;
			}
		}
		System.out.println("The array elements");
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(x[i][j]+ " ");
				
			}
			System.out.println(" ");
		}
		
		
	for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				y[j][i]=x[i][j];
			}
		}
	
	System.out.println(" ");
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			System.out.print(y[i][j]+ " ");
			
		}
		System.out.println(" ");
	}
		
}
}
