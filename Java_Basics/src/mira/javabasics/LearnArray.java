package mira.javabasics;

public class LearnArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        //declare single dimentional array

		/*int[] arr=new int[5];//internally it creates empty array which has index from 0 to 4
	    arr[0]=1;
	    arr[4]=10;
	    arr[3]=11;
	    arr[2]=45;
	    arr[1]=67;
	    arr[5]=89;

	    //enhanced for loop
	    for(int i:arr)
	    {
	    	System.out.println(i);
	    }

	    int a[]= {1,3,4,5,6};
	    for(int i1:a)
	    {
	    	System.out.println(i1);
	    }*/

        // Create 2-dimensional array->Form Of Multidimensional array

        int[][] twoD = new int[3][3];//(first value indicates row size and second indicates column size)


        twoD[0][0] = 1;
        twoD[0][1] = 2;
        twoD[0][2] = 3;
        twoD[1][0] = 4;
        twoD[1][1] = 5;
        twoD[1][2] = 6;
        twoD[2][0] = 7;
        twoD[2][1] = 8;
        twoD[2][2] = 9;

        //nested for loop

        for(int i=0;i<3;i++)//outer for loop->row
        {
            for(int j=0;j<3;j++)//inner for loop->column
            {
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }

        //2D-dimensional array -> Assigning value in 2D dimensional array


        int arr[][]= {{1,2,3,4},{3,6,7,8},{4,5,3,2}};//3 rows and 4 columns

        System.out.println("Printing a 2D array");

        for(int i=0;i<3;i++)//outer for loop->row
        {
            for(int j=0;j<4;j++)//inner for loop->column
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //3-Dimensional Array-> Form of Multidimensional array
        /**
         * Syntax of 3D array
         * x[array_index][row_index][column_index]
         */

        int[][][] arr1 = { { { 1, 2 }, { 3, 4} },
                { { 5, 6 }, { 7, 8} } };

        System.out.println("Printing a 3D array");

        for (int i = 0; i < 2; i++) //array index
        {

            for (int j = 0; j < 2; j++) //row of array
            {

                for (int k = 0; k < 2; k++) //column of array
                {

                    System.out.print(arr1[i][j][k] + " ");
                }

                System.out.println();
            }
            System.out.println();
        }
    }

}

