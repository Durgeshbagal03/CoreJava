package PracticedProgram;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b)
        {
            System.out.println("a is a maximum number");
        }
        else
        {
            System.out.println("b is a maximum number");
        }
    }
}
