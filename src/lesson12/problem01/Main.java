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
            throw new InputMismatchException("The wrong entry of data instead of int value.");
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
            throw new UnsupportedOperationException(ex.getMessage());
        }

        System.out.println("Your number is valid.");
    }
}
