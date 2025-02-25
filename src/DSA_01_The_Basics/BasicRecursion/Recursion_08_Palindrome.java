package DSA_01_The_Basics.BasicRecursion;

import java.util.Scanner;

public class Recursion_08_Palindrome {

    public static boolean isPalindrome(int i, String str) {
        if (i>=str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return isPalindrome(i+1,str);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(0,str));
    }
}
