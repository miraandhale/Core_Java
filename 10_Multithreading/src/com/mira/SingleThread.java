package com.mira;

public class SingleThread extends Thread
{
  int a=20,b=30;
	//Addition
	void addition()
	{
		int result=a+b;
		System.out.println("Addition:"+result);
	}
	//substraction
	void sub()
	{
		int result=a-b;
		System.out.println("Sub:"+result);
	}
	
	//Multiplication
	
	void mult() 
	{
		int result=a*b;
		System.out.println("Muli:"+result);
	}
	
	public void run()
	{
		addition();
		sub();
		mult();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates Thread instace
		SingleThread t1=new SingleThread();//t1 is thread object
		
		t1.start();//ready for execution
	}

}
