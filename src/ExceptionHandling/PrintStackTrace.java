package ExceptionHandling;

public class PrintStackTrace {
    public static void main(String[] args) {
        try
        {
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println( e.getMessage());
            System.out.println("hii");

        }
    }
}
