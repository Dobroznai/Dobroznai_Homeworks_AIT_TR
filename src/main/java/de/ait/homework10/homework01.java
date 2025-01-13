package de.ait.homework10;

import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {
    /*
    Упражнение 1: Определение категории животного по названию
    Задание:

    Напишите программу, которая запрашивает у пользователя название животного и в зависимости от начальной буквы
    этого названия определяет его категорию: домашнее (если название начинается с буквы «К», например, «Кот»),
    дикое (если название начинается с буквы «Т», например, «Тигр») или неизвестное (для всех остальных).
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal: ");
        String animal = scanner.nextLine().toLowerCase().trim(); // Устанавливаем нижний регистр и обрезаем пробелы

        char ch = animal.charAt(0); // Получаем символ
        String str = String.valueOf(ch); // Преобразуем символ в строку

        String result = switch (str) {
            case "k" -> "This animal is wild";
            case "t" -> "This is a pet";
            default -> "This is an unknown animal";
        };
        System.out.println(result);
        scanner.close();
    }
}
