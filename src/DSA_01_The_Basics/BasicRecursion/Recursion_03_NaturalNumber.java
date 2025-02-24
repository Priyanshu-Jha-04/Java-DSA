package DSA_01_The_Basics.BasicRecursion;

import java.util.Scanner;

public class Recursion_03_NaturalNumber {

    static void naturalNumbers(int a, int b) {
        if (a > b) return;
        System.out.println(a);
        naturalNumbers(a + 1, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        naturalNumbers(1, n);
    }
}
