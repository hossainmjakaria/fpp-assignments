package lesson03.Problem03;

public final class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
