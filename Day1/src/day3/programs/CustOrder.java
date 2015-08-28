package day3.programs;

public class CustOrder implements VegItems, NonVegItems {

	@Override
	public void vegItems() {
		System.out.println("Veg items");
	}

	@Override
	public int nonVegItems() {
		System.out.println("Non Veg items");
		return 0;
	}

	@Override
	public void menu() {
		System.out.println("Displaying the menu");

	}

	@Override
	public void qty() {
		System.out.println("Displaying the quantity of the items");

	}
	
	

/*	public static void main(String[] args) {
	/*	CustOrder c= new CustOrder();
		c.vegItems();
		c.nonVegItems();
		c.menu();
		c.qty();*/
		

	}


