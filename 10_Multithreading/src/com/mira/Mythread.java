package com.mira;

public class Mythread extends Thread {
//running state
	public void run() {
		System.out.println("New thread running..");
		// print 1 to 5--task
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());// will gives us the current thread name

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// New State
		Mythread m1 = new Mythread();
		Thread t1 = new Thread(m1, "t1");// t1 is object

		// runnable state
		t1.start();// ready for excecution
	}

}
