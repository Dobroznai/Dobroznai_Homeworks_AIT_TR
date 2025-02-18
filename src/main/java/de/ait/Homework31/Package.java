package de.ait.Homework31;

/*
Класс Package (посылка):
Поля:
double length, double width, double height (размеры посылки в см).
Реализация метода calculateShippingCost:
Стоимость доставки зависит от веса: 2 евро за каждый кг.
 */

public class Package extends MailItem {

    private double length, width, height;
    private double costKilogramm = 2;

    public Package(String sender, String recipient, double weight, double length, double width, double height) {
        super(sender, recipient, weight);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateShippingCost() {

        double weightPackage = getWeight();

        if (getWeight() <= 0) {
            return 0;
        } else if (0 < getWeight() && getWeight() < 1) {
            return costKilogramm;
        } else if ((getWeight() - weightPackage) != 0) {
            return (weightPackage * costKilogramm) + costKilogramm;
        } else {
            return weightPackage * costKilogramm;
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Посылка");
        super.printDetails();
        System.out.println("Размеры: " + width + "x" + height + "x" + length);
        double cost = calculateShippingCost();
        System.out.println("Стоимость доставки: " + cost + " евро");
        System.out.println("---------------------------");
    }
}
