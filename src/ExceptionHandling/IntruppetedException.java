package ExceptionHandling;
import java.util.Scanner;

public class IntruppetedException extends Throwable {
    public static void main(String[] args) throws IntruppetedException {
        for (int i=1;i<=5;i++)
        {
            System.out.println(i);
            try
            {
            Thread.sleep(1000);
            }catch (  InterruptedException e)
            {
                e.printStackTrace();
            }
        }
       throw new IntruppetedException(); }
    }
