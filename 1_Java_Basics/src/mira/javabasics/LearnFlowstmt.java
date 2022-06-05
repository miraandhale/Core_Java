package mira.javabasics;

public class LearnFlowstmt {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //print 1 to 10 number
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);  //1 2 3 10
        }//end of for loop

        System.out.println("Welcome");

        /*print pattern like *
         * *
         * * *
         * * * *        */

        //nested for loop
        for(int i=0;i<4;i++)//outer for loop row i=4
        {
            for(int j=0;j<=i;j++)//inner for loop column

            {
                System.out.print("*"+" ");
            }//end of inner for loop

            System.out.println();
        }//end for loop


        //while loop
        System.out.println("print 1 to 10 using while loop");
        int i1=1;
        while(i1<=10)
        {
            System.out.println(i1);
            i1++;
        }
        //do while loop
        System.out.println("print 1 to 10 using do...while loop");
        int i2=1;
        do
        {
            System.out.println(i2);
            i2++;
        }while(i2>=10);
    }
}

