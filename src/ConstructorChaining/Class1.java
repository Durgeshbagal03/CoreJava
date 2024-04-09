package ConstructorChaining;

public class Class1 {
    Class1 (int a)

    {
        System.out.println(10);

    }
     Class1()
     {
         this(45);
         System.out.println("no parameter");
     }

    public static void main(String[] args) {
        Class1 obj = new Class1();

    }
}
