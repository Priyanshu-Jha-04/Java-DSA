package DSA_01_The_Basics;


class functions {

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public int Add(int a, int b) {
        return a + b;
    }

}

public class Basics_06_Functions {
    public static void main(String[] args) {
        // Create an instance of Functions class.
        functions obj = new functions();

        // Call all functions
        obj.sayHello();
        obj.sayHello("Alice");
        obj.add(5, 10);

        // Call Add method and store the result
        int result = obj.Add(7, 3);
        System.out.println("7 + 3 = " + result);
    }
}
