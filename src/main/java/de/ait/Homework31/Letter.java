package de.ait.Homework31;

/*
Класс Letter (письмо):
Поле:
boolean isRegistered (регистрированное письмо или нет).
Реализация метода calculateShippingCost:
Стоимость письма зависит от того, зарегистрированное оно или нет:
Обычное письмо — 5 евро.
Зарегистрированное письмо — 10 евро.
 */

public class Letter extends MailItem {

    private boolean isRegistered;

    public Letter(String sender, String recipient, double weight, boolean isRegistered) {
        super(sender, recipient, weight);
        this.isRegistered = isRegistered;
    }


    @Override
    public double calculateShippingCost() {

        if (isRegistered) {
            return 10;
        } else {
            return 5;
        }
    }

    @Override
    public void printDetails(){
        System.out.println("Письмо");
        super.printDetails();
        System.out.println(isRegistered ? "Зарегистрированное: Да" : "Зарегистрированное: Нет");
        double shippingCost = calculateShippingCost();
        System.out.println("Стоимость доставки: " + shippingCost + " евро");
        System.out.println("---------------------------");
    }
}
