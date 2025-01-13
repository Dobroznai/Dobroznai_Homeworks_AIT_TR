package de.ait.homework11;

import java.util.Scanner;

public class Homework02 {
    /*
    Упражнение 2: Маскирование номера карты

    Задание:

    Напишите программу, которая запрашивает у пользователя номер банковской карты и
    выводит его в отформатированном виде, заменяя все цифры, кроме последних четырех,
    на звездочки (например: “**** **** **** 1234”).

    Подсказки:

    •	Используйте цикл или повторение символа ‘*’ для маскирования цифр.
    Copy
    Пример:

    Введите номер банковской карты: 1234567891011121

    Вывод:
    **** **** **** 1121

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberCard;
        String maskNumberCard = "";
        while (true) {
            System.out.println("Номер банковской карты: ");
            numberCard = scanner.nextLine().trim();

            if (numberCard.length() == 16) {
                break;
            } else {
                System.out.println("Номер банковской карты должен содержать 16 цифр: ");
            }
        }

        for (int i = 0; i < 12; i++) {
            maskNumberCard = maskNumberCard.concat("*");
            if ((i + 1) % 4 == 0 && i < 11) {
                maskNumberCard = maskNumberCard.concat(" ");
            }
        }
        maskNumberCard = maskNumberCard.concat(" ").concat(numberCard.substring(12, 16));

        System.out.println("Вывод : " + maskNumberCard);

        scanner.close();
    }
}
