package ConstructorChaining;

public class RecursiveChaining {
    RecursiveChaining(int a)
    {
        System.out.println(a);
    }
    RecursiveChaining()
    {   this(512);
        System.out.println("Recursive chaining");
    }

    public static void main(String[] args) {
       // RecursiveChaining obj = new RecursiveChaining();
    }
}
