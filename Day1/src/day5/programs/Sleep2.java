package day5.programs;

public class Sleep2 extends Thread {
	public void run()
	{
		this.setName("thread1");
		//String str = "Thread-0";		
		if(currentThread().getName().equals("thread1"))
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000); // Sleep time for thread
			}
			catch(InterruptedException e)
			{         
				System.out.println(e);
			}
			
			
			
		}
		if(currentThread().getName().equals("thread2"))
	//	if("Thread-1"=="Thread-1"){
			//System.out.println("stupid comparision");

	//		str = Thread.currentThread().getName();
	//		System.out.println("str = "+str);
			for(int i=1;i<5;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(2000); // Sleep time for thread
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}	
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleep2 s = new Sleep2();
		Sleep2 s1 = new Sleep2();
	
		s.start();
		
		//s.start();
		s1.setName("thread2");
		s1.start();
		System.out.println("name  : "+s.getName());
		System.out.println("name : "+s1.getName());
		System.out.println("id : "+s.getId());
		//System.out.println(Thread.currentThread().getId());
		s.setPriority(Thread.MAX_PRIORITY);
		s1.setPriority(Thread.MIN_PRIORITY);
	//	s.setName("asdf");
		//System.out.println(s.getPriority());
		//System.out.println(s1.getPriority());

	}

}
