package String;

import java.util.Locale;

public class String_Compare {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "Java";
        String s3 = "Software Developer";
        String name = "Durgesh ";
        String MName= "Sanjay ";
        String Surname = "Bagal ";
        String City= "Chh Sambhajinagar";

        System.out.println("-----------");
        System.out.println(s1.equals(s2));
        System.out.println("-----------");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("-----------");
        System.out.println(s2.length());
        System.out.println("-----------");
        System.out.println(s3.charAt(9));
        System.out.println("-----------");
        System.out.println(s3.indexOf('o'));
        System.out.println("-----------");
        System.out.println(s3.lastIndexOf('o'));
        System.out.println("-----------");
        System.out.println(s3.startsWith("Soft"));
        System.out.println("-----------");
        System.out.println(s3.endsWith("er"));
        System.out.println("-----------");
        System.out.println(s3.replace('e','h'));
        System.out.println("-----------");
        System.out.println(s3.substring(4,8));
        System.out.println("-----------");
        System.out.println(s3.substring(9));
        System.out.println("-----------");
        System.out.println(s3.toUpperCase(Locale.ROOT));
        System.out.println("-----------");
        System.out.println(s3.toLowerCase(Locale.ROOT));
        System.out.println("-----------");
        System.out.println(name.concat(MName).concat(Surname));
        System.out.println("-----------");
        System.out.println(s3.contains("Dev"));
        System.out.println("-----------");

//        String[] split = s2.split("java");
//
//        for(int i=split.length-1; i>=0; i--)
//        {
//            System.out.print(split[i] + " ");
//        }


    }
        }
