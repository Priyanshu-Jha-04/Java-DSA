package DSA_01_The_Basics.BasicRecursion;

import java.util.Scanner;

public class Recursion_04_BackwardCounting {

    public static void backwardCounting(int a, int b) {
        if (b<a) return;
        System.out.println(b);
        backwardCounting(a, b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        backwardCounting(1,n);
    }
}
