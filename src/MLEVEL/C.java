package MLEVEL;

import java.util.concurrent.Callable;

public class C extends A {
    void c() {
        System.out.println("in c");
    }

    public static void main(String[] args) {
     C obj = new C();
     obj.c();
     obj.a();
     obj.b();

    }
}