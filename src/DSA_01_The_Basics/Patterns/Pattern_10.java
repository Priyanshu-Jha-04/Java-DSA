package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the peak row : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars = i;

            if (i > n) stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
