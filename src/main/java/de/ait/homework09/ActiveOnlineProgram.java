package de.ait.homework09;

import java.util.Scanner;

public class ActiveOnlineProgram {

    /*
    Задание 6: Отслеживание активности друзей
    Напишите программу, которая запрашивает у пользователя количество друзей, которые сейчас активны в сети.
    Программа выводит сообщение о каждом активном друге, пока не достигнет нужного количества.

    Подсказка: Используйте цикл while для реализации.
     */

    static int quantityOnline;
    static int i = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        quantityOnline = scanner.nextInt();
        scanner.nextLine();
        if (quantityOnline < 0) {
            System.out.println("Invalid quantity");
        } else {
            while (i <= quantityOnline) {
                System.out.print("Now is: " + i + " online" + "\n");
                i++;
            }
            scanner.close();
        }
    }
}
