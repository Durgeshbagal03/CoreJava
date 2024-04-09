import java.util.Scanner;

 class Instagram_ID_PASS_IF_ELSE {
        public static void main(String[] args) {
            String uname = "durgesh";
            String pwd = "123";

            if (uname=="durgesh")
            {
                System.out.println("username is correct");
                if (pwd=="123")
                {
                    System.out.println("password is correct");
                    System.out.println("login succeful");
                }
                else {
                    System.out.println("password is incorrect");
                }
            }else{
                System.out.println("username is incorrect");
            }
        }
    }



