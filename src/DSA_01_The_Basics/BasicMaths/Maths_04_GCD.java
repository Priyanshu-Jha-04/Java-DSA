package DSA_01_The_Basics.BasicMaths;

import java.util.Scanner;

public class Maths_04_GCD {

    public static int gcd(int a, int b) {
        int max = Math.max(a, b);
        int gcd = 1;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 & b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int k = sc.nextInt();
        System.out.print("Enter the second number: ");
        int l = sc.nextInt();

        System.out.println("GCD = " + gcd(k, l));

    }
}
