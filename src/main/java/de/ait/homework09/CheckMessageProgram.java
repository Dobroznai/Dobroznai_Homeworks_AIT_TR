package de.ait.homework09;

import java.util.Scanner;

public class CheckMessageProgram {

    /*
    Задание 7: Проверка на новые сообщения
    Напишите программу, которая запрашивает у пользователя количество новых сообщений в социальной сети.
    Программа должна выводить сообщения одно за другим до тех пор, пока не достигнет введенного количества.
    Подсказка: Используйте цикл do-while.
     */

    static int messageCount;
    static int counter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of message: ");
        messageCount = scanner.nextInt();

        do
        {
            System.out.println("New Message Number: " + (counter + 1));
            counter++;
        }
        while (counter < messageCount);
        scanner.close();
    }
}
