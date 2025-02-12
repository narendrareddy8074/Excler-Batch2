//Write a java program to check 1st character is vowel or consonant in String.

import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s1.nextLine();
        char ch = str.charAt(0); 
        System.out.println(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("1st character is vowel");
        } else {
            System.out.println("1st character is consonant");
        }
    }
    
}