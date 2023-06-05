package lesson05.Problem02;

public class Professor extends DeptEmployee {
    private int numberOfPublications;

    Professor(String name, double salary, int year, int month, int dayOfMonth, int numberOfPublications) {
        super(name, salary, year, month, dayOfMonth);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
