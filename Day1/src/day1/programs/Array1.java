package day1.programs;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		Scanner i= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num=i.nextInt();
		int sum=0;
		int min,max;
		int [] ar= new int[num];
		for(int j=0;j<num;j++)
		{
			ar[j]=i.nextInt();
			sum+=ar[j];
		}
		System.out.println("The average "+ (sum/num));

	min=ar[0];
	max=ar[0];
	for(int j=1;j<num;j++)
	{
		if(max<ar[j])
		{
			max=ar[j];
		}
		if(min>ar[j])
		{
			min=ar[j];
		}
	}
System.out.println("minimum value is "+ min);
System.out.println("maximum value is "+ max);
}
}
