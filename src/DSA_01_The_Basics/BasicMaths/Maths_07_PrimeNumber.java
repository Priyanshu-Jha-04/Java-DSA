package DSA_01_The_Basics.BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maths_07_PrimeNumber {

    public static void isPrime(int n) {
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
        if (list.size() == 2) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int k = sc.nextInt();

        isPrime(k);
    }
}
