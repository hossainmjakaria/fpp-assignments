package lesson08.problem02;

import java.util.List;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double totalSalaries = 0.0;
        for (EmployeeData e : aList) {
            totalSalaries += e.getSalary();
        }
        return totalSalaries;
        //implement
        //compute sum of all salaries of people in aList and return
    }
}
