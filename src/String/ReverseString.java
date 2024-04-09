package String;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
