package de.ait.Homework18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapHomework {



    static Scanner sc = new Scanner(System.in);

    static boolean running = true;
    static boolean isTask1 = true;
    static boolean isTask2 = true;
    static boolean isTask3 = true;
    static boolean isTask4 = true;
    static boolean isTask5 = true;


    static HashMap<String, Integer> task1 = new HashMap<>();
    static HashMap<String, Integer> task2 = new HashMap<>();
    static HashMap<String, Boolean> task3 = new HashMap<>();
    static HashMap<String, Integer> task4 = new HashMap<>();
    static HashMap<String, Integer> task5 = new HashMap<>();


    public static void main(String[] args) {
        System.out.println("App Name: Task Manager");
        System.out.println("Author: Ivan Dobroznai");
        System.out.println("Version: 1.0.0");
        System.out.println("Date: 2024-11-17");

        choice();
    }

    public static void showMenu() {
        System.out.println("\nСписок упражнений по HashMap\n");
        System.out.println("    " + "Упражнение 1: Список напитков и их цены");
        System.out.println("    " + "Упражнение 2: Калорийность напитков");
        System.out.println("    " + "Упражнение 3: Проверка наличия напитка");
        System.out.println("    " + "Упражнение 4: Меню с ценами и обновление цен");
        System.out.println("    " + "Упражнение 5: Перебор и вывод напитков с фильтрацией");
        System.out.println("    " + "6. Выйти из домашнего задания" + "\n");

        System.out.print("Какое задание вы выбираете? ");
    }

    public static void choice() {

        while (running) {
            showMenu();
            int index;
            while (!sc.hasNextInt()) {
                showMenu();
                sc.next(); // очистка некорректного ввода
            }
            index = sc.nextInt();

            switch (index) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> {
                    System.out.println("Вы вышли из домашнего задания");
                    sc.close();
                    running = false;
                }
                default -> System.err.println("Неверный ввод. Пожалуйста, выберите действие из меню.");
            }
        }
    }


    private static void task1() {
    /*
    Упражнение 1: Список напитков и их цены
    1. Создайте HashMap, в котором ключами будут названия напитков (например, “Кофе”, “Чай”, “Сок”),
    а значениями — их цены (целые числа). Добавьте 5 напитков с разными ценами, затем:
    2. Выведите цену конкретного напитка по его названию.
    3. Проверьте, есть ли в списке напиток “Чай”.
    4. Удалите напиток “Сок” и выведите обновленный список.
    */


        while (isTask1) {
            showMenuTask1();
            String drink; //task1
            int cost; //task1
            int index;

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите числовое значение.");
                showMenuTask1();
                sc.next(); // очистка некорректного ввода
            }
            sc.nextLine();
            index = sc.nextInt();

            switch (index) {
                // 1. Внести новый напиток и его цену.
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Введите название напитка: ");
                    drink = sc.nextLine().trim();

                    System.out.print("Введите цену напитка: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите числовое значение для цены.");
                        sc.next(); // очистка некорректного ввода
                    }
                    cost = sc.nextInt();

                    task1.put(drink, cost);
                    System.out.println("Напиток добавлен. Текущий список: " + task1);
                }
                //2. Вывести цену напитка."
                case 2 -> {
                    sc.nextLine();
                    System.out.println("Введите название напитка: ");
                    drink = sc.nextLine();

                    if (!task1.isEmpty()) {
                        boolean resultContainsKey = task1.containsKey(drink);
                        if (resultContainsKey) {
                            int result = task1.get(drink);
                            System.out.println("Стоимость напитка: " + result);
                        } else {
                            System.out.println("К сожалению данного напитка нету в списке");
                        }
                    } else {
                        System.out.println("К сожалению список пуст");
                    }
                }
                // 3. Проверьте, есть ли в списке напиток “Чай”.
                case 3 -> {
                    sc.nextLine();
                    System.out.println("Введите название напитка: ");
                    drink = sc.nextLine();

                    if (!task1.isEmpty()) {
                        boolean resultContainsKey = task1.containsKey(drink);
                        if (resultContainsKey) {
                            System.out.println("Напиток: " + drink + " найден");
                        } else {
                            System.out.println("К сожалению данного напитка нету в списке");
                        }
                    } else {
                        System.out.println("К сожалению список пуст");
                    }
                }
                //4. Удалите напиток “Сок” и выведите обновленный список.
                case 4 -> {
                    sc.nextLine();
                    System.out.println("Введите название напитка: ");
                    drink = sc.nextLine();

                    if (!task1.isEmpty()) {
                        boolean resultContainsKey = task1.containsKey(drink);
                        if (resultContainsKey) {
                            task1.remove(drink);
                            System.out.println("Напиток: " + drink + " удален");
                        } else {
                            System.out.println("К сожалению данного напитка нету в списке");
                        }
                    } else {
                        System.out.println("К сожалению список пуст");
                    }
                }
                // выход
                case 5 -> running = false;
                default -> System.out.println("Неверный ввод. Пожалуйста, выберите действие из меню.");
            }
        }
    }

    private static void task2() {
    /*Упражнение 2: Калорийность напитков

    Создайте HashMap, где ключами будут названия напитков, а значениями — количество калорий в одной порции (целое число).
    1. Добавьте 3–4 напитка и задайте их калорийность.
    2. Напишите код, который перебирает все напитки и выводит только те, которые имеют калорийность более 50 калорий.
    3. Подсчитайте и выведите общее количество напитков в HashMap.
    */
        while (isTask2) {
            showMenuTask2();
            String drink;
            int calory;
            int index;

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите числовое значение.");
                showMenuTask2();
                sc.next(); // очистка некорректного ввода
            }
            index = sc.nextInt();

            switch (index) {
                // 1. Внести новый напиток и его кол-во калорий.
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Введите название напитка: ");
                    drink = sc.nextLine().trim();

                    System.out.print("Введите кол-во калорий: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите числовое значение для цены.");
                        sc.next(); // очистка некорректного ввода
                    }
                    calory = sc.nextInt();

                    task2.put(drink, calory);
                    System.out.println("Напиток добавлен. Текущий список: " + task2);
                }
                //2. Вывести список напитков с калорийностью менее 50 калорий
                case 2 -> {
                    sc.nextLine();
                    System.out.println("Cписок всех напитков: " + task2);
                    for (Map.Entry<String, Integer> entry : task2.entrySet()) {
                        if (entry.getValue() > 50) {
                            System.out.println("Напитки с калорийностью более 50 каллорий: ");
                            System.out.println(". Напиток: " + entry.getKey() + " / Калорийность: " + entry.getValue());
                        }
                    }
                }
                // 3. Общее кол-во напитков
                case 3 -> {
                    sc.nextLine();
                    System.out.println("Общее кол-во напитков: --> " + task2.size());
                }
                case 4 -> isTask2 = false;
                default -> System.out.println("Неверный ввод. Пожалуйста, выберите действие из меню.");
            }
        }
    }

    private static void task3() {
        /*
        Упражнение 3: Проверка наличия напитка
    Создайте HashMap, где ключами будут названия напитков, а значениями — их доступность (логический тип: true — доступен,
    false — недоступен).
    1. Заполните HashMap пятью напитками, укажите их доступность.
    2. Напишите код, который проверяет, доступен ли конкретный напиток (например, “Кофе”).
    3. Выведите список всех доступных напитков.
         */

        boolean inTask3 = true;
        int index;
        /* Создайте HashMap, где ключами будут названия напитков, а значениями — их доступность
        (логический тип: true — доступен, false — недоступен).
        1. Заполните HashMap пятью напитками, укажите их доступность. */
        task3.put("Кофе", true);
        task3.put("Чай", false);
        task3.put("Сок", true);

        while (inTask3) {
            showMenuTask3();

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите числовое значение.");
                sc.next(); // очистка некорректного ввода
            }
            index = sc.nextInt();
            sc.nextLine(); // очистка новой строки

            switch (index) {

                //Напишите код, который проверяет, доступен ли конкретный напиток (например, “Кофе”).
                case 1 -> {

                    System.out.print("Введите название напитка для проверки доступности: ");
                    String drink = sc.nextLine().trim();

                    if (task3.containsKey(drink)) {
                        boolean isAvailable = task3.get(drink);
                        if (isAvailable) {
                            System.out.println("Напиток '" + drink + "' доступен.");
                        } else {
                            System.out.println("Напиток '" + drink + "' недоступен.");
                        }
                    } else {
                        System.out.println("Напиток не найден в списке.");
                    }
                }

                // Выведите список всех доступных напитков.
                case 2 -> {
                    System.out.println("Список доступных напитков:");
                    for (Map.Entry<String, Boolean> entry : task3.entrySet()) {
                        if (entry.getValue()) {
                            System.out.println("Напиток: " + entry.getKey());
                        }
                    }
                }
                // 3. Вернуться в главное меню
                case 3 -> {
                    System.out.println("Список доступных напитков:");
                    for (Map.Entry<String, Boolean> entry : task3.entrySet()) {

                        System.out.println("Напиток: " + entry.getKey());
                    }
                }

                case 4 -> inTask3 = false;
                default -> System.out.println("Неверный ввод. Пожалуйста, выберите действие из меню.");
            }
        }
    }


    private static void task4() {

        /*
        Упражнение 4: Меню с ценами и обновление цен

        Создайте HashMap, где ключами будут названия напитков, а значениями — их цены.
        1. Заполните меню несколькими напитками и ценами.
        2. Обновите цену одного из напитков.
        3. Выведите цену каждого напитка, добавив условие, чтобы выводилась фраза “Цена обновлена”, если цена была изменена.

         */

        ArrayList<String> task4Drinks = new ArrayList<>(); // список для сохранения измененных напитков

        task4.put("Кофе", 25);
        task4.put("Чай", 10);
        task4.put("Сок", 37);
        task4.put("Вода", 4);
        task4.put("Вода с газом", 5);

        task4.put("Чай", 20); // изменяем цену
        task4Drinks.add("Чай"); // фиксируем в списке изменения

        task4.put("Вода с газом", 8);
        task4Drinks.add("Вода с газом");

        for (Map.Entry<String, Integer> entry : task4.entrySet()) {
            String nameDrink = entry.getKey();
            if (task4Drinks.contains(nameDrink)) {

                System.out.println(nameDrink + ": " + entry.getValue() + ". Цена обновлена");
            } else {
                System.out.println(nameDrink + ": " + entry.getValue());
            }
        }
    }


    private static void task5() {
        /*
    Создайте HashMap, где ключами будут названия напитков,
    а значениями — их объем в миллилитрах (например, 250 мл, 500 мл).
    Create a HashMap where the keys are drink names, and the values are their volumes in milliliters
    (e.g., 250 ml, 500 ml).

    1. Добавьте 4 напитка с разными объемами.
       Add 4 drinks with different volumes.
    2. Переберите и выведите только те напитки, объем которых более 300 мл.
       Iterate and print only the drinks with a volume greater than 300 ml.
    3. Напишите код, который проверяет, есть ли в HashMap напиток
       с объемом ровно 250 мл, и выведите результат проверки.

     */

        // Добавьте 4 напитка с разными объемами.
        task5.put("Кофе", 350);
        task5.put("Чай", 250);
        task5.put("Сок", 500);
        task5.put("Вода", 1000);

        // 2. Переберите и выведите только те напитки, объем которых более 300 мл.
        System.out.println("Напитки, объем которых более 300 мл:");
        for (Map.Entry<String, Integer> entry : task5.entrySet()) {
            if (entry.getValue() > 300) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + " мл)");
            }
        }

        //3. Напишите код, который проверяет, есть ли в HashMap напиток с объемом ровно 250 мл, и выведите результат проверки.
        boolean found = false;
        System.out.println("Напиток с объемом ровно 250 мл:");
        for (Map.Entry<String, Integer> entry : task5.entrySet()) {
            if (entry.getValue() == 250) {
                System.out.println(entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет напитка с объемом ровно 250 мл.");
        }
    }

    private static void showMenuTask1() {
        System.out.println("\nСделайте следующий выбор:");
        System.out.println("    1. Внести новый напиток и его цену.");
        System.out.println("    2. Вывести цену напитка.");
        System.out.println("    3. Проверить наличие напитка (например Чай).");
        System.out.println("    4. Удалить напиток (например Сок).");
        System.out.println("    5. Вернуться в главное меню.\n");
        System.out.print("Ваш выбор: ");
    }

    private static void showMenuTask2() {
        System.out.println("\nСделайте следующий выбор:");
        System.out.println("    1. Внести новый напиток и его кол-во калорий.");
        System.out.println("    2. Вывести список напитков с калорийностью менее 50 калорий");
        System.out.println("    3. Общее кол-во напитков");
        System.out.println("    4. Вернуться в главное меню.\n");
        System.out.print("Ваш выбор: ");
    }

    private static void showMenuTask3() {
        System.out.println("\nВыберите действие для проверки доступности напитков:");
        System.out.println("1. Проверить доступность конкретного напитка.");
        System.out.println("2. Вывести список всех доступных напитков.");
        System.out.println("3. Вывести список всех напитков.");
        System.out.println("3. Вернуться в главное меню.");
        System.out.print("Ваш выбор: ");
    }
}

