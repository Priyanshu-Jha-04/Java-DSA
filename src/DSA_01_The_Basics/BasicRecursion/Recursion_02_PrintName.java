package DSA_01_The_Basics.BasicRecursion;

import java.util.Scanner;

public class Recursion_02_PrintName {

    public static void printNameMultipleTimes(int a, int b) {
        if (a>b) return;
        System.out.println("Priyanshu");
        printNameMultipleTimes(a+1,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of times : ");
        int n = sc.nextInt();
        printNameMultipleTimes(1,n);
    }
}
