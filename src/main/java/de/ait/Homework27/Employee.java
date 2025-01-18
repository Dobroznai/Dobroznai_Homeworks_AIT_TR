package de.ait.Homework27;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/*
Цель проекта

Разработать приложение для управления сотрудниками, отделами и проектами в компании. Приложение должно реализовывать принципы инкапсуляции, использовать коллекции ArrayList, HashSet, и HashMap, а также включать Unit-тесты для проверки функциональности.

Функциональные требования

1. Класс Employee (Сотрудник)
 1.	Поля:
      •	String id — уникальный идентификатор сотрудника.
      •	String name — имя сотрудника.
      •	String position — должность.
      •	double salary — зарплата.
2.	Методы:
      •	Конструктор для инициализации всех полей.
      •	Геттеры и сеттеры для всех полей.
      •	String getInfo() — возвращает строку с информацией о сотруднике.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @NonNull
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String position;
    private double salary;

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setPosition(@NonNull String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}
