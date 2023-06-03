package lesson04.Problem01;

public class ReverseOrder {
    public static void main(String[] args) {
        int number = 123;
        reverse(number);
    }

    public static void reverse(int n) {
        if (n == 0) {
        } else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }
}
