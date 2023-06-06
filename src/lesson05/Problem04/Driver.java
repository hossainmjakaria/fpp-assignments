package lesson05.Problem04;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = {
                new CommissionEmployee("Ken", "Covington", "7639", 10000, 0.10),
                new BasePlusCommissionEmployee("Warren", "Daves", "9809", 1000, 0.10, 1000),
                new HourlyEmployee("Daniel", "Junior", "6677", 100, 8),
                new SalariedEmployee("Mortimer", "Elledge", "8854", 1000)
        };

        System.out.println("Current Status of Employee: ");

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        double totalPayment = 0;

        for (Employee emp : employees) {
            totalPayment += emp.getPayment();
        }

        System.out.println("\nTotal Payment: " + totalPayment);
    }
}
