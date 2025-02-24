package DSA_01_The_Basics.BasicMaths;

import java.util.Scanner;

public class Maths_05_ArmstrongNumber {

    public static boolean isArmstrong(int n) {
        int lastDigit;
        int sum = 0;
        int num = n;
        int number = n;
        int digits = 0;
        while (number > 0) {
            digits++;
            number = number / 10;
        }
        while (n > 0) {
            lastDigit = n % 10;
            n = n / 10;
            sum = sum + (int) Math.pow(lastDigit, digits);
        }
        return (num == sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int k = sc.nextInt();

        if (isArmstrong(k)) {
            System.out.println("The number " + k + " is an Armstrong number.");
        } else {
            System.out.println("The number " + k + " is not an Armstrong number.");
        }
    }
}
