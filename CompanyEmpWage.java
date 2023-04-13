package EmployeeWage;

import java.util.Random;

public class CompanyEmpWage {
    public final String companyName;
    public final int maxWorkingDays;
    public final int maxWorkingHours;
    public final int wagePerHour;
    public int totalWage;

    public CompanyEmpWage(String companyName, int maxWorkingDays, int maxWorkingHours, int wagePerHour) {
        this.companyName = companyName;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.wagePerHour = wagePerHour;
        this.totalWage = 0;
    }
}

public class EmpWageBuilder {
    private final int numOfCompanies;
    private final CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilder() {
        this.numOfCompanies = 0;
        this.companyEmpWageArray = new CompanyEmpWage[numOfCompanies];
    }

    public void addCompanyEmpWage(String companyName, int maxWorkingDays, int maxWorkingHours, int wagePerHour) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, maxWorkingDays, maxWorkingHours, wagePerHour);
        companyEmpWageArray[numOfCompanies] = companyEmpWage;
        numOfCompanies++;
    }

    public void computeEmployeeWage() {
        for (int i = 0; i < numOfCompanies; i++) {
            int workHours = 0;
            int dailyWage = 0;
            int workingDays = 0;
            int totalWorkingHours = 0;
            Random random = new Random();
            int employeeType = random.nextInt(2); // 0 for part-time, 1 for full-time

            while (workingDays < companyEmpWageArray[i].maxWorkingDays && totalWorkingHours < companyEmpWageArray[i].maxWorkingHours) {
                switch (employeeType) {
                    case 0:
                        workHours = 8;
                        break;
                    case 1:
                        workHours = 8;
                        break;
                }

                dailyWage = workHours * companyEmpWageArray[i].wagePerHour;
                companyEmpWageArray[i].totalWage += dailyWage;
                workingDays++;
                totalWorkingHours += workHours;
            }

            System.out.println("Total wage for " + companyEmpWageArray[i].companyName + " is: " + companyEmpWageArray[i].totalWage);
        }
    }

    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("Company A", 20, 100, 22);
        empWageBuilder.addCompanyEmpWage("Company B", 22, 120, 26);
        empWageBuilder.computeEmployeeWage();
    }
}