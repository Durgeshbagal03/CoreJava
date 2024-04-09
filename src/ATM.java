import java.util.*;
public class ATM {
    public static void main(String[] args) {
        System.out.println("welcome to hdfc atm");
        System.out.println("Please insert your card");
        int pin = 2222;
        int tb = 1000;
        int AccN= 12345;
        int mob = 9306;
        System.out.println("Please select the function");
        Scanner sc=new Scanner(System.in);
        int function = sc.nextInt();

        switch (function)
        {
            case 1:   System.out.println("cash deposite");
                System.out.println("enter the amount which have to be deposite");
                int AmtDeposite = sc.nextInt();
                System.out.println("Enter type of Notes");
                System.out.println("Deposite succed with existing balance");
                tb+=AmtDeposite;

                System.out.println(tb);

                break;
            case 2 : System.out.println("Cash withdraw");
                System.out.println("enter the pin ");
                if (pin==2222)
                {
                    System.out.println("enter the amount");
                }else
                {
                    System.out.println("pin incorrect");
                }
                int amount = sc.nextInt();
                if (amount<=tb)
                {
                    System.out.println("cash deducted succefully");
                    tb-= amount;
                }
                else {
                    System.out.println("typed amount is not in account");
                }
                System.out.println("balance in your account is");
                System.out.println(tb);


                break;
            case 3: System.out.println("Reset pin");
                System.out.println("enter your account number");
                int acc = sc.nextInt();
                if (acc==AccN)
                {
                    System.out.println("enter your mobile number");
                    long M=sc.nextInt();
                    if(M==mob)
                    {
                        System.out.println("OTP is send to your mobile number");

                    }else
                    {
                        System.out.println(" mobile number is incorrect");
                        break;
                    }
                    System.out.println("enter the new pin");
                    int newpin = sc.nextInt();
                    pin = newpin;
                    System.out.println("the new pin is");
                    System.out.println(newpin);

                }



                break;
            case 4: System.out.println("check balance");
                System.out.println("total amount is");
                System.out.println(tb);


                break;
            default:
                System.out.println("invalid input");

        }


    }
}



