package de.ait.homework09;

import java.util.Scanner;

public class newslineProgram {
    /*
    Задание 5: Лента новостей

    Напишите программу, которая имитирует чтение новостей в социальной сети.
    Пользователь вводит количество постов, которые он хочет увидеть.
    Программа выводит “Пост №X”, где X — номер поста, который прочитан.

    Подсказка: Используйте цикл for.
     */

    static int quantityPost;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity post: ");
        quantityPost = scanner.nextInt();

        while (quantityPost <= 0) {
            System.err.println("Error");
            System.out.print("Enter quantity post: ");
            quantityPost = scanner.nextInt();
        }

        for (int i = 1; i <= quantityPost; i++) {
            System.out.print("Post N: " + i + "\n");
        }
        System.out.print("All post ware read.");
        scanner.close();
    }
}
