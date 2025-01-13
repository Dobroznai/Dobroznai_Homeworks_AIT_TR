package de.ait.homework09;

import java.util.Scanner;

public class LikeProgramm {
    /*
    Задание 1: Подсчет лайков
    Напишите программу, которая запрашивает у пользователя количество лайков,
    которое он хочет получить на посте. Программа должна выводить каждую секунду,
    сколько лайков накопилось, пока количество лайков не достигнет или не превысит
    запрашиваемое пользователем количество. Используйте цикл while.

    Подсказка: Каждую секунду количество лайков увеличивается на 1.
     */

    static int likes; // кол-во лайков запращиваемое пользователем
    static int i = 1; // начальное число

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of likes: ");
        likes = scanner.nextInt();
        scanner.nextLine();

        while (i <= likes) {
            System.out.println("You liked " + i + " times");
            i++;
        }
        scanner.close();
    }
}
