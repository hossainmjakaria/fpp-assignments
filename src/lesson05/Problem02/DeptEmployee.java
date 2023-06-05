package lesson05.Problem02;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private LocalDate hireDate;
    private double salary;

    DeptEmployee(String name, double salary, int year, int month, int dayOfMonth){
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, dayOfMonth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(int year, int month, int dayOfMonth) {
        this.hireDate = LocalDate.of(year, month, dayOfMonth);
    }

    public double computeSalary(){
        return salary;
    }
}
