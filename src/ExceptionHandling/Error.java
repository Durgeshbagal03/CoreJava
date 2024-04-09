package ExceptionHandling;

public class Error {
    public static void main(String[] args) {
        try {
            System.out.println(10 /0);
        }
        catch (java.lang.ArithmeticException e)
        {
            System.out.println("DO not divide by zero");
        }
    }
}
