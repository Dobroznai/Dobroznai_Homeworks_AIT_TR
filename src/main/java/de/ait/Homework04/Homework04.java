package de.ait.Homework04;

public class Homework04 {
    // Task 1. Проверка возраста для поездки за границу.
    static int age = 17;
    static int minAge = 18;

    // Task 2. Проверка бюджета на поездку.
    static int budget = 9000;
    static int minBudget = 10000;

    // Task 3. Скидка на авиабилеты.
    static double costTicket = 435;
    static int minCostTicket = 500;
    static int discountOne = 10;
    static int discountTwo = 5;

    // Task 4. Проверка количества багажа.
    static int baggage = 1;
    static int maxBaggage = 2;

    // Task 5. Визовая проверка.
    static String country = "USA";

    static String countryOne = "Germany";
    static String countryTwo = "Spain";
    static String countryThree = "Italia";
    static String countryFour = "USA";
    static String countryFive = "United Kingdom";
    static String countrySix = "China";

    // Task 6. Проверка времени въезда в страну.
    static int time = 19;
    static int fromTime = 8;
    static int toTime = 18;

    // Task 7. Проверка сезона для путешествия.
    static String month = "July";


    public static void main(String[] args) {

        System.out.println("***Task 1. Проверка возраста для поездки за границу.***");
        // Проверка возраста для поездки за границу: Напишите программу, которая проверяет,
        // может ли человек путешествовать за границу. Минимальный возраст для поездки — 18 лет.
        // Если возраст меньше, программа должна выводить сообщение, что поездка невозможна.
        if (age >= minAge) {
            System.out.println("Congrutation! Trip Available. " + age + " years is your age.");
        } else {
            System.out.println("Sorry! Trip Not Possible. Age must be not less than " + minAge + " Years. Now you are " + age + " years old.");
        }

        System.out.println("***Task 2. Проверка бюджета на поездку.***");
        // Проверка бюджета на поездку: Допустим, у вас есть определённый бюджет на поездку.
        // Напишите программу, которая сравнит бюджет с минимальной стоимостью поездки.
        // Если бюджет превышает или равен стоимости, программа должна выводить сообщение: "Вы можете поехать", иначе —
        // "Недостаточно средств".
        if (budget >= minBudget) {
            System.out.println("Congrutation! You can go. " + budget + "$ you have.");
        } else {
            System.out.println("Sorry! You don't have enough funds. " + (minBudget - budget) + "$ you need it for a full budget");
        }

        System.out.println("***Task 3. Скидка на авиабилеты.***");
        // Скидка на авиабилеты: Если стоимость билета выше 500 евро, то доступна скидка 10%.
        // Если стоимость билета ниже 500 евро, доступна скидка 5%. \
        // Напишите программу, которая рассчитает конечную стоимость билета с учётом скидки.
        if (costTicket > minCostTicket) {
            double resultOne = costTicket - costTicket * discountOne / 100;
            System.out.println("Ticket price " + costTicket + " euro. You have a " + discountOne + "% discount. New price is " + resultOne + " euro.");
        } else {
            double resultTwo = costTicket - costTicket * discountTwo / 100;
            System.out.println("Ticket price " + costTicket + " euro. You have a " + discountTwo + "% discount. New price is " + resultTwo + " euro.");
        }

        System.out.println("***Task 4. Проверка количества багажа.***");
        // Проверка количества багажа: В самолёте можно взять не более 2 чемоданов.
        // Напишите программу, которая проверяет, сколько чемоданов у путешественника, и выводит сообщение,
        // может ли он сесть на рейс или ему нужно уменьшить количество багажа.
        if (baggage > maxBaggage) {
            int resultOne = baggage - maxBaggage;
            System.out.println("Sorry, you have a lot baggage: " + baggage + "! Max quantity " + maxBaggage + " suitcases. Please, reduce the number of suitcases to " + resultOne + ".");
        } else {
            System.out.println("Congratulation! You can board the flight. " + baggage + " suitcase (s) you have.");
        }

        System.out.println("***Task 5. Визовая проверка.***");
        // Визовая проверка: Для поездки в определённые страны требуется виза. Напишите программу, которая проверяет,
        // нужно ли получать визу для конкретной страны.
        // Например, если страна — "Германия", виза не нужна, а для "США" — виза обязательна.
        if (country.equals(countryOne)) {
            System.out.println("You don't need a visa to travel to " + country + ".");
        } else if (country.equals(countryTwo)) {
            System.out.println("You don't need a visa to travel to " + country + ".");
        } else if (country.equals(countryThree)) {
            System.out.println("You don't need a visa to travel to " + country + ".");
        } else if (country.equals(countryFour)) {
            System.out.println("Do you need a visa to travel to " + country + ".");
        } else if (country.equals(countryFive)) {
            System.out.println("You don't need a visa to travel to " + country + ".");
        } else if (country.equals(countrySix)) {
            System.out.println("Do you need a visa to travel to " + country + ".");
        } else {
            System.out.println("There is no visa information available for this country.");
        }

        System.out.println("***Task 6. Проверка времени въезда в страну.***");
        // Проверка времени въезда в страну: Напишите программу, которая проверяет текущее время и определяет, можно ли въехать в страну.
        // Например, въезд разрешён только с 8:00 до 18:00.
        // Если время не соответствует данному интервалу, программа выводит сообщение о невозможности въезда.
        if (time >= fromTime) {
            if (time <= toTime) {
                System.out.println("At the specified time " + time + ":" + "00 you can enter the country.");
            } else {
                System.out.println("You cannot enter at the specified time: " + time + ":" + "00");
            }
        } else {
            System.out.println("You cannot enter at the specified time: " + time + ":" + "00");
        }

        System.out.println("***Task 7. Проверка сезона для путешествия.***");
        // Проверка сезона для путешествия: Напишите программу, которая сравнивает текущий месяц
        // и выводит сообщение о лучшем времени для путешествия в конкретную страну.
        // Например, если месяц — "июнь", программа должна предложить поездку в Европу,
        // если "декабрь" — предложить поездку в тропические страны.
        if (month.equals("January")) {
            System.out.println("Travel to tropical countries is recommended for " + month + ".");
        } else if (month.equals("February")) {
            System.out.println("Travel to tropical countries is recommended for " + month + ".");
        } else if (month.equals("December")) {
            System.out.println("Travel to tropical countries is recommended for " + month + ".");
        } else if (month.equals("June")) {
            System.out.println("Recommended trip to Europe for " + month + ".");
        } else if (month.equals("July")) {
            System.out.println("Recommended trip to Europe for " + month + ".");
        } else if (month.equals("August")) {
            System.out.println("Recommended trip to Europe for " + month + ".");
        } else {
            System.out.println("It is better to work during this period.");
        }
    }
}