package mira.javabasics;

public class Operators {
    int AREA=5;//AREA is constant variable
    public static void main(String[] args)
    {
        //unary operator
        int i=10;
        System.out.println(i++); //10,post increment to 11
        System.out.println(i);//11
        System.out.println(++i);//12
        System.out.println(--i);//11
        System.out.println(i--);//11
        System.out.println(i);//10

        //logical && and Bitwies &

        int p=10;
        int q=5;
        int r=20;
        System.out.println((p<q)&&(q++<r));//false
        System.out.println(q);//5
        System.out.println((p<q)&(q++<r));//false
        System.out.println(q);//6*/

        //logical || and Bitwies |
        System.out.println((p>q)||(q++<r));//true
        System.out.println(q);
        System.out.println((p>q)|(q++<r));//true
        System.out.println(q);//6

        //ternary operator(conditional stmt)
        int a=30;
        int b=60;

        int max=(a>b)?a:b;
        System.out.println(max);

        //Left Shift Operators

        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80

        //right shift operator
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(10>>3);//10/2^3=10/8=1

        short a1=10;
        short a2=20;
        short result= (short) (a1+a2); //30 will be consider as int internally.
        System.out.println("Result:"+result);
    }

}

