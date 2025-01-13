package de.ait.homework11;

import java.util.Scanner;

public class Homework01 {
    /*
    Упражнение 1: Форматирование номера банковской карты

    Задание:

    Напишите программу, которая запрашивает у пользователя номер банковской карты (16 цифр) и
    выводит его в отформатированном виде с разделением на группы по 4 цифры, например: “1234 5678 9101 1121”.

    Подсказки:

    •	Проверьте, что введенная строка содержит ровно 16 символов.
    •	Используйте метод substring() для разбивки номера на части.
    Copy
    Пример:

    Введите номер банковской карты: 1234567891011121

    Вывод:
    1234 5678 9101 1121
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер банковской карты (16 цифр): ");
        String cardNumber = scanner.nextLine();

        if (cardNumber.length() == 16) {

            String formattedCardNumber = cardNumber.substring(0, 4) + " " +
                    cardNumber.substring(4, 8) + " " +
                    cardNumber.substring(8, 12) + " " +
                    cardNumber.substring(12, 16);

            System.out.println("Отформатированный номер карты: " + formattedCardNumber);
        } else {
            System.out.println("Номер карты должен содержать ровно 16 цифр.");
        }
        scanner.close();
    }
}
