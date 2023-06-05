package lesson05.Problem02;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    Secretary(String name, double salary, int year, int month, int dayOfMonth, double overtimeHours) {
        super(name, salary, year, month, dayOfMonth);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * this.overtimeHours);
    }
}
