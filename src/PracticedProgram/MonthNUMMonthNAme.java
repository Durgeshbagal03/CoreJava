package PracticedProgram;

import java.util.Scanner;

public class MonthNUMMonthNAme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month num" );
        int month_num = sc.nextInt();
        String month_name;

        switch (month_num)
        {
            case 1 :
                System.out.println("Month is January");
                break;
            case 2 :
                System.out.println("Month is FEB");
                break;
            case 3 :
                System.out.println("Month is March");
                break;
            case 4 :
                System.out.println("Month is April");
                break;


            case 5 :
                System.out.println("Month is May");
                break;

            case 6 :
                System.out.println("Month is June");
                break;
            case 7 :
                System.out.println("Month is July");
                break;
            case 8 :
                System.out.println("Month is Aug");
                break;
            case 9 :
                System.out.println("Month is Sep");
                break;
            case 10 :
                System.out.println("Month is Oct");
                break;
            case 11:
                System.out.println("Month is Nov");
                break;
            case 12:
                System.out.println("Month is Dec");
                break;
            default:
                System.out.println("invalid month_num");

        }
    }
}
