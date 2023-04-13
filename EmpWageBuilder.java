package EmployeeWage;

import java.util.Random;

public class EmpWageBuilder {
    private final String companyName;
    private final int maxWorkingDays;
    private final int maxWorkingHours;
    private final int wagePerHour;
    private int totalWage;

    public EmpWageBuilder(String companyName, int maxWorkingDays, int maxWorkingHours, int wagePerHour) {
        this.companyName = companyName;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.wagePerHour = wagePerHour;
        this.totalWage = 0;
    }

    public void computeEmployeeWage() {
        int workHours = 0;
        int dailyWage = 0;
        int workingDays = 0;
        int totalWorkingHours = 0;
        Random random = new Random();
        int employeeType = random.nextInt(2); 

        while (workingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {
            switch(employeeType) {
                case 0:
                    workHours = 8;
                    break;
                case 1:
                    workHours = 8;
                    break;
            }

            dailyWage = workHours * wagePerHour;
            totalWage += dailyWage;
            workingDays++;
            totalWorkingHours += workHours;
        }

        System.out.println("Total wage for " + companyName + " is: " + totalWage);
    }

    public static void main(String[] args) {
        EmpWageBuilder companyA = new EmpWageBuilder("Company A", 20, 100, 22);
        EmpWageBuilder companyB = new EmpWageBuilder("Company B", 22, 120, 26);

        companyA.computeEmployeeWage();
        companyB.computeEmployeeWage();
    }
}