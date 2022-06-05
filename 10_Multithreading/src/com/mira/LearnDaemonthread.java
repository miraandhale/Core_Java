package com.mira;

public class LearnDaemonthread  extends Thread{

	 public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work:"+Thread.currentThread().getName());  
		  }  
		  else{  
		  System.out.println("user thread work"+Thread.currentThread().getName());  
		 }  
		 }  
		 public static void main(String[] args){  
			 LearnDaemonthread  t1=new LearnDaemonthread ();//creating thread  
			 LearnDaemonthread  t2=new LearnDaemonthread ();  
			 LearnDaemonthread  t3=new LearnDaemonthread ();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
		 }  
		}  
