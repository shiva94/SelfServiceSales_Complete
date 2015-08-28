package day3.programs;

public class Cust1 extends Cust implements VegItems {

	@Override
	public void vegItems() {
		// TODO Auto-generated method stub

	}

	@Override
	public int nonVegItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Displaying menu");
	}

	@Override
	public void qty() {
		// TODO Auto-generated method stub
		System.out.println("Null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cust1 c= new Cust1();
		c.menu();
		c.qty();
		System.out.println(x);
	}

}
