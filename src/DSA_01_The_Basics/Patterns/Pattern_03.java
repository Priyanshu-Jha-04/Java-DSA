package DSA_01_The_Basics.Patterns;

import java.util.Scanner;

public class Pattern_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
}
