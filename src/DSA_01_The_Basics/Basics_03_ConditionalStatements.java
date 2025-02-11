package DSA_01_The_Basics;
import java.util.Scanner;

public class Basics_03_ConditionalStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        // Condition using If-Else statement.
        if (a>b) {
            System.out.println(a + " > " + b);
        }
        else if ( a == b) {
            System.out.println(a + " = " + b);
        }
        else {
            System.out.println(a + " < " + b);
        }

        // Switch case 
        System.out.println("Enter the week day in number : ");
        int day = sc.nextInt(); // 1 -> Monday, 7 -> Sunday

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // Used in all other conditions except the defined ones.
                System.out.println("Invalid Input !!!");
        }
    }
}
