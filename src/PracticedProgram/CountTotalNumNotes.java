package PracticedProgram;

import java.util.Scanner;

public class CountTotalNumNotes {
    public static void main(String[] args) {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);


        int amt = sc.nextInt();
        int n500=0,n200=0,n100=0,n50=0,n20=0,n10=0;
        while(amt>=500)
        {
           n500 = amt/500;
           amt = amt%500;
            System.out.println("total num of 500 notes are:"+n500);
            break;
        }
        while(amt>=200)
        {
            n200 = amt/200;
            amt = amt%200;
            System.out.println("total num of 200 notes are:"+n200);
            break;
        }
        while(amt>=100)
        {
            n100 = amt/100;
            amt = amt%100;
            System.out.println("total num of 100 notes are:"+n100);
            break;
        }
        while(amt>=50)
        {
            n50 = amt/50;
            amt = amt%50;
            System.out.println("total num of 50 notes are:"+n50);
            break;
        }
        while(amt>=20)
        {
            n20 = amt/20;
            amt = amt%20;
            System.out.println("total num of 20 notes are:"+n20);
            break;
        }
        while(amt>=10)
        {
            n10 = amt/10;
            amt = amt%10;
            System.out.println("total num of 10 notes are:"+n10);
            break;
        }

        int Total_num_notes = n10+n20+n50+n100+n200+n500;
        System.out.println(Total_num_notes);

    }
}
