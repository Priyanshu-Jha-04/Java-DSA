package DSA_01_The_Basics.LanguageBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Basics_04_Arrays_Strings {
    public static void main(String[] args) {

        // Array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt(); // Taking input of the length of an Array

        int arr[] = new int[n]; // Creating the Array

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: " + Arrays.toString(arr));
        

        // String
        String str = "Hello";
        System.out.println(str.charAt(4)); // Array concept is used
        // Strings are immutable in JAVA
    }
}
