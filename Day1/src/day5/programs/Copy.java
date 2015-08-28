package day5.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Copy {

	public static void main(String[] args) throws IOException {
		FileInputStream fin= null;
		FileOutputStream fout=null;
		
		try
		{
			try {
				fin=new FileInputStream("C:\\Files\\Hello1.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fout= new FileOutputStream("C:\\Files\\Out.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int c;
			try {
				while((c=fin.read())!=-1)
				{
					fout.write(c);
				}
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		finally
		{
			if(fin!=null)
			{
				try {
					fin.close();
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fout!=null)
			{
				try {
					fout.close();
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
