package Nonstatic;

public class Parameterized_method {
    public int A (int a,int b)
    {
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        Parameterized_method  obj = new Parameterized_method();
       int ab = obj.A(5,10);
        System.out.println(ab);
    }
}
