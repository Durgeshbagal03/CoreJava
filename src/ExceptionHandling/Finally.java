package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try
        {
            System.out.println(10/2);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("hii");
        }


    }
}
