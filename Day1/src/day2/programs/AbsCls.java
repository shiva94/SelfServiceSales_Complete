package day2.programs;

abstract class One {
	abstract void disp();
	abstract void disp1();
	//abstract void disp2();// method should be defined
	 public void str()
	 {
		 System.out.println("asdf");
	 }
}


public class AbsCls extends One
{
	void disp()
	{
		System.out.println("abcd");
		super.str();
	}
	void disp1()
	{
		System.out.println("efgh");
	}
	public static void main(String[] args)
	{
		AbsCls a=new AbsCls();
		a.disp();
		a.disp1();
		
	}
	
}
