package DSA_01_The_Basics.BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Maths_06_Divisors {
    
    // Method 1 (Time complexity is more)
    public static void allDivisors(int n) {
        System.out.println("The Divisors of " + n + " are : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Method 2 (Time complexity is less)
    public static void allDivisorsList(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if ((n / i) != i) {
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
        ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int k = sc.nextInt();

        allDivisors(k);
        System.out.println();
        allDivisorsList(k);
    }
}
