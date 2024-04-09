package Arrays;

import java.util.Scanner;

public class CreatingARRAY2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][] = new int[3][4];
        arr [0][0]=11;
        arr [0][1]=12;
        arr [0][2]=13;
        arr [0][3]=14;

        arr [1][0]=15;
        arr [1][1]=16;
        arr [1][2]=17;
        arr [1][3]=18;

        arr [2][0]=19;
        arr [2][1]=20;
        arr [2][2]=21;
        arr [2][3]=22;
        System.out.println("print the elements of an array");
        for (int i=0 ; i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
