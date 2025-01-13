package de.ait.Homework15;
/*Задание: Программа для управления базой данных больницы

Создайте консольное приложение, которое позволяет управлять базой данных пациентов и услуг в больнице.
В программе должны быть реализованы следующие функции:

        1.	Добавление пациента: Предусмотрите возможность добавления нового пациента с именем и фамилией в список пациентов.
        2.	Удаление пациента: Удалите пациента по имени и фамилии.
        3.	Поиск пациента: Найдите пациента в списке по имени и фамилии.
        4.	Обновление данных пациента: Позволяет изменить имя или фамилию пациента.
        5.	Сортировка пациентов: Отсортируйте список пациентов по алфавиту.
        6.	Вывод списка пациентов: Выведите полный список пациентов.
        7.	Очистка списка пациентов: Удалите все записи пациентов из списка.
        8.	Выход: Завершение работы программы.
        */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class AppGospitalDatabase {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> patients = new ArrayList<>();


    public static void main(String args[]) {

        boolean running = true;

        while (running) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // чтобы очистить буфер после nextInt()

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> removePatient();
                case 3 -> searchPatient();
                case 4 -> updatePatient();
                case 5 -> sortPatients();
                case 6 -> showPatients();
                case 7 -> clearPatients();
                case 8 -> {
                    System.out.println("Програма завершена");
                    sc.close();
                    running = false;
                }
                default -> System.err.println("Неверный ввод, попробуйте снова");
            }
        }
    }

    //1.	Добавление пациента: Предусмотрите возможность добавления нового пациента с именем и фамилией в список пациентов.
    public static void addPatient() {
        System.out.println("Введите имя пациента: ");
        String name = sc.nextLine().trim();
        System.out.println("Введите фамилию пациента: ");
        String surname = sc.nextLine().trim();

        patients.add(name + " " + surname);
        System.out.println("Пациент " + name + " " + surname + " добавлен в базу данных");
    }

    //2.	Удаление пациента: Удалите пациента по имени и фамилии.
    public static void removePatient() {

        System.out.println("Введите имя пациента для удаления: ");
        String name = sc.nextLine().trim();
        System.out.println("Введите фамилию пациента для удаления: ");
        String surname = sc.nextLine().trim();

        String fullName = name + " " + surname;

        if (patients.contains(fullName)) {
            Iterator<String> itr = patients.iterator();
            while (itr.hasNext()) {
                String patient = itr.next();
                if (patient.equals(fullName)) {
                    itr.remove();
                }

            }
            System.out.println("Пациент удален.");
        } else {
            System.out.println("Пациент " + fullName + " не найден");
        }
    }

    //3.	Поиск пациента: Найдите пациента в списке по имени и фамилии.
    public static void searchPatient() {
        System.out.println("Введите имя пациента для поиска: ");
        String name = sc.nextLine().trim();
        System.out.println("Введите фамилию пациента для поиска: ");
        String surname = sc.nextLine().trim();
        String fullName = name + " " + surname;

        if (patients.contains(fullName)) {
            System.out.println("Пациент найден: " + fullName);
        } else {
            System.out.println("Пациент не найден");
        }
    }

    //4.	Обновление данных пациента: Позволяет изменить имя или фамилию пациента.
    public static void updatePatient() {

        System.out.println("Введите текущее имя пациента: ");
        String currentName = sc.nextLine().trim();
        System.out.println("Введите текущую фамилию пациента: ");
        String currentSurname = sc.nextLine().trim();
        String fullName = currentName + " " + currentSurname;

        if (patients.contains(fullName)) {
            System.out.println("Введите новое имя пациента: ");
            String newName = sc.nextLine().trim();
            System.out.println("Введите новую фамилию пациента: ");
            String newSurname = sc.nextLine().trim();
            int index = patients.indexOf(fullName);
            patients.set(index, newName + " " + newSurname);
            System.out.println("Данные пациента обновлены.");
        } else {
            System.out.println("Пациент не найден.");
        }
    }

    //5.	Сортировка пациентов: Отсортируйте список пациентов по алфавиту.
    public static void sortPatients() {

        Collections.sort(patients);
        System.out.println("Список пациентов отсортирован.");
    }

    //6.	Вывод списка пациентов: Выведите полный список пациентов.
    public static void showPatients() {

        System.out.println("Список пациентов:");
        if (patients.isEmpty()) {
            System.out.println("Список пуст.");
        } else {
            for (int i=0; i<patients.size(); i++) {
                System.out.println((i+1) + ". " + patients.get(i));
            }
        }
    }

    //7.	Очистка списка пациентов: Удалите все записи пациентов из списка.
    public static void clearPatients() {
        patients.clear();
        System.out.println("Список пациентов очищен.");
    }


    public static void showMenu() {
        System.out.println("\n' --- \uD83C\uDFE5 Меню управления базой данных больницы \uD83C\uDFE5 ---");
        System.out.println("1. Добавить пациента");
        System.out.println("2. Удалить пациента");
        System.out.println("3. Найти пациента");
        System.out.println("4. Обновить данные пациента");
        System.out.println("5. Отсортировать список пациентов");
        System.out.println("6. Показать список пациентов");
        System.out.println("7. Очистить список пациентов");
        System.out.println("8. Выйти" + "\n");
        System.out.print("Выберите действие: ");

    }
}
