package com.mira;

//For Encapsualtion program take setter and getter method
public class Account {
	
	private double balance=40000.0;//data hiding
	
	//getter method
	double getBalance()
	{
		//validation
		return balance;
	}

	//setter method
	void setBalance(int amount)
	{
		//validation
		this.balance=this.balance+amount;
	}

}
