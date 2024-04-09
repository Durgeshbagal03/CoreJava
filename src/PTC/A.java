package PTC;

public class A extends Thread{
   public void run()
    {
        for (int i=1;i<100;i++)
        {
            System.out.println("hi");

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        }
}
