package day3.programs;

public class asdf extends Cust implements Bakery  {

	@Override
	public void vegItems() {
		// TODO Auto-generated method stub
		System.out.println("Available");
	}

	@Override
	public int nonVegItems() {
		// TODO Auto-generated method stub
		System.out.println("Not available");
		System.out.println(super.y);
		return 0;
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cust.disp();
		asdf a =new asdf();
		a.vegItems();
		a.nonVegItems();
		System.out.println(x);
		
	}*/

}
