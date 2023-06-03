package lesson04.Problem02;

public class DigitCounter {
    public static void main(String[] args) {
        System.out.println(count(9897));
    }

    static int count(int n) {
        if (n == 0) return 0;
        return 1 + count(n / 10);
    }
}
