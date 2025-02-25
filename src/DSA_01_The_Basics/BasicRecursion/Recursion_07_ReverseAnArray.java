package DSA_01_The_Basics.BasicRecursion;

import java.util.Arrays;

public class Recursion_07_ReverseAnArray {

    public static void reverseArray(int start, int end,int[] arr) {
        if (start>=end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(start+1,end-1,arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));

        reverseArray(0,4,arr);
        System.out.print("Reversed Array: ");
        System.out.println(Arrays.toString(arr));
    }
}
