package lesson02;

public class Prog4 {
    public static void main(String[] args) {
        float firstNumber = 1.27f;
        float secondNumber = 3.881f;
        float thirdNumber = 9.6f;
        float sum = firstNumber + secondNumber + thirdNumber;

        int firstValue = (int) sum;
        int secondValue = Math.round(sum);

        System.out.println("First value: " + firstValue);
        System.out.println("Second value: " + secondValue);
    }
}
