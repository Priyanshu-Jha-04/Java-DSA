package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

public class Pattern_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");
        int t = sc.nextInt(); // No. of test cases

        for (int k = 0; k < t; k++) {
            // To check for various test cases
            System.out.println("Enter the size of the pattern : ");
            int n = sc.nextInt();

            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
