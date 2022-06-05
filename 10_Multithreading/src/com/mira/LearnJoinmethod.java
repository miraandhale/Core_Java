package com.mira;


//join method in java is used when a thread needs to wait for another thread to finish
//its execution
public class LearnJoinmethod  extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
			Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(i+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnJoinmethod t1=new LearnJoinmethod();
		LearnJoinmethod t2=new LearnJoinmethod();
		LearnJoinmethod t3=new LearnJoinmethod();
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		t1.start();
		try
		{
		t1.join();
		}
		catch(Exception e)
		{
			
		}
		
		t3.start();
	}

}
