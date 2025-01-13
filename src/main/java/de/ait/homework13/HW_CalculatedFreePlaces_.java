package de.ait.homework13;

/*
Упражнение 1: Подсчет свободных мест на спектакли: Напишите программу, которая запрашивает количество спектаклей и
количество мест в зале для каждого спектакля, а затем количество проданных билетов на каждый спектакль.
Программа должна вывести количество свободных мест на каждом спектакле и общее количество свободных мест.

Пример ввода:
Введите количество спектаклей: 3
Введите количество мест в зале для спектакля 1: 200
Введите количество проданных билетов на спектакль 1: 150
Введите количество мест в зале для спектакля 2: 180
Введите количество проданных билетов на спектакль 2: 130
Введите количество мест в зале для спектакля 3: 220
Введите количество проданных билетов на спектакль 3: 210

Пример вывода:
Свободных мест на спектакле 1: 50
Свободных мест на спектакле 2: 50
Свободных мест на спектакле 3: 10
Общее количество свободных мест: 110
 */

import java.util.Scanner;

public class HW_CalculatedFreePlaces_ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Спрашиваем количество спектаклей (переменная performanceAmount), что позволяет нам знать,
        сколько раз нужно будет повторить процесс ввода данных для каждого спектакля. */

        System.out.println("Enter the number of performance: ");
        int performanceAmount = scanner.nextInt();
        while (performanceAmount < 0) {
            System.err.println("The number of performance not correct. Please entry correct information");
            System.out.println("Enter the number of performance: ");
            performanceAmount = scanner.nextInt();
        }
        while (performanceAmount == 0) {
            System.err.println("The number of performance: 0");
            break;
        }

        // Создаем 2 массива:
        int[] placeAmount = new int[performanceAmount]; // для хранения количества мест в зале на каждый спектакль
        int[] ticketSold = new int[performanceAmount]; //для хранения количества проданных билетов на каждый спектакль

        // используем цикл for, для каждого спектакля:
        for (int i = 0; i < performanceAmount; i++) {
            System.out.println("Enter the number of places in the hall for performance " + (i + 1) + ":");
            placeAmount[i] = scanner.nextInt(); // Запрашиваем и записываем в массив placeAmount количество мест в зале

            System.out.println("Enter the number of tickets sold for performance " + (i + 1) + ":");
            ticketSold[i] = scanner.nextInt(); // Запрашиваем и записываем в массив ticketSold количество проданных билетов
        }


        /* Создаем новый массив, через который будем выводить общее кол-во свободных мест.
        Вызываем метод calculateArray + передаем 2 массива */
        int[] freePlaces = calculatedArray(placeAmount, ticketSold);
        int totalFreePlaces = 0; // создаем переменную для хранения кол-ва общих свободных мест.

        for (int i = 0; i < freePlaces.length; i++) {
                System.out.println("Free places for performance " + (i + 1) + ": " + freePlaces[i]);
                totalFreePlaces += freePlaces[i];
            }
        if (totalFreePlaces == 0) {
            System.out.println();
        } else if (totalFreePlaces < 0) {
            System.err.println("Incorrect");
        } else {
            System.out.println("Total number of free places: " + totalFreePlaces);
            scanner.close();
        }

    /*
    Создаем метод calculateArray, который будет принимать два массива:
    int[] arrayOne: общее количество мест
    int[] arrayTwo: количество проданных билетов

    Возвращаем массив с количеством свободных мест для каждого спектакля.
    Этот метод можно будет вызывать в main, чтобы вычислить и вывести свободные места по каждому спектаклю.*/
    }

    public static int[] calculatedArray(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[arrayOne.length]; // создаем новый массив, который будет хранить кол-во свободных мест для каждого спектакля.
        for (int i = 0; i < arrayOne.length; i++) {
            result[i] = arrayOne[i] - arrayTwo[i];
        }
        return result;
    }
}