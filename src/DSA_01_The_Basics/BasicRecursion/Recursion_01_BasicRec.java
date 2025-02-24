package DSA_01_The_Basics.BasicRecursion;

public class Recursion_01_BasicRec {

    static int cnt = 0;

    public static void recursiveFunction() {
        if(cnt == 3) return;
        System.out.println(cnt);
        cnt = cnt + 1;
        recursiveFunction();
    }

    public static void main(String[] args) {
        recursiveFunction();
    }
}
