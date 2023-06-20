
//Synchronization in MultiThreading

package Multithreading;

class Bus implements Runnable
{   int avilable=3;
    int passanger;
    Bus(int passanger)
    {
    	this.passanger=passanger;
    }
	public  synchronized void run()
	{
		String name = Thread.currentThread().getName();
		if(avilable>=passanger) 
		{
			System.out.println(name+"  Reserved Seat...! ");
		    avilable=avilable-passanger;
		}
		else 
		{
			System.out.println("Sorry Seat is not avilable!");
		}
	}


}

public class Customer {

	public static void main(String[] args) 
	{
		Bus b = new Bus(1);
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		
		t1.setName("Ram");
		t2.setName("Shyam");
		t3.setName("Raman");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
