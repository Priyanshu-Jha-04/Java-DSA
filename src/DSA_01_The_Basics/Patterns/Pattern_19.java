package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        int initialSpaces=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (n-i); j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= (2*i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
