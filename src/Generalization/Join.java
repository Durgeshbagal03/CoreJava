package Generalization;

public class Join implements Fath,play{
    @Override
    public void earn() {
        System.out.println("earning of fath");
    }

    @Override
    public void play() {
        System.out.println("in playing boy");

    }

    public static void main(String[] args) {
        Join obj = new Join();
        obj.earn();

    }
}
