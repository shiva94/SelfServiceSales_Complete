package day4.programs;
class Sample1
{
	public void age(int age) throws Excep3
	{	
		if(age<18)
		{
			throw new Excep3("minor"); 
		}
		else
		{
			System.out.println("major");
		}
	}
}



public class Excep3 extends Exception {
	
	public Excep3(String x)
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Sample1 s= new Sample1();
		try
		{
		s.age(Integer.parseInt(args[0]));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}