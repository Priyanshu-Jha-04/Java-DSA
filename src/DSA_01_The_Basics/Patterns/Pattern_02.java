package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

public class Pattern_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");
        int t = sc.nextInt(); // No. of test cases

        for (int k = 0; k < t; k++) {

            System.out.println("Enter the number of rows : ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
