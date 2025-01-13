package de.ait.homework13;

/*
Упражнение 2: Подсчет продаж билетов на театральные постановки: Напишите программу, которая запрашивает
количество театральных постановок за месяц и количество проданных билетов для каждой постановки.
Программа должна вывести общее количество проданных билетов и среднее количество билетов, проданных за каждую постановку.

Пример ввода:
Введите количество театральных постановок за месяц: 4
Введите количество проданных билетов на постановку 1: 120
Введите количество проданных билетов на постановку 2: 150
Введите количество проданных билетов на постановку 3: 130
Введите количество проданных билетов на постановку 4: 140

Пример вывода:
Общее количество проданных билетов: 540
Среднее количество проданных билетов: 135.0
*/

import java.util.Scanner;

public class SaleTicketTheater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the theater productions per month: ");
        int theaterProductionAmount = scanner.nextInt();
        int totalSaleTicket = 0;

        int[] saleTicket = new int[theaterProductionAmount];

        for (int i = 0; i < theaterProductionAmount; i++) {
            System.out.println("Enter the number of selling ticket in theater production " + (i + 1) + ":");
            saleTicket[i] = scanner.nextInt();
            totalSaleTicket += saleTicket[i];
        }
        System.out.println("Total selling ticket: " + totalSaleTicket);
        System.out.println("Average selling ticket: " + totalSaleTicket / saleTicket.length);
        scanner.close();
    }
}