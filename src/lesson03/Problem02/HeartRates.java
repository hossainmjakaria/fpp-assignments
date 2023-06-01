package lesson03.Problem02;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private final float RHR = 70f;
    private final float LB = 0.5f;
    private final float UB = 0.85f;
    private float MHR;
    private float AHR;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int age;


    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = calculatePersonAge();
        this.MHR = calculateMaximumHeartRateRange(this.age);
        this.AHR = MHR - RHR;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculatePersonAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = LocalDate.parse(dateOfBirth, formatter);
        LocalDate today = LocalDate.now();

        return Period.between(birthday, today).getYears();
    }

    public float calculateMaximumHeartRateRange(int age) {
        return 220 - age;
    }

    public String calculateTargetHeartRateRange(int age) {
        float LBTHR = (AHR * LB) + RHR;
        float UBTHR = (AHR * UB) + RHR;
        return "The Target Heart Rate Range is between " + LBTHR + " and " + UBTHR;
    }

    @Override
    public String toString() {
        return this.calculateTargetHeartRateRange(age)
                + "\nFirst Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nAge: " + this.age
                + "\nDate of Birth: " + this.dateOfBirth
                + "\nMaximum Heart Rate(MHR): " + MHR;
    }
}
