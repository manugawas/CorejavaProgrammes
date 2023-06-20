
// Thread Shedular Program

package Multithreading;
class A extends Thread
{
     public void run() 
     {
    	 String n = Thread.currentThread().getName();
    	 for(int i=1;i<=3;i++) 
    	 {
    		 System.out.println(n);
    		 
    	 }
     }

}

public class Thread_Demo3 {

	public static void main(String[] args) 
	{
		A t1 = new A();
		A t2 = new A();
		A t3 = new A();
		
		t1.setPriority(10);
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		t2.start();
		try 
		{
			t2.join();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		 System.out.println(t1.isAlive());
		t1.start();
        t3.start();
        t1.suspend();//pause
         t1.resume();// restart
        System.out.println(t1.isAlive());
        t3.stop();
	}

}
