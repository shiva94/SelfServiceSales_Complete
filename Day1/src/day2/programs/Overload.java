package day2.programs;

public class Overload {

	public static void main(String[] args) {
		int a,b;
		Overload o=new Overload();
		o.disp(10,20);
		o.disp(10,20,30);
	}
	
	public void disp(int a,int b)
	{
		System.out.println(a+"\n"+b);
	}
	public void disp(int a,int b,int c)
	{
		System.out.println(a+" "+b+" "+c);
	}
}
