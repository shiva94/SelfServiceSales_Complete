package day3.programs;

public class MainClass {

	public static void main(String[] args) {
		Manager m1= new Manager();
		m1.setName();
		m1.getName();
		m1.empId();
		m1.setSalary();
		m1.getSalary();
		
		Clerk c1= new Clerk();
		c1.setName();
		c1.getName();
		c1.empId();
		c1.setSalary();
		c1.getSalary();
		
		Employee e = new Employee();
		e.setName();
		e.getName();
		e.empId();
		e.setSalary();
		e.getSalary();

	}

}
