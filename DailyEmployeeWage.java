package EmployeeWage;

public class DailyEmployeeWage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHours = 8;
        int workHours = 0;
        int dailyWage = 0;


        workHours = fullDayHours;


        dailyWage = workHours * wagePerHour;

        System.out.println("Daily wage of the employee is: " + dailyWage);
    }
}