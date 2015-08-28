package day5.programs;

public class Multi extends Thread implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");

	}

	public static void main(String[] args)
	{
	Multi t = new Multi();
	Thread t1 = new Thread(t);
	t1.start();
	t.start();
	
	
	}
}
