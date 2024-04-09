package ExceptionHandling;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int []arr= {10,20,30,40,50};
        System.out.println(arr[2]);
        try{
            System.out.println(arr[50]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid input" );

        }
        System.out.println(arr[3]);
    }
}
