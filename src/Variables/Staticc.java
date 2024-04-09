package Variables;

public class Staticc {
    int a=5;
    static int b = 10;
    public void m1()
    {
        System.out.println(a);
        System.out.println(b);
    }
    void m3()
    {
        int c =6;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
    static void m2()
    {
        System.out.println("b");
    }

    public static void main(String[] args)
    {
        Staticc s = new Staticc();
        s.m1();
        m2();
        s.m3();
    }
}
