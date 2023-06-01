package lesson03.Problem03;

public final class Rectangle {

    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double computeArea() {
        return width * length;
    }
}
