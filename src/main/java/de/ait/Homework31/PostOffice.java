package de.ait.Homework31;

/*
Создайте класс PostOffice:
Поле:
List<MailItem> mailItems (список почтовых отправлений).
Методы:
void addMailItem(MailItem item) — добавляет отправление в список.
void calculateTotalShippingCost() — выводит общую стоимость доставки для всех отправлений в списке.
void printAllDetails() — выводит информацию обо всех отправлениях, используя метод printDetails().
 */

import java.util.ArrayList;
import java.util.List;


public class PostOffice {

    private List<MailItem> mailItems;

    public PostOffice() {
        mailItems = new ArrayList<>();
    }

    void addMailItem(MailItem item) {
        if (item == null) {
            System.out.println("null");
        } else {
            mailItems.add(item);
        }
    }

    void calculateTotalShippingCost() {
        if (mailItems.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            double totalShippingCost = 0;
            for (MailItem mailItem : mailItems) {
                totalShippingCost += mailItem.calculateShippingCost();
            }
            System.out.println("Общая стоимость доставки: " + totalShippingCost + " евро");
        }
    }

    public void printAllDetails() {
        System.out.println("------------------------------");
        if (mailItems.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (MailItem mailItem : mailItems) {
                mailItem.printDetails();
            }
        }
    }
}