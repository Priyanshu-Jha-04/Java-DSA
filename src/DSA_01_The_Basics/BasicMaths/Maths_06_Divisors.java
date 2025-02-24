package DSA_01_The_Basics.BasicMaths;

import java.util.Scanner;

public class Maths_06_Divisors {

    public static void allDivisors(int n) {
        System.out.println("The Divisors of " + n + " are : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int k = sc.nextInt();

        allDivisors(k);
    }
}
