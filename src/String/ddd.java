package String;

public class ddd {
    public static void main(String[] args) {
        String s1= new String("Harsh");
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s1.hashCode());
        String s2=new String("Harsh");
        String s3=new String("Harsh");
        System.out.println(s2.equals(s3));
    }
}
