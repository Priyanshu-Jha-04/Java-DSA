package DSA_01_The_Basics.BasicRecursion;

import java.util.Scanner;

public class Recursion_06_Factorial {

    static int factorial;

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
