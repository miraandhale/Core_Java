public class Memberinner //outer class
{
	private int rollno;
	String name;
	void display()
	{
		System.out.println("outer class");
	}
	Memberinner(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	class Student//member inner class
	{
	
		void info()
		{
			System.out.println("rollno:"+rollno);
			System.out.println("Name:"+name);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memberinner obj=new Memberinner(1,"A");
		Student s=obj.new Student();
		obj.display();
		s.info();
		Memberinner obj1=new Memberinner(2,"B");
		Student obj2=obj1.new Student();
		obj2.info();
		
		
		
		
		
		
		
	}
	
}
