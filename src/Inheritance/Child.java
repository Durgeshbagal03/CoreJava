package Inheritance;

import java.util.concurrent.Callable;

public class Child extends Parent{
    public void bike ()
    {
        System.out.println("in child bike");
    }
    void car()
    {
        System.out.println("in child car");

    }

    public static void main(String[] args) {
        Child c = new Child();
        c.bike();
        c.car();
        c.farm();
        c.house();


            }
        }


