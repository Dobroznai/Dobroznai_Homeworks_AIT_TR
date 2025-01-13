package de.ait.homework08;

import java.util.Scanner;

public class CocktailAutomate {

    static Scanner scanner = new Scanner(System.in);  // Объект Scanner для считывания ввода пользователя / Scanner object for reading user input
    static int age;  // Переменная для хранения возраста пользователя / Variable for storing the user's age

    final static int ALCOHOL_AGE_LIMIT = 18;  // Минимальный возраст для покупки алкоголя / Minimum age for purchasing alcohol
    final static int MAX_CAPACITY = 500;  // Максимальная вместимость коктейля в мл / Maximum cocktail volume in ml

    static double orangeJuicePriceTenMl = 1.5;  // Цена за 10 мл апельсинового сока / Price for 10 ml of orange juice
    static double rumPriceTenMl = 5;  // Цена за 10 мл рома / Price for 10 ml of rum
    static double honeyPriceTenMl = 0.5;  // Цена за 10 мл меда / Price for 10 ml of honey
    static double lemonJuicePriceTenMl = 2;  // Цена за 10 мл лимонного сока / Price for 10 ml of lemon juice

    static double finalPrice;  // Итоговая стоимость коктейля / Final price of the cocktail
    static int finalValue;  // Итоговый объем коктейля / Final volume of the cocktail

    static int rumValue;  // Количество рома / Amount of rum
    static int honeyValue;  // Количество меда / Amount of honey
    static int orangeJuiceValue;  // Количество апельсинового сока / Amount of orange juice
    static int lemonJuiceValue;  // Количество лимонного сока / Amount of lemon juice

    static String rumValueString = "Введите количество рома: ";  // Сообщение для запроса объема рома / Prompt for rum amount
    static String orangeJuiceValueString = "Введите количество апельсинового сока: ";  // Сообщение для запроса объема апельсинового сока / Prompt for orange juice amount

    public static void main(String[] args) {

        boolean canAddAlcohol = false;  // Флаг для проверки возможности добавления алкоголя / Flag to check if alcohol can be added

        System.out.println("Введите ваш возраст: ");  // Ввод возраста / Enter your age
        age = scanner.nextInt();  // Считывание возраста / Reading age
        scanner.nextLine();  // Очистка буфера / Clear buffer

        if (age >= ALCOHOL_AGE_LIMIT) {  // Проверка на возрастное ограничение / Check for age limit
            System.out.println("Вы можете добавить алкоголь.");  // Сообщение о возможности добавить алкоголь / Message that alcohol can be added
            canAddAlcohol = true;  // Установка флага, что алкоголь разрешен / Set flag that alcohol is allowed
        }

        System.out.println("Выберите тип коктейля:");  // Ввод типа коктейля / Choose the type of cocktail
        if (canAddAlcohol) {  // Если алкоголь разрешен / If alcohol is allowed
            System.out.println("""
                    1. Классический коктейль / Classic Cocktail
                    2. Безалкогольный коктейль / Non-Alcoholic Cocktail
                    3. Экзотический коктейль / Exotic Cocktail""");
        } else {  // Если алкоголь запрещен / If alcohol is not allowed
            System.out.println("""
                    2. Безалкогольный коктейль / Non-Alcoholic Cocktail
                    3. Экзотический коктейль / Exotic Cocktail""");
        }

        int choice = scanner.nextInt();  // Считывание выбора / Reading the choice
        scanner.nextLine();  // Очистка буфера / Clear buffer

        switch (choice) {  // Обработка выбора коктейля / Handle cocktail choice
            case 1:
                System.out.println("Вы выбрали классический коктейль / You chose a classic cocktail");
                makeClassicAlcoholicCocktail();  // Приготовление классического алкогольного коктейля / Make a classic alcoholic cocktail
                break;
            case 2:
                System.out.println("Вы выбрали безалкогольный коктейль / You chose a non-alcoholic cocktail");
                makeNonAlcoholicCocktail();  // Приготовление безалкогольного коктейля / Make a non-alcoholic cocktail
                break;
            case 3:
                System.out.println("Вы выбрали экзотический коктейль / You chose an exotic cocktail");
                makeExoticCocktail();  // Приготовление экзотического коктейля / Make an exotic cocktail
                break;
            default:
                System.out.println("Ошибка! Неверный выбор / Error! Invalid choice");
        }

        scanner.close();  // Закрытие сканера / Close scanner
    }

    // Метод для приготовления классического алкогольного коктейля / Method to make a classic alcoholic cocktail
    public static void makeClassicAlcoholicCocktail() {
        if (age < ALCOHOL_AGE_LIMIT) {  // Проверка возраста / Check age
            System.out.println("Вы не можете выбрать данный коктейль / You cannot choose this type of cocktail!");
        } else {
            System.out.println(rumValueString);  // Запрос количества рома / Request rum amount
            rumValue = scanner.nextInt();  // Считывание количества рома / Reading rum amount
            scanner.nextLine();  // Очистка буфера / Clear buffer
            System.out.println(orangeJuiceValueString);  // Запрос количества апельсинового сока / Request orange juice amount
            orangeJuiceValue = scanner.nextInt();  // Считывание количества сока / Reading orange juice amount
            scanner.nextLine();  // Очистка буфера / Clear buffer

            // Рассчет стоимости и объема коктейля / Calculate cocktail price and volume
            finalPrice = rumValue * rumPriceTenMl + orangeJuiceValue * orangeJuicePriceTenMl;
            finalValue = rumValue + orangeJuiceValue;

            if (finalValue > MAX_CAPACITY) {  // Проверка на превышение объема / Check if volume exceeds limit
                System.out.println("Максимальная вместимость коктейля 500 мл. Ваш объем " + finalValue + " мл. / Maximum cocktail capacity is 500 ml. Your volume is " + finalValue + " ml.");
            } else {
                finalInfoPriceValue();  // Вывод итоговой информации / Display final price and volume
            }
        }
    }

    // Метод для приготовления безалкогольного коктейля / Method to make a non-alcoholic cocktail
    public static void makeNonAlcoholicCocktail() {
        System.out.println("Введите количество меда / Enter amount of honey");
        honeyValue = scanner.nextInt();  // Считывание количества меда / Reading honey amount
        scanner.nextLine();  // Очистка буфера / Clear buffer
        System.out.println(orangeJuiceValueString);  // Запрос количества апельсинового сока / Request orange juice amount
        orangeJuiceValue = scanner.nextInt();  // Считывание количества апельсинового сока / Reading orange juice amount
        scanner.nextLine();  // Очистка буфера / Clear buffer

        // Рассчет стоимости и объема коктейля / Calculate cocktail price and volume
        finalPrice = honeyPriceTenMl * honeyValue + orangeJuiceValue * orangeJuicePriceTenMl;
        finalValue = honeyValue + orangeJuiceValue;

        if (finalValue > MAX_CAPACITY) {  // Проверка на превышение объема / Check if volume exceeds limit
            System.out.println("Максимальная вместимость коктейля 500 мл. Ваш объем " + finalValue + " мл. / Maximum cocktail capacity is 500 ml. Your volume is " + finalValue + " ml.");
        } else {
            finalInfoPriceValue();  // Вывод итоговой информации / Display final price and volume
        }
    }

    // Метод для приготовления экзотического коктейля / Method to make an exotic cocktail
    public static void makeExoticCocktail() {
        System.out.println("Введите количество меда / Enter amount of honey");
        honeyValue = scanner.nextInt();  // Считывание количества меда / Reading honey amount
        scanner.nextLine();  // Очистка буфера / Clear buffer
        System.out.println(orangeJuiceValueString);  // Запрос количества апельсинового сока / Request orange juice amount
        orangeJuiceValue = scanner.nextInt();  // Считывание количества апельсинового сока / Reading orange juice amount
        scanner.nextLine();  // Очистка буфера / Clear buffer
        System.out.println("Введите количество лимонного сока / Enter amount of lemon juice");
        lemonJuiceValue = scanner.nextInt();  // Считывание количества лимонного сока / Reading lemon juice amount
        scanner.nextLine();  // Очистка буфера / Clear buffer

        // Расчет стоимости и объема коктейля / Calculate cocktail price and volume
        finalPrice = honeyPriceTenMl * honeyValue + orangeJuiceValue * orangeJuicePriceTenMl + lemonJuiceValue * lemonJuicePriceTenMl;
        finalValue = honeyValue + orangeJuiceValue + lemonJuiceValue;

        if (finalValue > MAX_CAPACITY) {  // Проверка на превышение объема / Check if volume exceeds limit
            System.out.println("Максимальная вместимость коктейля 500 мл. Ваш объем " + finalValue + " мл. / Maximum cocktail capacity is 500 ml. Your volume is " + finalValue + " ml.");
        } else {
            finalInfoPriceValue();  // Вывод итоговой информации / Display final price and volume
        }
    }

    // Метод для вывода итоговой информации / Method to display the final information
    public static void finalInfoPriceValue() {
        System.out.println("Итоговая стоимость коктейля: " + finalPrice + " евро / Final price of the cocktail: " + finalPrice + " euros");
        System.out.println("Общий объем коктейля: " + finalValue + " мл / Total volume of the cocktail: " + finalValue + " ml");
    }
}