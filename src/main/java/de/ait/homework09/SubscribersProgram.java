package de.ait.homework09;

import java.util.Scanner;

public class SubscribersProgram {
    /*
    Задание 4: Подсчет новых подписчиков

    Напишите программу, которая запрашивает у пользователя текущее количество подписчиков и цель — сколько
    подписчиков он хочет набрать. Программа должна выводить обновленное количество подписчиков после каждого
    добавления одного нового подписчика, пока не достигнет цели.
     */

    static int subscribers;
    static int goalSubscribers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of your goal Subscribers: ");
        goalSubscribers = scanner.nextInt();

        System.out.println("Enter number of Subscribers: ");
        subscribers = scanner.nextInt();

        for (int i = subscribers; i < goalSubscribers; i++) {
            System.out.println("Subscriber #" + (i + 1));
        }
        System.out.println("You have " + goalSubscribers + " subscribers");
    }
}
