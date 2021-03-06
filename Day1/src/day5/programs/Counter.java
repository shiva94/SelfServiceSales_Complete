package day5.programs;

public class Counter extends Thread {
synchronized public void run()
{
	//System.out.println("Counter 1");
	if(Thread.currentThread().getId()==9)
	{
		for(int i=5;i<=50;i+=5)
		{
			try
			{
				Thread.sleep(1000); // Sleep time for thread
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
			
		}
	}
	
	//System.out.println("Counter 2");
	if(Thread.currentThread().getId()==10)
	{
		for(int j=10;j<=100;j+=10)
		{
			try
			{
				Thread.sleep(1000); // Sleep time for thread
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(j);
			
		}
	}

	//System.out.println("Counter 3");
	if(Thread.currentThread().getId()==11)
	{
		for(int k=100;k<=1000;k+=100)
		{
			try
			{
				Thread.sleep(1000); // Sleep time for thread
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(k);
			
		}
	}

}
	public static void main(String[] args) {
	
		Counter c =new Counter();
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		System.out.println("c id "+ c.getId());
		System.out.println("c1 id "+ c1.getId());
		System.out.println("c2 id "+ c2.getId());
	
		c.setPriority(Thread.MAX_PRIORITY);
		c1.setPriority(Thread.NORM_PRIORITY);
		c2.setPriority(Thread.MIN_PRIORITY);
		
		c.start();
		c1.start();
		c2.start();
	
	}

}
