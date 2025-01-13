package de.ait.Homework12;

/*Упражнение 1: Расчет средней стоимости аренды: Создайте массив, в который занесите месячную арендную
плату за несколько объектов недвижимости (например, 5 квартир).
Напишите программу, которая вычислит среднюю арендную плату и выведет её на экран. Пример:

int[] rents = {500, 750, 900, 650, 800};
 */

public class CalculatingAverageRental {


    public static void main(String[] args) {

        int[] rents = {500, 750, 900, 650, 800};
        int totalRent = 0;
        int lengthRent = rents.length;

        for (int rent : rents) {
            totalRent += rent;
        }
        double averageRent = (double) totalRent / lengthRent;
        System.out.println("Средняя арендная плата составляет " + averageRent);
    }
}




