package day4.programs;

public class Excep1 extends Exception {

	public static void main(String[] args) {
		int i=1;
		
		try
		{
			int j=i/0;
			int k=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
			System.out.println(k);
			
			                                                     
			
		}
	/*	catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			e.getMessage();
			e.printStackTrace();
			
		}*/
		
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		finally
		{
			System.out.println("End of program");
		}

	
	}
	
	
}
