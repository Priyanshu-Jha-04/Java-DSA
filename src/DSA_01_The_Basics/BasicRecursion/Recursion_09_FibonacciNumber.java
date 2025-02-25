package DSA_01_The_Basics.BasicRecursion;

import java.util.Scanner;

public class Recursion_09_FibonacciNumber {

    public static int fibonacciNumber(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

    public static int fibonacciNumberUsingLoop(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int prev1 = 0, prev2 = 1, current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(fibonacciNumber(n));
        System.out.println(fibonacciNumberUsingLoop(n));
    }
}
