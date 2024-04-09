package Constructor;

public class Default {
    int a;
    float b;
    char c;
    boolean d;
    String s;
    public void demo(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);




    }

    public static void main(String[] args) {
        Default d = new Default();
        d.demo();

    }
}
