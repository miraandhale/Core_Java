package com.mira;

public class Learnyield implements Runnable
{

	//running stage
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				Thread.yield(); 
				System.out.println("Thread is starting:"+Thread.currentThread().getName());
			}
		}
		
		 
		public static void main(String[] args) 
		{
		Learnyield a1 = new Learnyield();
		Thread t1 = new Thread(a1,"First thread");//first thread instance(Thread-0)

		Learnyield a2 = new Learnyield();
		Thread t2 = new Thread(a2,"Second thread");//second thread instance(Thread-1)
	
		
		// runnable stage
		t1.start();
		t2.start();

}
		
}
