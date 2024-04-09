package HierarchicalInheritance;

public class B extends A {
    void bike()
    {
        System.out.println("in B");
    }

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.car();
        obj1.bike();
    }
}
