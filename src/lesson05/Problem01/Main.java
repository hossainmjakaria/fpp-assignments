package lesson05.Problem01;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Rectengle("Red", 20.0, 10),
                new Square("Blue", 30.0),
                new Circle("Green", 35.0),
                new Rectengle("Red", 25.0, 15),
                new Square("Orange", 25.0),
                new Circle("Purple", 5.0),
        };

        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total area of all Shape objects: " + totalArea);
        System.out.println("Total perimeter of all Shape objects: " + totalPerimeter);
    }
}
