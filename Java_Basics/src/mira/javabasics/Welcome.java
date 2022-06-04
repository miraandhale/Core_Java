package mira.javabasics;
/**
 @author Mira Andhale
 */
public class Welcome {
    //int a, b;//instance variable
    int a=10,b=20,result;//instance variable
    float c=0.001f;
    double d=100000.0d;
    char e='A';
    boolean z=true;
    long value=65_45_657;

    //by using string literal
    String name="XYZ";
    void print()
    {
        System.out.println("Hello Java programming");
    }

    //creating parametrized method
    void multiplication(int a,int b)
    {
        result=a*b;
        System.out.println("Result:"+result);
    }

    float add(float a,float b)
    {
        return a+b;

    }
    //to find out maximum among multiple group of values
    int max(int...a)  //varargs
    {
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            if(temp<a[i]){
                temp=a[i];
            }
        }
        return temp;
    }

    public static void main(String... args){
        //create object
        Welcome obj=new Welcome();//obj is object
        obj.multiplication(10,20);
        System.out.println(obj.add(0.1f, 0.2f));

        //obj.print();//call the method

        System.out.println(obj.name);

        int result=obj.max(23,56,100,121,400,1);
        System.out.println("Maximum value from array elements:"+result);
    }

}

