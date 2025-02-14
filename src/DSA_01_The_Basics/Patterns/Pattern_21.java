package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == (n - 1)) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                System.out.print("* ");
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
                System.out.print("* ");
                System.out.println();
            }
        }
    }
}
