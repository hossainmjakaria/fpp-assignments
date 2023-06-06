package lesson05.Problem03;

public class FaceMaker implements Figure {
    @Override
    public void getFigure() {
        System.out.print(":)");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + ":)";
    }
}
