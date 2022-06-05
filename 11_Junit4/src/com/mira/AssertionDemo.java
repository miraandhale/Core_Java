package com.mira;


//using Asssertion stmt
public class AssertionDemo {

	static int square(int num)
	{
		return num*num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int result= square(2);//actual output
          
           //writing assertions stmt
           /*
            * syntax: assert expectedoutput==actualoutput:"";
            */
           int expectedoutput=4;
           assert expectedoutput==result:"Expected 9 but found "+result;
           
           System.out.println("result:"+result);
		
	}

}
