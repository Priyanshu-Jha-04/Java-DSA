package DSA_01_The_Basics;

public class Basics_02_DataTypes {
    public static void main(String[] args) {
        // byte: 8-bit signed integer, range: -128 to 127
        byte a = 10;

        // int: 32-bit signed integer, range: -2^31 to 2^31-1
        int b = 20;

        // short: 16-bit signed integer, range: -32,768 to 32,767
        short c = 30;

        // long: 64-bit signed integer, range: -2^63 to 2^63-1
        // Needs 'L' at the end to specify it's a long
        long d = 5465L;

        // float: 32-bit floating-point number
        // Needs 'F' at the end to specify it's a float
        float e = 10.3F;

        // double: 64-bit floating-point number (higher precision than float)
        // 'd' at the end is optional, as double is the default for decimals
        double f = 231650.6546d;

        // boolean: Represents true or false values
        boolean g = true;

        // char: 16-bit Unicode character (stores a single character)
        char h = 'h';

        // String: A sequence of characters, not a primitive type (it's an object)
        String i = "Hello!";

        // Printing all values
        System.out.println(a);  // Output: 10
        System.out.println(b);  // Output: 20
        System.out.println(c);  // Output: 30
        System.out.println(d);  // Output: 5465
        System.out.println(e);  // Output: 10.3
        System.out.println(f);  // Output: 231650.6546
        System.out.println(g);  // Output: true
        System.out.println(h);  // Output: h
        System.out.println(i);  // Output: Hello!
        
    }
}

