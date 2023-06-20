package Multithreading;

class RunThread implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1;i<4;i++) 
		{
			System.out.println("From Mummy and Samu");
		}
		
	}
}

public class Thread_Demo2 {

	public static void main(String[] args) 
	{
		RunThread r = new RunThread();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1;i<4;i++) 
		{
			System.out.println("Happy Birthday Kaivalya!!");
		}
	}

}
