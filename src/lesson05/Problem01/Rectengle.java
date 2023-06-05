package lesson05.Problem01;

public class Rectengle extends Shape {
    double width;
    double height;

    Rectengle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}
