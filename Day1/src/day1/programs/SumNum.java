package day1.programs;

public class SumNum {

	public static void main(String[] args) {
		int x=12345;
		int sum=0;
		int i;
		while(x>0){
			i=x%10;
			sum=sum+i;
			x=x/10;
		}
System.out.println("sum is "+ sum);
	}

}
