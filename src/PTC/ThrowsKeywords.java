package PTC;

public class ThrowsKeywords {
    public static void b (int a[])
        {
        System.out.println(a[0]);
        System.out.println(a[10]/0);
    }

    public static void main(String[] args) throws Exception {
        int a[]={5,4,7,8,9};
        b(a);
        //ThrowsKeywords obj = new ThrowsKeywords();

    }
}
