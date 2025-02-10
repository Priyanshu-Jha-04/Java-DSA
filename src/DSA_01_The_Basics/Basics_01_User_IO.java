package DSA_01_The_Basics;

import java.util.Scanner; // To take input form the user the first thing we need to do is to import "java.util.Scanner"

public class Basics_01_User_IO {
    public static void main(String[] args) {

        // Simple Output.
        System.out.println("Hello, It's me Priyanshu this side.");

        // "\n" is used in the SOUT to start a new line in the Output.
        System.out.println("Hey.... \nThis is how you put a new line.");

        // Difference between "println" and "print" function and how to print double quotes.
        System.out.print("\"Print\" function do not prints a new line at the end. ");
        System.out.println("\"Println\" function is used to print a new line at the end in the output.");


        // Input
        // Create an object of the imported Scanner class.
        Scanner sc = new Scanner(System.in);

        // Declare the variable in which you want to store the value and call the Scanner class object with the proper DataType.
        System.out.println("Enter Name :");
        String name = sc.nextLine(); // nextLine() for String

        System.out.println("Gender :");
        char gender = sc.next().charAt(0); // next().charAt(0) for a character

        System.out.println("Enter age :");
        int age = sc.nextInt(); // nextInt() for Integer

        System.out.println("Enter Mobile Number :");
        long mobileNo = sc.nextLong(); // nextLong() for Large Value Integers

        System.out.println("Enter CGPA :");
        float cgpa = sc.nextFloat(); // nextFloat() for Decimal Values

    }
}
