package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.upcasting;

/**
 * @author muhammed-topgul created at 24/11/2021 11:39
 */

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(0, "Melissa", 4, "Human Resource");
        employee.printInfo();

        Manager manager = new Manager(1, "Muhammed", 2, "Software", "Java Teams");
        Employee employee1 = manager;

        System.out.println(employee1.calculateSalary());
        employee1.printInfo();

        // directly
        Employee employee2 = new Manager(2, "Jack", 4, "Software", "Java Teams");
        employee2.printInfo();

        Manager manager1 = new Director(3, "John", 6, "Accounting", "Finance");
        manager1.printInfo();

        Employee employee3 = new Director(4, "Linda", 1, "Accounting", "Finance");
        employee3.printInfo();


        // payment
        PayrollOffice payrollOffice = new PayrollOffice();
        payrollOffice.paySalary(employee);
        payrollOffice.paySalary(employee1);
        payrollOffice.paySalary(employee2);
        payrollOffice.paySalary(employee3);
        payrollOffice.paySalary(manager);
        payrollOffice.paySalary(manager1);

        // HR
        HumanResources humanResources = new HumanResources();
        Employee employeeFromHR = humanResources.getAnEmployee();
        employeeFromHR.work();
    }

    private static class PayrollOffice {

        public void paySalary(Employee employee) {
            if (employee == null) {
                throw new NullPointerException("Employee must not be null.");
            }
            if (employee instanceof Director) {
                System.out.println("Paying for a director...");
            } else if (employee instanceof Manager) {
                System.out.println("Paying for a manager...");
            } else {
                System.out.println("Paying for an employee...");
            }
            double salary = employee.calculateSalary();
            System.out.println("Paying a salary of " + salary + " to " + employee.getName() + " \n");
        }
    }
}
