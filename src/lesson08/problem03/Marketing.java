package lesson08.problem03;

import java.util.Objects;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "Marketing [" + "Employee Name: " + employeeName + ", Product Name: " + productName + ", Sales Amount: " + salesAmount + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing marketing = (Marketing) o;
        return Double.compare(marketing.salesAmount, salesAmount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }
}
