package exam;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DatacardCustomer d = new DatacardCustomer();
		WirelessCustomer w = new WirelessCustomer();
		d.custName();
		d.custNo();
		
		d.speed();
		d.dLimit();
		d.CUsage();
		d.bal();
		
		w.custName();
		w.custNo();
		
		w.speed();
		w.dLimit();
		w.CUsage();
		d.display();
		w.display();
}
}
