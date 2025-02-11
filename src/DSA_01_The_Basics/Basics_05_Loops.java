package DSA_01_The_Basics;

import java.util.Scanner;

public class Basics_05_Loops {
    public static void main(String[] args) {

        // Printing whole number till N using FOR Loop.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Printing whole number till " + n + " using FOR Loop :");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println();

        // Printing whole number till N using WHILE Loop.
        int i = 1;
        System.out.println("Printing whole number till " + n + " using WHILE Loop :");
        while (i<=n) {
            System.out.println(i);
            i++;
        }
    }
}
