package com.mira;

public class TestEncapsualtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a=new Account();
		System.out.println(a.getBalance());
		a.setBalance(500);
		System.out.println("deposited successfully");
		System.out.println(a.getBalance());
	}

}
