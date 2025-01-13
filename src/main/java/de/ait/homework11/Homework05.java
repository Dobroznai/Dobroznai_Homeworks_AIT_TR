package de.ait.homework11;

import java.util.Scanner;

public class Homework05 {

    /*
    Упражнение 5: Перевод между счетами

    Задание:

    Напишите программу, которая симулирует перевод денег между двумя счетами.
    Программа должна запрашивать баланс обоих счетов и сумму перевода.
    После перевода программа должна выводить обновленные балансы обоих счетов.

            Подсказки:

            •	Вводите начальные балансы для обоих счетов.
            •	Проверьте, что переводимая сумма не превышает баланс счета-отправителя.
          
    Пример:

    Введите баланс счета 1: 1000
    Введите баланс счета 2: 2000
    Введите сумму перевода: 500

    Баланс счета 1 после перевода: 500
    Баланс счета 2 после перевода: 2500
     */
    static int firstBalance;
    static int secondBalance;
    static int amount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the balance of the first account: ");
        firstBalance = scanner.nextInt();
        System.out.println("Enter the balance of the second account: ");
        secondBalance = scanner.nextInt();

        do {
            System.out.println("Enter the transfer amount: ");
            amount = scanner.nextInt();

            if (isEnoughFunds(amount)) {
                firstBalance -= amount;
                secondBalance += amount;

                System.out.println("Balance of the first account is: " + firstBalance);
                System.out.println("Balance of the second account is: " + secondBalance);
            } else {
                System.out.println("Not enough funds");
                System.out.println("Balance of the first account is: " + firstBalance);
                System.out.println("Balance of the second account is: " + secondBalance);
            }
            System.out.println("Do you want to continue(Press 'Enter')?");
            scanner.nextLine();
            String exit = scanner.nextLine();
            if (!exit.isEmpty()) {
                break;
            }
        } while (true);
        scanner.close();
    }

    private static boolean isEnoughFunds(int amount) {
        return (firstBalance - amount) >= 0;
    }
}
