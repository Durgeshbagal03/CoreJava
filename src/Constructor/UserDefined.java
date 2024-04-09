package Constructor;

public class UserDefined {
    int a;
    float b;
    char c;
    boolean d;
    String s;

    UserDefined()
    {
        a=10;
        b=10.052f;
        c='z';
        d=true;
        s="Pune";


    }
    public void car()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }

    public static void main(String[] args) {
        UserDefined u = new UserDefined();
        u.car();
    }
}
//userdefined can work when we crete constructor same as class name and pass values through it of global variables
