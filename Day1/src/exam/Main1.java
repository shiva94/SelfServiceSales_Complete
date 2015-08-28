package exam;

import java.util.ArrayList;
import java.util.Iterator;


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telecom t1 = new Telecom("abc",123);
		Telecom t2 = new Telecom("cde",345);
		Telecom t3 = new Telecom("fgh",678);
		ArrayList<Telecom> a= new ArrayList<Telecom>();
		a.add(t1);
		a.add(t2);
		a.add(t3);
		
	Iterator<Telecom>it = a.iterator();
		while(it.hasNext())
		{
			Telecom t = it.next();
		}
		
	}

	
}
