package de.ait.homework13;
/*
Упражнение 3:Рейтинги театральных постановок: Напишите программу, которая запрашивает у пользователя количество
театральных постановок и рейтинг каждой постановки (по шкале от 1 до 10). Программа должна вывести средний рейтинг
всех постановок и определить постановку с наивысшим рейтингом.

Пример ввода:

Введите количество постановок: 3
Введите рейтинг постановки 1: 8
Введите рейтинг постановки 2: 9
Введите рейтинг постановки 3: 7

Пример вывода:

Средний рейтинг всех постановок: 8.0
Наивысший рейтинг у постановки 2: 9
 */

import java.util.Scanner;

public class RankingTheaterProduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the theater productions: ");
        int theaterProductionAmount = scanner.nextInt();
        if (theaterProductionAmount == 0) {
            System.out.println("The number of the theater production 0");
        } else {
            int totalRatingProduction = 0;


            int[] ratingProduction = new int[theaterProductionAmount];

            for (int i = 0; i < theaterProductionAmount; i++) {
                System.out.println("Enter the rating of the production " + (i + 1) + ":");
                ratingProduction[i] = scanner.nextInt();
                totalRatingProduction += ratingProduction[i];
            }

            int maxRatingProduction = ratingProduction[0];
            int maxRatingIndex = 0;

            for (int i = 1; i < theaterProductionAmount; i++) {
                if (ratingProduction[i] > maxRatingProduction) {
                    maxRatingProduction = ratingProduction[i];
                    maxRatingIndex = i;
                }
            }

            double averageRating = (double) totalRatingProduction / ratingProduction.length;
            if (averageRating != 0) {
                System.out.println("Average rating all productions: " + ((double) Math.round(averageRating * 100) / 100));
            }
            System.out.println("The highest rating is for production --> " + (maxRatingIndex + 1) + ": " + maxRatingProduction);
        }
        scanner.close();
    }
}
