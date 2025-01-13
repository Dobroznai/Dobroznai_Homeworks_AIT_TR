package de.ait.homework13;

/*
Упражнение 4:Оценки спектаклей зрителями: Описание: Напишите программу, которая запрашивает количество зрителей и оценки,
которые они поставили спектаклю (по шкале от 1 до 10). Программа должна вывести количество каждой оценки и определить,
сколько человек оценили спектакль на 9 или 10 баллов. Пример:

Пример ввода:

Введите количество зрителей: 5
Введите оценку зрителя 1: 8
Введите оценку зрителя 2: 9
Введите оценку зрителя 3: 7
Введите оценку зрителя 4: 10
Введите оценку зрителя 5: 6

Пример вывода:
Оценки:
1 баллов: 0
2 баллов: 0
3 баллов: 0
4 баллов: 0
5 баллов: 0
6 баллов: 1
7 баллов: 1
8 баллов: 1
9 баллов: 1
10 баллов: 1
Число зрителей, оценивших спектакль на 9 или 10 баллов: 2
 */


import java.util.Scanner;

public class EvaluationPerformances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of spectators: ");
        int spectatorsAmount = scanner.nextInt();

        int[] scores = new int[11];
        int sumScores = 0;

        for (int i = 0; i < spectatorsAmount; i++) {
            System.out.println("Enter the score of the production " + (i + 1) + " (1-10): ");
            int score = scanner.nextInt();

            if (score >= 1 && score <= 10) {
                scores[score]++;
                if (score == 9 || score == 10) {
                    sumScores++;
                }
            } else {
                System.out.println("Not corrected score, please enter correct value 1-10.");
                i--;
            }
        }
        scanner.close();
        System.out.println("Scores:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " scores: " + scores[i]);
        }
        System.out.println("The number of audience members who rated the play a 9 or 10: " + sumScores);
    }
}
