package lesson03.Problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String dateOfBirth;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your first name: ");
        firstName = sc.nextLine();

        System.out.println("Please, enter your last name: ");
        lastName = sc.nextLine();

        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd): ");
        dateOfBirth = sc.nextLine();

        HeartRates hr = new HeartRates(firstName,lastName,dateOfBirth);
        System.out.println(hr);

        sc.close();

    }
}
