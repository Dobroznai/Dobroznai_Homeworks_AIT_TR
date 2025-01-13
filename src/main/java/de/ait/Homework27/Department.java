package de.ait.Homework27;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/*
2. Класс Department (Отдел)
1.	Поля:
      •	String name — название отдела.
      •	ArrayList<Employee> — список сотрудников отдела.
2.	Методы:
      •	Конструктор для инициализации названия отдела.
      •	void addEmployee(Employee employee) — добавляет сотрудника в отдел.
      •	void removeEmployee(String employeeId) — удаляет сотрудника по его ID.
      •	Employee findEmployee(String employeeId) — находит сотрудника по ID.
      •	double getTotalSalary() — возвращает общую зарплату всех сотрудников отдела.
      •	ArrayList<Employee> getEmployees() — возвращает список сотрудников отдела.

 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Builder
public class Department {
    @NonNull
    private String name;
    @Builder.Default //Эта аннотация позволяет указать значение по умолчанию для полей, чтобы они не оставались null при использовании билдера.
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(@NonNull String name) {
        this.name = name;
        this.employees = new ArrayList<>(); //Поле employees всегда инициализируется пустым списком, даже если конструктор или билдер не задают значение.
    }

    // Метод addEmployee добавляет сотрудника в отдел сперва проверив его на null
    public void addEmployee(Employee employee) {
        if (employee == null) {
            log.error("Employee is null");
        }
        if (employee.getId() == null || employee.getName() == null || employee.getName().isEmpty()
                || employee.getPosition() == null || employee.getSalary() <= 0) {
            log.error("Employee is invalid: {}", employee);
        }
        employees.add(employee);
        log.info("Employee with ID {} was added", employee.getId());
    }

    // удаляет сотрудника по его ID.
    public void removeEmployee(String employeeId) {
        boolean removed = false;
        if (employeeId == null || employeeId.isEmpty()) {
            log.error("Employee ID is null or empty");
        } else {
            for (Employee employee : employees) {
                if (employee.getId().equals(employeeId)) {
                    employees.remove(employee);
                    log.info("Employee with ID {} was removed", employeeId);
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                log.warn("Employee with ID {} not found", employeeId);
            }
        }
    }

    //находит сотрудника по ID.
    public Employee findEmployee(String employeeId) {
        if (employeeId == null || employeeId.isEmpty()) {
            log.error("Employee ID is null or empty");
        }
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                return employee;
            }
        }
        log.warn("Employee with ID {} not found", employeeId);
        return null;
    }

    //возвращает общую зарплату всех сотрудников отдела.
    public double getTotalSalary() {
        double totalSalary = 0;
        if (employees.isEmpty()) {
            log.warn("No employees found");
            System.out.println("No employees found");
            return totalSalary;
        }

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    //возвращает список сотрудников отдела.
    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}