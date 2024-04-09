package ThisSuper;

import Inheritance.Child;
import Inheritance.Parent;

public class child extends parent {
    int a=30;
    int b=40;

   public void m1()
    {
        int a =5;
        int b=6;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);

    }

    public static void main(String[] args) {
        child z = new child();
        z.m1();
    }
}
