package de.ait.Homework27;

public class EmployeeDepartmentManager {
    public static void main(String[] args) {

        Employee Ivan = Employee.builder()
                .id("1")
                .name("Ivan")
                .position("Manager")
                .salary(2500)
                .build();
        Employee Bogdan = Employee.builder()
                .id("2")
                .name("Bogdan")
                .position("Director")
                .salary(6500)
                .build();

        Department departmentIT = Department.builder()
                .name("Risk Management Center")
                .build();
        departmentIT.addEmployee(Ivan);
        departmentIT.addEmployee(Bogdan);

        Business business = Business.builder()
                .name("Traders")
                .build();
        business.addDepartment(departmentIT);

        System.out.println(business.getTotalCompanySalary());
        System.out.println(business.getAllPositions());

        System.out.println("-----------------------------");
        System.out.println(business);
    }
}
