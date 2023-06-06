package lesson05.Problem03;

public class Vertical implements Figure{
    @Override
    public void getFigure() {
        System.out.print("||");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + "||";
    }
}
