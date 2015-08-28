package day3.programs;

public class RunClass {

	public static void main(String[] args) {
		
		DayScholar d= new DayScholar();
		Hosteller h= new Hosteller();
		
		double c=d.payFee(10000.145);
		d.displayDetails();
		System.out.println("The remaining time to be paid is" +c);
		double f = h.payFee(20000.145);
		h.displayDetails();
		System.out.println("The remaining time to be paid is" +f);
	}

}
