package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < (2 * i + 1); j++) {
                if (j < breakpoint) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print(ch + " ");
                    ch--;
                }
            }
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
