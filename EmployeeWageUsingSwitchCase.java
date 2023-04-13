package EmployeeWage;

import java.util.Random;

public class EmployeeWageUsingSwitchCase {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int workHours = 0;
        int dailyWage = 0;

        Random random = new Random();
        int employeeType = random.nextInt(2); // 0 for part-time, 1 for full-time
        
        switch(employeeType) {
            case 0:
                System.out.println("Employee is part-time");
                workHours = 8;
                break;
            case 1:
                System.out.println("Employee is full-time");
                workHours = 8;
                break;
        }


        dailyWage = workHours * wagePerHour;

        System.out.println("Daily wage of the employee is: " + dailyWage);
    }
}
