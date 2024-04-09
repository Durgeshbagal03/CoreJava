package PracticedProgram;

import java.util.Scanner;

public class AngleOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the angles of a triangle");
        Scanner sc= new Scanner(System.in);
        int an1 = sc.nextInt();
        int an2 = sc.nextInt();
        int an3 = sc.nextInt();

        if (an1+an2+an3==180)
        {
            System.out.println("Triangle is Valid");
        }
        else
        {
            System.out.println("triangle is invalid");
        }
    }
}
