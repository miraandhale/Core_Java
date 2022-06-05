class Bank//outer class
{
	private double balanace=40000.0;//data hiding
	void data()//method of outer class
	{
	     class Account//local inner class
	     {
		
	    	 //getter method
	    	 void getBalnace()
	    	 {
	    		 System.out.println("balanace:"+balanace);
	    	 }
	    	 
	    	 //setter method
	    	 
	    	 double setBalanace(double amount)
	    	 {
	    		 return balanace=balanace+amount;
	    	 }
	    	 
	     }//end of local inner class
	     
	     Account obj=new Account();
	     obj.getBalnace();
	     obj.setBalanace(400.0);
	     System.out.println("After deposit balance:");
	    obj.getBalnace();
	
	}//end of method

}//end of outer class





public class LocalInner 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		b.data();
	}

}
