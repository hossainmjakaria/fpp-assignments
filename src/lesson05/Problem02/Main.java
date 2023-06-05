package lesson05.Problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Professor1", 14000, 2001, 1, 1, 35);
        Professor professor2 = new Professor("Professor2", 15000, 2000, 10, 1, 56);
        Professor professor3 = new Professor("Professor3", 10000, 2015, 6, 15, 20);
        Secretary secretary1 = new Secretary("Secretary1", 20000, 2000, 6, 15, 5);
        Secretary secretary2 = new Secretary("Secretary2", 19000, 1999, 8, 20, 3);


        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = professor1;
        department[1] = professor2;
        department[2] = professor3;
        department[3] = secretary1;
        department[4] = secretary2;

        Scanner sc = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("Do you want to see the sum of all Professor and Secretary salary in the department?");
            System.out.println("Enter Y for yes or N for no: ");
            choice = sc.nextLine().toUpperCase();
            if (choice.equals("Y")) {
                double totalSalary = 0;
                for (DeptEmployee emp : department) {
                    totalSalary+= emp.computeSalary();
                }
                System.out.println(totalSalary);
            } else {
                break;
            }
        }

        sc.close();
    }
}
