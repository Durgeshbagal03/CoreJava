package MethodOverriding;

public class Son extends PapasBike{

    public void child()
    {
        System.out.println("in child and cycle");
    }

    public static void main(String[] args) {
        Son obj =  new Son();
        obj.bike();
        obj.child();


    }
}
