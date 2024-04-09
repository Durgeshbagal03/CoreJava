package ExceptionHandling;

import javax.lang.model.type.NullType;

public class NullPointerException {
    public static void main(String[] args) {

        try
        {
            String a= null;
            System.out.println(a.length());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
