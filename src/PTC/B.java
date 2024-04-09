package PTC;

public class B extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("hello");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}