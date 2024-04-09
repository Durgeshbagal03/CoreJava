package Calculator;

import java.util.Scanner;

public class CalculateClass implements Add,Sub,Multiplication,Division{
Scanner sc = new Scanner(System.in);


        @Override
        public void add() {
                System.out.println("enter the two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum= a+b;
                System.out.println(sum);



        }

        @Override
        public void Divide() {
                System.out.println("enter the two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int division= a/b;
                System.out.println(division);


        }

        @Override
        public void multiply() {
                System.out.println("enter the two numbers");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                float multiply= a*b;
                System.out.println(multiply);

        }

        @Override
        public void Sub() {
                System.out.println("enter the two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sub= a-b;
                System.out.println(sub);


        }

        public static void main(String[] args) {
                CalculateClass obj= new CalculateClass();
                obj.multiply();

        }
}
