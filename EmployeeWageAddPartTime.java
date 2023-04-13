package EmployeeWage;

import java.util.Random;

public class EmployeeWageAddPartTime {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 4;
        int workHours = 0;
        int dailyWage = 0;

      
        Random random = new Random();
        boolean isFullTime = random.nextBoolean();


        if (isFullTime) {
            System.out.println("Employee is full-time");
            workHours = fullDayHours;
        } else {
            System.out.println("Employee is part-time");
            workHours = partTimeHours;
        }


        dailyWage = workHours * wagePerHour;

        System.out.println("Daily wage of the employee is: " + dailyWage);
    }
}