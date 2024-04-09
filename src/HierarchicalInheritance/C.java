package HierarchicalInheritance;

public class
C extends A {
    void bus()
    {
        System.out.println("in C");

    }

    public static void main(String[] args) {
        C obj = new C();
        obj.car();
        obj.bus();
    }
}
