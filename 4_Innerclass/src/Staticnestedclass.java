class A//outer class
{
	static int a=30;
	static int b;
	static void print()
	{
		System.out.println("non static method of outer class");
	}
	
	static class B//static nested class
	{
		int c=7;
		static void get()
		{
			
			System.out.println("A:"+a);
			System.out.println("B:"+b);
		}
		void info()
		{
			print();	
			System.out.println("non static method");
		}
	}
	
}



public class Staticnestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A.B obj=new A.B();
	    obj.info();
		A.B.get();
	}

}
