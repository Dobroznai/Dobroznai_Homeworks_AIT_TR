package de.ait.homework06;

import java.util.Scanner;

public class Homework06 {

    // Упражнение 1: Доступ к премиум-залам

    //Условие: Пользователь может получить доступ к премиум-залам кинотеатра, если:

    //Он приобрел премиум-билет И
    //У него есть членство в программе лояльности ИЛИ он оплатил дополнительный сбор.
    //Требования:

    //Запросите, есть ли у пользователя премиум-билет (true/false).
    //Если премиум-билет есть, спросите, есть ли у пользователя членство в программе лояльности (true/false).
    //Если членство отсутствует, спросите, оплатил ли он дополнительный сбор (true/false).
    //Выведите сообщение о доступе к премиум-залам.

    //Пример работы программы:

    //У вас есть премиум-билет? (true/false): true
    //У вас есть членство в программе лояльности? (true/false): false
    //Вы оплатили дополнительный сбор? (true/false): true
    //Доступ к премиум-залам разрешен.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Есть ли у вас премиум билет (true/false): ");
        boolean hasVIPTicket= scanner.nextBoolean();

        System.out.println("Есть ли у вас членство в программе лояльности (true/false): c");
        boolean hasMembershipTicket = scanner.nextBoolean();

        System.out.println("Вы оплатили дополнительный сбор? true/false): ");
        boolean hasAdditionalFee = scanner.nextBoolean();

        String premiumAllowed = "Доступ к премиум-залам разрешен.";
        String premiumDenied = "Доступ к премиум-залам отклонен.";

        if ((hasVIPTicket && hasMembershipTicket) || hasAdditionalFee) {
            System.out.println(premiumAllowed);
        } else {
            System.out.println(premiumDenied);
            scanner.close();
        }
    }
}
