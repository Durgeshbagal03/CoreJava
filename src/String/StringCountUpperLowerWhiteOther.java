package String;
import java.util.Scanner;

public class StringCountUpperLowerWhiteOther {
    public static void main(String[] args) {
        System.out.println("Enter the String :");


        Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int whitespacecount =0;
            int Uppercasecount =0;
            int Lowercasecount =0;
            int othercharactercount =0;

            for(int i=0;i<=str.length()-1;i++){
                char ch = str.charAt(i);
                if(Character.isWhitespace(ch)){
                   whitespacecount++ ;
                }
                else if(Character.isUpperCase(ch)){
                    Uppercasecount++;
                }
                else if(Character.isLowerCase(ch)){
                    Lowercasecount++;
                }
                else{
                    othercharactercount++;
                }
            }
        System.out.println("Count of whitespaces are:"+whitespacecount);
        System.out.println("Count of Uppercase are:"+Uppercasecount);
        System.out.println("Count of Lowercase are:"+Lowercasecount);
        System.out.println("Count of OtherCharacter are:"+othercharactercount);

    }

        }


