package com.mira;


//muliple threads for muliple task
//cut tickets
//show seat
public class Muliplethread implements Runnable
{

	
	String task;//to represents a task
	Muliplethread(String task)
	{
		this.task=task;
	}
	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("task"+task+":"+i);
			System.out.println(Thread.currentThread().getName());
			try
			{
			Thread.sleep(500);//milisecond you can pause tour thread
		
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new State
		Muliplethread m1=new Muliplethread("cut the ticket");
		Muliplethread m2=new Muliplethread("show seat");
		
		Thread t1=new Thread(m1);//thread1
		Thread t2=new Thread(m2);//thread2
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		
		int p1=t1.getPriority();
		int p2=t2.getPriority();
		System.out.println("Priority of Thread1:"+p1);
		System.out.println("Priority of Thread 2:"+p2);
		//runnable state
		t1.start();
		
	
		t2.start();
		
		System.out.println("t1 is alive or not?->"+t1.isAlive());
		
	}

	

}
