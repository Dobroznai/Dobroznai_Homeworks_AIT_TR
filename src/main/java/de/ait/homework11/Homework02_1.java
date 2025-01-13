package de.ait.homework11;

import java.util.Scanner;

public class Homework02_1 {


    /*
    Напишите программу, которая запрашивает у пользователя
     номер банковской карты и выводит его в отформатированном виде,
     заменяя все цифры, кроме последних четырех,
      на звездочки (например: "**** **** **** 1234").
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
                    System.err.println("Номер банковской карты должен содержать 16 цифр: ");
                    System.out.println("Введите еще раз номер банковской карты: ");
                }
            }
            maskNumberCard = numberCard;
            for (int i = 0; i < 12; i++) {
                //maskNumberCard = maskNumberCard.concat("*"); 1 вариант

                char number = numberCard.charAt(i);

                maskNumberCard = maskNumberCard.replace(String.valueOf(number), "*");

                if ((i + 1) % 4 == 0 && i < 11) {
                    maskNumberCard = maskNumberCard.concat(" ");
                }
            }
            // maskNumberCard = maskNumberCard.concat(" ").
            // concat(numberCard.substring(12, 16)); 1 вариант

            System.out.println("Вывод : " + maskNumberCard);

            scanner.close();

        }
    }