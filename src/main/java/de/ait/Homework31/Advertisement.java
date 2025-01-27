package de.ait.Homework31;

/*
Класс Advertisement (рекламная листовка):
Поле:
int quantity (количество копий).
Реализация метода calculateShippingCost:
Фиксированная стоимость: 1 евро за каждые 50 листовок.

 */

public class Advertisement extends MailItem {

    private int quantity;

    private double pricePer50Item = 1.0;

    public Advertisement(String sender, String recipient, double weight, int quantity) {
        super(sender, recipient, weight);
        this.quantity = quantity;
    }


    @Override
    public double calculateShippingCost() {
        return Math.ceil(quantity / 50) * pricePer50Item;
    }

    @Override
    public void printDetails() {
        System.out.println("Рекламная листовка:");
        super.printDetails();
        System.out.println("Количество копий: " + quantity);
        double cost = calculateShippingCost();
        System.out.println("Стоимость доставки: " + cost + " евро");
    }
}
