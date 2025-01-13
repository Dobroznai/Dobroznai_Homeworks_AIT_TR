package de.ait.homework10;

import java.util.Scanner;

public class homework02 {

    /*
    Упражнение 2: Определение самой длинной подстроки из названий животных

    Задание:
    Запрашивайте у пользователя несколько названий животных и определяйте самое длинное название среди введенных строк.
     */

    static String maxLength = "";
    static String animal;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter animal: ");
            animal = scanner.nextLine();

            if (animal.length() > maxLength.length()) {
                maxLength = animal;
            }
            System.out.println("Самое длинное название: " + maxLength);
        } while (true);
    }
}
