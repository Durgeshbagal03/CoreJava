package ExceptionHandling;

public class ExceptionClass {
    public static void main(String[] args) {
        int []a={10,20};
        try
        {
            System.out.println(10/0);
            System.out.println(a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of bound");
        }

        {
            System.out.println("super most class");
        }
    }
}
