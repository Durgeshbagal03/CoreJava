package CollectionList;

import java.util.ArrayList;

public class ArraylistMethods {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add("java");
        al.add(10);
        al.add(10);
        al.add(30.52);
        al.add(null);
        System.out.println(al.size());
        System.out.println("---------------------");
        System.out.println(al);
        System.out.println("---------------------");
        al.remove(3);  //for removing one element with respect to index basis
        System.out.println(al);
        System.out.println("---------------------");
        System.out.println(al.isEmpty());//cheked is arraylist is empty or not
        System.out.println("---------------------");
      //  al.clear();// clear all the elements from the arraylist
        System.out.println("---------------------");
        System.out.println(al.isEmpty());

        System.out.println(al.indexOf(10));
        System.out.println(al.lastIndexOf(10));
        System.out.println(al.indexOf(100));


    }
}
