package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

import static java.lang.Math.min;

public class Pattern_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;
                System.out.print(n - min(min(top, bottom), min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}
