package de.ait.homework09;

import java.util.Scanner;

public class StoriesProgram {

    /*
    Задание 3: Подсчет просмотров сторис
    Напишите программу, которая запрашивает у пользователя количество просмотров сторис, которые нужно набрать.
    Программа должна имитировать просмотры, увеличивая их на 2 за итерацию, и выводить обновленное количество просмотров после каждой итерации.

    Подсказка: Используйте цикл do-while.
     */

    static int countStories;
    static int nominalStories = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of stories: ");
        countStories = scanner.nextInt();
        scanner.nextLine();

        do {
            if(countStories <= 0) {
                System.out.println("No stories received");
                break;
            }
             nominalStories = nominalStories + 2;
            System.out.println("Story was viewed " + nominalStories);
        }
        while (nominalStories < countStories);
    }
}
