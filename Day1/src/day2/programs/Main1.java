package day2.programs;

 abstract class TredzIT {

	public abstract void batsmen();
	public abstract void bowlers();
	public abstract void wKeepers();
	public abstract void allRounders();
	public abstract void display();
}





public class Main1 {

	public static void main(String[] args) {
	Men m= new Men();
	m.batsmen();
	m.bowlers();
	m.wKeepers();
	m.allRounders();
	Women w = new Women();
	w.batsmen();
	w.bowlers();
	w.wKeepers();
	w.allRounders();
	m.display();
	w.display();

	}

}
