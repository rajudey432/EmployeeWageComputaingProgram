package EmployeeWage;

import java.util.Random;

public class EmployeeAttendance {
    public static void main(String[] args) {
        Random random = new Random();
        int isPresent = random.nextInt(2);
        if (isPresent == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}