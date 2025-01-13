package de.ait.homework06;

import java.util.Scanner;

public class Homework0602 {


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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы предпочитаете место в проходе? (true/false): ");
        boolean seatAisle = scanner.nextBoolean();

        System.out.println("Кинотеатр заполнен? (true/false): ");
        boolean isFullCinema = scanner.nextBoolean();

        if (seatAisle && !isFullCinema) {
            System.out.println("Вы можете выбрать место в проходе.");
        } else if (isFullCinema) {
            System.out.println("К сожалению кинотеатр заполнен");
        } else if (!seatAisle) {
            System.out.println("Предпочитаете место ближе к экрану? (true/false): ");
            boolean seatNearScreen = scanner.nextBoolean();

            if (seatNearScreen) {
                System.out.println("Есть ли свободные места в этом секторе? (true/false): ");
                boolean isFullSeatScreen = scanner.nextBoolean();
                if (isFullSeatScreen) {
                    System.out.println("Вы можете выбрать место у экрана по предпочтению");
                } else {
                    System.out.println("К сожалению в этом секторе мест нет");
                }
            } else {
                System.out.println("К сожалению мы ничего не можем вам предложить");
            }

        }
        scanner.close();
    }
}