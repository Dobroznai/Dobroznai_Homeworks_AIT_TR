package de.ait.homework09;

import java.util.Scanner;

public class CommentProgram {
    /*
    Задание 2: Подсчет комментариев

    Напишите программу, которая запрашивает у пользователя количество комментариев,
    которые нужно оставить под постом. Затем программа должна выводить номер каждого комментария,
    который пользователь якобы оставил. Программа завершается, когда достигнуто нужное количество комментариев.

    Подсказка: Используйте цикл for.
     */

    static int commentCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comment count: ");
        commentCount = scanner.nextInt();

        for (int i = 1; i <= commentCount; i++) {
            System.out.println("Comment number " + i + ": comment");
        }
        scanner.close();
    }
}
