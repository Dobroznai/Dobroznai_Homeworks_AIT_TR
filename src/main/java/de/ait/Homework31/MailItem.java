package de.ait.Homework31;

/*
Создайте абстрактный класс MailItem (почтовое отправление):
Поля:
String sender (отправитель)
String recipient (получатель)
double weight (вес отправления в кг)
Методы:
abstract double calculateShippingCost(); — абстрактный метод для расчета стоимости доставки.
void printDetails() — обычный метод, который выводит информацию об отправлении, включая отправителя, получателя и вес.
 */

public abstract class MailItem {

    private String sender;
    private String recipient;
    private double weight;

    public MailItem(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double calculateShippingCost();

    public void printDetails() {
        System.out.println("Отправитель: " + sender + "");
        System.out.println("Получатель: " + recipient + "");
        System.out.println("Вес: " + weight + "kg");
    }
}
