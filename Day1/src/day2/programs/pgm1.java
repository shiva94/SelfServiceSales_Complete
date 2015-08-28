package day2.programs;
 class A
{
	/*void disp(int a)
	{
		System.out.println(a);
	}*/
	 A(int a)
	 {
		 System.out.println(a);
	 }
	 void disp(int a)
	 {
		 System.out.println("the value is"+ a);
	 }
}


public class pgm1 extends A {
	pgm1(){
		super(10);
	}
	void disp(int j)
	{
		super.disp(j);
		System.out.println(j);
	}
	public static void main(String[] args) {
		pgm1 s=new pgm1();
		s.disp(6);
	}
}
