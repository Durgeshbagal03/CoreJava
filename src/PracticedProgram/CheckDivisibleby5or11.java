package PracticedProgram;

import java.util.Scanner;

public class CheckDivisibleby5or11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if (num%5==0 && num%11==0)
        {
            System.out.println("Number is divible by 5 and 11");

        }else {
            System.out.println("Number is not divible by 5 and 11");
        }


    }
}
