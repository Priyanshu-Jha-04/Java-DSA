package DSA_01_The_Basics.BasicMaths;

import java.util.Scanner;

public class Maths_03_PalindromeNumber {

    public static int ReverseTheNumber(int n) {
        int digits = 0;
        int reverseNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            digits++;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int k = sc.nextInt();

        if (ReverseTheNumber(k) == k) {
            System.out.println("The number " + k + " is a Palindrome number.");
        } else {
            System.out.println("The number " + k + " is not a Palindrome number.");
        }
    }
}
