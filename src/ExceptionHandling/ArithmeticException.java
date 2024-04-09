package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("start the progrfam" );
        System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();
        try
        {
            System.out.println(a/b);
        }
        catch (java.lang.ArithmeticException e)
        {
            System.out.println("do  not divide by zero");
        }
    }
}
