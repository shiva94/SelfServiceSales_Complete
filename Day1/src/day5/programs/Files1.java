package day5.programs;
import java.io.FileInputStream;

import java.io.IOException;
public class Files1 extends Thread {
	
	String y;
	Files1(String x) throws IOException
	{
		y=x;
	}
	
	
	 public void run()
	{
		if(Thread.currentThread().getId()==9)
		{
			
			int k;
			try
			{
			FileInputStream fis1 =new FileInputStream(y);
			while((k= fis1.read())!=-1)
			{
				if((char)k!='\n')
				{
			System.out.print((char)k);	
				}
				else
				{

					System.out.println();
					try
					{
					Thread.sleep(500);
					}
					catch(InterruptedException e)
					{
						System.out.println(e);
					}
				}
			fis1.close();
			
			}
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
	}

	
	if(Thread.currentThread().getId()==10)
	{
		
		int k1;
		try
		{
		FileInputStream fis2 =new FileInputStream(y);
		while((k1= fis2.read())!=-1)
		{
			if((char)k1!='\n')
			{
		System.out.print((char)k1);	
			}
			else
			{
				try
			
			{
			Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			}
		}
		fis2.close();
		
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
}
}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Files1 f = new Files1(args[0]);
		Files1 f1 = new Files1(args[1]);
		System.out.println(f.getId());
		System.out.println(f1.getId());
		
		f.start();
		f1.start();
		
		
	}

}
