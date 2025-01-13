package de.ait.Homework27;
/*
Класс Business (Компания)

Поля:
• String name — название компании.
• HashMap<String, Department> — карта отделов, где ключ — название отдела, значение — объект Department.

Методы:
• Конструктор для инициализации названия компании.
• void addDepartment(Department department) — добавляет новый отдел.
• void removeDepartment(String departmentName) — удаляет отдел по его названию.
• Department getDepartment(String departmentName) — возвращает отдел по названию.
• HashSet getAllPositions() — возвращает уникальные должности всех сотрудников компании.
• double getTotalCompanySalary() — возвращает общую зарплату всех сотрудников компании.
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Builder
public class Business {

    @NonNull
    private String name;
    @Builder.Default
    private HashMap<String, Department> departments = new HashMap<>();

    public Business(String name) {
        this.name = name;
        this.departments = new HashMap<>();
    }

    //добавляет новый отдел.
    public void addDepartment(Department department) {
        if (department == null) {
            log.error("Department is null");
        }
        if (departments.containsKey(department.getName())) {
            log.warn("Department {} already exists", department.getName());
        }
        departments.put(department.getName(), department);
        log.info("Department {} added successfully", department.getName());
    }

    //удаляет отдел по его названию.
    public void removeDepartment(String departmentName) {
        if (departmentName == null || departmentName.isEmpty()) {
            log.error("Department name is null or empty");
        }
        if (departments.remove(departmentName) != null) {
            log.info("Department {} removed successfully", departmentName);
        } else {
            log.warn("Department {} not found", departmentName);
        }
    }

    //возвращает отдел по названию.

    public Department getDepartment(String departmentName) {
        if (departmentName == null || departmentName.isEmpty()) {
            log.error("Department name is null or empty");
        }
        Department department = departments.get(departmentName);
        if (department == null) {
            log.warn("Department {} not found", departmentName);
        }
        return department;
    }

    public HashMap<String, Department> getDepartments() {
        return new HashMap<>(departments);
    }

    //возвращает уникальные должности всех сотрудников компании.
    public HashSet<String> getAllPositions() {
        HashSet<String> positions = new HashSet<>();
        for (Department department : departments.values()) {
            for (Employee employee : department.getEmployees()) {
                positions.add(employee.getPosition());
            }
        }
        return positions;
    }

    //возвращает общую зарплату всех сотрудников компании.
    public double getTotalCompanySalary() {
        double totalSalaryBusiness = 0;
        if (departments.isEmpty()) {
            log.warn("No departments found");
            System.out.println("No departments found");
            return totalSalaryBusiness;
        }
        for (Department department : departments.values()) {
            totalSalaryBusiness += department.getTotalSalary();
        }
        return totalSalaryBusiness;
    }
}

