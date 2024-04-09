package Abstraction;

public class Final  extends Example{

    @Override
    void student() {

    }

    @Override
    void teachers() {

    }

    @Override
    void clg() {

    }

    @Override
    public void demo() {


    }
    void hod()
    {
        System.out.println(" i am in hod");
    }

    public static void main(String[] args) {
        Final obj = new Final();
        obj.clg();
        obj.demo();
        obj.hod();
        obj.student();
        obj.teachers();
        obj.tpo();
    }
}
