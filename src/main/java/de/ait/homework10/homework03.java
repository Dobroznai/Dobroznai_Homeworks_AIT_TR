package de.ait.homework10;

import java.util.Scanner;

public class homework03 {
    /*
    Упражнение 3: Игра “Угадай животное по описанию”

    Задание:

    Напишите программу, которая хранит описание животного (например, “это животное лает, охраняет дом”) и
    просит пользователя угадать животное по этому описанию. Программа должна продолжать запрашивать ответ,
    пока пользователь не угадает правильно.

    Подсказки:

    •	Используйте цикл while для продолжения ввода до правильного ответа.
    •	Примените метод equalsIgnoreCase() для сравнения строк.
    Copy
    Пример:

    Описание: Это животное лает и охраняет дом.
    Угадайте животное: кот
    Неверно! Попробуйте снова.
    Угадайте животное: собака
    Верно! Это собака.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Description: This animal barks and guards the house. ");
        String rightAnswer = "dog";//Dog, dOg, doG --> dog
        String userAnswer = scanner.nextLine().trim().toLowerCase();
        while (!userAnswer.equals(rightAnswer)) {
            System.out.println("Wrong answer. Try again.");
            System.out.println("Guess the animal:");
            userAnswer = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println("Correct! It's a dog.");

        scanner.close();

    }
}
