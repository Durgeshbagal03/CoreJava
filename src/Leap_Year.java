import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int year;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the year");
        year = sc.nextInt();
        String checked = "false";
        if (year%4==0)
        {
            System.out.println("the year is leap");
            if (year%100==0)
            {
                System.out.println("the year is leap");
                if (year%400==0)
                {
                    System.out.println("year is Leap");;
                }
            }
        }else
        {
            System.out.println(" year is not leap");
        }

    }
}
