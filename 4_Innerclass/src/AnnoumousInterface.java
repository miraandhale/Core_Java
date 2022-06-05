interface Address
{
	void getaddress();
}


public class AnnoumousInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address()
				{
			        public void getaddress()
			        {
			        	System.out.println("Pune-411017");
			        }
				};
				
				a.getaddress();
		
	}

}
