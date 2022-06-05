package com.mira;

class Customer{    
		private int amount=10000;  //current balance  
		    
		synchronized void withdraw(int amount)
		{    
		    
		if(this.amount<amount)
		{    
		System.out.println("Less balance; waiting for deposit...");    
	
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
   
		}    
		this.amount=this.amount-amount;    
		System.out.println("withdraw completed...");    
		}    
		 
		
		synchronized void deposit(int amount)
		{    
		System.out.println("going to deposit...");    
		this.amount+=amount;    
		System.out.println("deposit completed... ");    
		notify();    
		}    
		 

/*synchronized void balancecheck()
{
	System.out.println("waiting for balance check...");
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Balance:"+this.amount);
}*/
}
	class Thread1 extends Thread
	{
		Customer c;
		Thread1(Customer c)
		{
			this.c=c;
		}
		public void run()
		{
			c.withdraw(15000);
			
		}
	}
	class Thread2 extends Thread
	{
		Customer c;
		Thread2(Customer c)
		{
			this.c=c;
		}
		public void run()
		{
			c.deposit(1000);
		}
	}
	/*class Thread3 extends Thread
	{
		Customer c;
		Thread3(Customer c)
		{
			this.c=c;
		}
		public void run()
		{
			c.balancecheck();
		}
	}*/
	public class InterThreadCommunication {
		public static void main(String args[]){  
			Customer obj=new Customer();//obj resource
			Thread1 t1=new Thread1(obj);//thread1--withdraw task
			Thread2 t2=new Thread2(obj);//thread2--deposit task
			//Thread3 t3=new Thread3(obj);
			//Runnable
			t1.start();
			t2.start();
			//t3.start();
			
		/*final Customer c=new Customer();    
		new Thread(){    
		public void run()
		{
			c.withdraw(15000);
		}    
		}.start();    
		new Thread(){    
		public void run()
		{
			c.deposit(10000);
			}    
		}.start(); */   
		    
		}
		}    