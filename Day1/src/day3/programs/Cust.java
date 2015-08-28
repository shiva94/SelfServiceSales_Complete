package day3.programs;

public class Cust implements Bakery {
	 int y=15;
	 static void disp()
	 {
		 System.out.println("Displaying the items");
	 }
	 @Override
	public void vegItems() {
		// TODO Auto-generated method stub
		System.out.println("Not avaiable");
	}

	@Override
	public int nonVegItems() {
		// TODO Auto-generated method stub
		System.out.println("available");
		return 0;
	}

}
