package DSA_01_The_Basics.BasicMaths;

import java.util.Scanner;

public class Maths_01_CountDigits {

    public static int CountDigits(int number) {
        int digits = 0;
        while (number > 0) {
            digits++;
            number = number / 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int k = sc.nextInt();

        int n = CountDigits(k);

        System.out.println("The number " + k + " has " + n + " digits.");
    }
}
