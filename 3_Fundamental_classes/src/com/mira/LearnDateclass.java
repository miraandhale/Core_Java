package com.mira;


import java.util.Calendar;
import java.util.Date;




public class LearnDateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date d=new Date();
		System.out.println("Current date:"+d);
		
		
		 Calendar c = Calendar.getInstance();
		System.out.println("The Current Date is:" + c.getTime());
		    
        System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE));
        System.out.println("Current HOUR: " + c.get(Calendar.HOUR));
        System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + c.get(Calendar.SECOND));
		
		
		
		
	}

}
