package CollectionList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add(40);
        al.add(20);
        al.add(10);
        al.add(30);

        Collections.sort(al);
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        //for (Object i:al
          //   ) {
            //System.out.println(i);

        }
    }

