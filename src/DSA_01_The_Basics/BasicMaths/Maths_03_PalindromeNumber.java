package DSA_01_The_Basics.BasicMaths;

import java.util.Scanner;

public class Maths_03_PalindromeNumber {

    public static boolean isPalindrome(int n) {
        int reverseNumber = 0;
        int num = n;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        return n == reverseNumber;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int k = sc.nextInt();

        if (isPalindrome(k)) {
            System.out.println("The number " + k + " is a Palindrome number.");
        } else {
            System.out.println("The number " + k + " is not a Palindrome number.");
        }
    }
}
