package day5.programs;

public class Sleep1 extends Thread {
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(2000); // Sleep time for thread
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleep1 s = new Sleep1();
		Sleep1 s1 = new Sleep1();
		//Thread t = new Thread(s);
		s.start();
		try
		{
		s.join();
		System.out.println(s1.isAlive());
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		s1.start();
		for(int i=2;i<5;i++)
		{
			try
			{
				//System.out.println(s.isAlive()); //returns boolean value
				Thread.sleep(1000);// Sleep time for thread
				
				
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
			
		}
		System.out.println(s.getId());
		System.out.println(s1.getId());
	}
	
	
}
