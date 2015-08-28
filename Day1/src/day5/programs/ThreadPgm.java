package day5.programs;

public class ThreadPgm extends Thread {

	public void run()
	{
		System.out.println("Thread has started running");
	}
	
	public static void main(String[] args) {
		ThreadPgm t =new ThreadPgm();
		t.start();
		
	}

}
