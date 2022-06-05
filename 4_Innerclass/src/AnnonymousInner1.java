//Implement Annonymous inner class using abstract class

abstract class Person
{
	abstract void getinfo();
}

public class AnnonymousInner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person()
				{

					@Override
					void getinfo() {
						String name="xyz";
						System.out.println("Person name:"+name);
						
					}
			
				};
				
				p.getinfo();
		
	}

}
