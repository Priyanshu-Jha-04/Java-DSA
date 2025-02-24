package DSA_01_The_Basics.BasicRecursion;

import java.util.Scanner;

public class Recursion_05_SumOfNaturalNumbers {

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " numbers = " + sum(n));
    }
}
