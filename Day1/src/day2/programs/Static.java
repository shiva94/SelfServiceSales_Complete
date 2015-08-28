package day2.programs;

public class Static {
	static int x=10;
	Static()
	{
		x++;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Static x1= new Static();
		Static x2= new Static();
		Static x3= new Static();
	}
	
}
