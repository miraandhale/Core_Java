package com.mira;


//print 5 table=task1
//print 10 table=task2
class Table
{
	 void print(int n)//resource
	{
		 synchronized(this)
		 {
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
}
class ThreadA extends Thread
{
	//running
	Table t;
	 ThreadA (Table t)
	 {
		 this.t=t;
	 }
		public void run()
		{
			t.print(5);
			
		}
}
class ThreadB extends Thread
{
	//running
	Table t;
	 ThreadB (Table t)
	 {
		 this.t=t;
	 }
		public void run()
		{
			t.print(10);
		}
}
public class TestSyanchronization 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table obj=new Table();//obj is resource
		//creates two threads
		ThreadA t1=new ThreadA(obj);//thread1
		ThreadB  t2=new ThreadB(obj);//thread2
		
		//runnable
		t1.start();
		t2.start();
	}

}
