package Arrays;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int temp;
        int b[]= {20,40,60,20,30,50,40};
        System.out.println("Duplicate elements are");
        for (int i = 0;i<b.length;i++)
        {
            for (int j=i+1;j<b.length;j++)
            {
                if (b[i]==b[j])
                {

                    System.out.println(b[i]);

                }
            }
        }
    }
}
