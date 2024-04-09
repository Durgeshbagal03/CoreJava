package PracticedProgram;

import java.util.Scanner;

public class CharacterIsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
        {
            System.out.println("character is  aplhabet" );
        }else {
            System.out.println("character is not alphabet");
        }
    }
}
