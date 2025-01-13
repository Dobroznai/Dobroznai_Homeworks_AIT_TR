package de.ait.homework06;

import java.util.Scanner;

public class HW0603 {


    // Упражнение 2: Выбор места по предпочтениям

    //Условие: Пользователь может выбрать место с определенными предпочтениями, если:

    //Он предпочитает место в проходе И кинотеатр не заполнен.
    //ИЛИ
    //Он предпочитает место ближе к экрану И есть свободные места в этом секторе.

    //Требования:
    //Запросите, предпочитает ли пользователь место в проходе (true/false).
    //Запросите, заполнен ли кинотеатр (true/false).
    //Если пользователь не предпочитает место в проходе, спросите, предпочитает ли он место ближе к экрану (true/false).
    //Если предпочитает ближе к экрану, спросите, есть ли свободные места в этом секторе (true/false).
    //Выведите сообщение о возможности выбора места по предпочтениям.

    //Пример работы программы:
    //Вы предпочитаете место в проходе? (true/false): true
    //Кинотеатр заполнен? (true/false): false
    //Вы можете выбрать место в проходе.
    public static void main(String[] args) {
        // Создаем сканер для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Запросим у пользователя его предпочтения
        System.out.print("Вы предпочитаете место в проходе? (true/false): ");
        boolean aislePreference = scanner.nextBoolean();

        System.out.print("Кинотеатр заполнен? (true/false): ");
        boolean isTheaterFull = scanner.nextBoolean();

        // Проверяем, предпочитает ли пользователь место ближе к экрану, если не хочет сидеть в проходе
        if (!aislePreference) {
            System.out.print("Вы предпочитаете место ближе к экрану? (true/false): ");
            boolean frontPreference = scanner.nextBoolean();

            if (frontPreference) {
                System.out.print("Есть ли свободные места в этом секторе? (true/false): ");
                boolean isFrontAvailable = scanner.nextBoolean();

                // Логика проверки по всем условиям
                if (isFrontAvailable) {
                    System.out.println("Вы можете выбрать место ближе к экрану.");
                } else {
                    System.out.println("Свободных мест ближе к экрану нет.");
                }
            } else {
                System.out.println("Вы не указали конкретных предпочтений для выбора места.");
            }
        } else {
            // Проверка, можно ли выбрать место в проходе
            if (!isTheaterFull) {
                System.out.println("Вы можете выбрать место в проходе.");
            } else {
                System.out.println("Кинотеатр заполнен, мест в проходе нет.");
            }
        }

        // Закрываем сканер
        scanner.close();
    }
}