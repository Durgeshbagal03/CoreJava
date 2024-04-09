package PracticedProgram;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int sell = sc.nextInt();
        if (sell > cp) {
            System.out.println("profit");
        } else {
            System.out.println("loss");
        }


    }
}
