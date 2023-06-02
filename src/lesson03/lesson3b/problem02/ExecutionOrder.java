package lesson03.lesson3b.problem02;

public class ExecutionOrder {
    private int instanceField1 = 1;
    private int instanceField2 = 2;
    private static int staticField = superIntMethod();

    public ExecutionOrder(int param1) {
        this.instanceField1 = param1;
        System.out.println("From Constructor:1 >> First Number: " + this.instanceField1);
        System.out.println();
    }

    public ExecutionOrder(int param1, int param2) {
        this.instanceField1 = param1;
        this.instanceField2 = param2;
        System.out.println("From Constructor:2 >> First Number: " + this.instanceField1);
        System.out.println("From Constructor:2 >> Second Number: " + this.instanceField2);

    }

    public int instanceMethod1() {
        return 10;
    }

    public int instanceMethod2() {
        return 20;
    }

    public static void staticMethod1() {
        System.out.println("First static method");
    }

    public static void staticMethod2() {
        System.out.println("Second static method");
    }

    public static int superIntMethod() {
        System.out.println("1 - Initializing super static int");
        return 1;
    }

    {
        System.out.println("4 - First instance block");
        System.out.println("Initial First Number: " + instanceField1);
    }

    {
        System.out.println("5 - Second instance block");
        System.out.println("Initial Second Number: " + instanceField2);
    }

    static {
        System.out.println("2 - First static block");
    }

    static {
        System.out.println("3 - Second static block");
    }
}
