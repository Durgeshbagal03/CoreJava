package Arrays;

public class SortingInAscending {
    public static void main(String[] args) {
        int temp=0;


        int arr[] = {10, 50, 90, 60, 20, 30};
        System.out.println("given array elements are as following");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        // sorted arraye for loop

        System.out.println("Sorted Ascending order array elements");
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1; j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp ;
                }
            }
            System.out.println(arr[i]);
        }


    }

}
