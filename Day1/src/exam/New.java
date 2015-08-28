public class New {
	public static void main(String args[])
try
{
  int arr[]={1,2};
  arr[2]=3/0;
  System.out.println(arr[0]);         
}
catch(Exception e)
{
  System.out.println("Exception");
}
catch(ArithmeticException e)
{
  System.out.println("Divide by Zero");
}

}

}
