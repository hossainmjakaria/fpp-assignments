package lesson05.Problem04;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return (this.baseSalary + super.getPayment());
    }

    @Override
    public String toString() {
        return super.toString()
                + " - "
                + "Base Plus Commission Employee[Base Salary: "
                + baseSalary
                + ", Total: "
                + this.getPayment()
                + "]";
    }
}
