package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the peak row : ");
        int n = sc.nextInt();

        int start = 1;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }

    }
}
