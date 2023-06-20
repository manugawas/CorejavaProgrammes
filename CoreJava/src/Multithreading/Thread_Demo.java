package Multithreading;
class MyThread extends Thread
{
	public void run() 
	{
		for(int i=0;i<10;i++) 
        {
        	System.out.println("Child Thread");
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
	}
}
public class Thread_Demo {

	public static void main(String[] args) throws InterruptedException
	{
		MyThread t = new MyThread();
        t.start();
        for(int i=0;i<10;i++) 
        {
        	System.out.println("Main Thread");
        	Thread.sleep(1000);
        }
	}

}
