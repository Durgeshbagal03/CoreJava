package Fuel_Problem;

import java.util.Scanner;

public class Ticket_Booking {
   public void Trip(){
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the transport faciliti which you requred\n" +
               "flight = 1\n" +
               "ship = 2\n" +
               "bus = 3\n" );
       int choice = sc.nextInt() ;



        switch(choice)
        {
            case 1:
                System.out.println("pay the flight ticket 6000");
                int F_ticket = sc.nextInt();
                if(F_ticket==6000)
                {
                    System.out.println("habibi you are going to dubai");
                }
                else{
                    System.out.println("pay the complete ticket");
                }
                break;
            case 2:
                System.out.println("pay the ship ticket 5000");
                int S_ticket = sc.nextInt();
                if(S_ticket==5000)
                {
                    System.out.println("habibi you are going to dubai");
                }
                else{
                    System.out.println("pay the complete ticket");
                }
                break;
            case 3:
                System.out.println("pay the bus ticket 2000");
                int B_ticket = sc.nextInt();
                if(B_ticket==2000)
                {
                    System.out.println("habibi you are going to dubai");
                }
                else{
                    System.out.println("pay the complete ticket");
                }
                break;


        }

    }

    public static void main(String[] args) {
        Ticket_Booking obj= new Ticket_Booking();
        obj.Trip();

    }


}
