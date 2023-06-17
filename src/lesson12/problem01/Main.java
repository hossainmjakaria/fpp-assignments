package lesson12.problem01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;

        System.out.print("Enter your number to validate: ");
        try {
            value = sc.nextInt();

            if (value < 0 || value > 100) {
                throw new UnsupportedOperationException("The inputs not in the range of 0-100");
            }
        } catch (InputMismatchException ex) {
            String message = ex.getMessage();
            System.out.println(message);
            throw new InputMismatchException("The wrong entry of data instead of int value.");
        } catch (UnsupportedOperationException ex) {
            String message = ex.getMessage();
            System.out.println(message);
            throw new UnsupportedOperationException(message);
        }

        System.out.println("Your number is valid.");
    }
}
