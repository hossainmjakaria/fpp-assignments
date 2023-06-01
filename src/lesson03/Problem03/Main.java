package lesson03.Problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");

            String shapeType = sc.nextLine().toUpperCase();

            switch (shapeType) {
                case "C":
                    System.out.println("Enter the radius of the Circle: ");
                    double radius = Double.parseDouble(sc.nextLine());
                    Circle circle = new Circle(radius);
                    System.out.println("The area of Circle is: " + circle.computeArea());
                    break;
                case "R":
                    System.out.println("Enter the width of the Rectangle: ");
                    double width = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter the length of the Rectangle: ");
                    double length = Double.parseDouble(sc.nextLine());
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.println("The area of Rectangle is: " + rectangle.computeArea());
                    break;
                case "T":
                    System.out.println("Enter the base of the Triangle: ");
                    double base = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter the height of the Triangle: ");
                    double height = Double.parseDouble(sc.nextLine());
                    Triangle triangle = new Triangle(base, height);
                    System.out.println("The area of radius is: " + triangle.computeArea());
                    break;
            }

            System.out.println("Enter Y for yes or N for no: ");
            choice = sc.nextLine();
        } while ((choice.startsWith("Y") || choice.startsWith("y")));

        sc.close();
    }
}
