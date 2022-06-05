package com.mira;

public class Mythread1 implements Runnable
{
	//running
	public void run() {
		System.out.println("New thread running..");
		//print 1 to 5--task
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create thread instance
		Mythread1 m1=new Mythread1();
		Mythread1 m2=new Mythread1();
		
		Thread t1=new Thread(m1,"t1");//t1 is thread instance /object
		Thread t2=new Thread(m2,"t2");
		
		t1.start();
		t2.start();
		
		
	}

	

}
