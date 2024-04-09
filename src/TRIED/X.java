package TRIED;



public class X extends Z {
    void c() {
        System.out.println("in c");
    }

    public static void main(String[] args) {
        X obj = new X();
        obj.c();
        obj.b();
        obj.a();


    }
}

