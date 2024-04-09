package PrimitiveNonPrimitive;

import java.util.LinkedList;

public class Generics {
    public static <object> void main(String[] args) {
        LinkedList<String> l1 = new LinkedList();// by using generics < >
        l1.add("10");
        l1.add("amber");
        l1.add("safe");
        for (String i : l1
        ) {
            System.out.println(i);
        }
        LinkedList l2 = new LinkedList();//  without using generics < > by using object supermost class
        l2.add(10);
        l2.add("amber");
        l2.add(null);
        for (Object z : l2
        ) {
            System.out.println(z);

        }
    }
}



