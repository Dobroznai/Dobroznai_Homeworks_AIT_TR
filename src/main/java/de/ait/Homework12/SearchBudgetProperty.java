package de.ait.Homework12;

/*
Упражнение 4:Поиск квартиры в бюджете: У вас есть массив цен квартир, а также бюджет пользователя.
Напишите программу, которая выводит все квартиры, цена которых меньше или равна бюджету пользователя.

Пример:

int[] prices = {100000, 150000, 200000, 250000, 300000};
int budget = 200000;
 */

public class SearchBudgetProperty {

    public static void main(String[] args) {
        int[] prices = {100000, 150000, 200000, 250000, 300000};
        int budget = 1000;
        boolean propertyFound = false;

        for (int price : prices) {
            if (price <= budget) {
                System.out.println("Property was found: " + price + ". Budget: " + budget);
                propertyFound = true;
            }
        }
        if (!propertyFound) {
            System.out.println("No property was found");
        }
    }
}
