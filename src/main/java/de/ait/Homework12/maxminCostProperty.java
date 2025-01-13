package de.ait.Homework12;

/*
Упражнение 2: Максимальная и минимальная цена недвижимости:
В массиве хранится цена нескольких квартир. Напишите программу, которая находит и
выводит максимальную и минимальную стоимость. Пример:

int[] prices = {100000, 150000, 200000, 120000, 170000};
 */

public class maxminCostProperty {

    public static void main(String[] args) {
        int[] prices = {1000000, 150000, 200000, 120000, 170000};

        int maxPrices = prices[0];
        int minPrices = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];

            if (price < minPrices) {
                minPrices = price;
            }
            if (price > maxPrices) {
                maxPrices = price;
            }
        }

        System.out.println("Maxprice: " + maxPrices);
        System.out.println("Minprice: " + minPrices);
    }
}

