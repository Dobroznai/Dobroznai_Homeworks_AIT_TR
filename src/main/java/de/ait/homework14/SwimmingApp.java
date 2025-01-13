package de.ait.homework14;

/*
Упражнение 5 (*) :Подсчет личных рекордов в плавании: Описание: Напишите программу, которая запрашивает у пользователя количество плавательных соревнований и время для каждого заплыва. Программа должна вывести самое быстрое время (личный рекорд) и сколько раз оно было побито или повторено.

Пример ввода:

Введите количество соревнований: 5
Введите время заплыва 1: 50.5
Введите время заплыва 2: 51.0
Введите время заплыва 3: 50.2
Введите время заплыва 4: 50.5
Введите время заплыва 5: 50.2
Пример вывода:
Личный рекорд: 50.2 секунд
Личный рекорд был побит или повторен 2 раза
 */

import java.util.Scanner;

public class SwimmingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во соревнований: ");
        int number = scanner.nextInt();
        while (number<=0) {
            System.out.println("Неверное значение, введите другое");
                System.out.print("Введите количество соревнований");
                number= scanner.nextInt();
        }
        double[] lapTime = new double[number];
        double bestResult = Double.MAX_VALUE;
        int recordBrokenCount = 0;
        for (int i=0;i<number;i++) {
            System.out.print("Введите время заплыва " + (i+1));
            lapTime[i] = scanner.nextDouble();
            if (lapTime[i]<bestResult) {
                bestResult = lapTime[i];
            }
        }
        System.out.println("Личный рекорд: " + bestResult + " секунд");
        for (int i=0; i<lapTime.length;i++) {
            if(lapTime[i] == bestResult) {
                recordBrokenCount++;
            }
        }
        System.out.println("Личный рекорд был побит или повторен " + recordBrokenCount + " раза");
        scanner.close();
    }
}
