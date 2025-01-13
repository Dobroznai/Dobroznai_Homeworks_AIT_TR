package de.ait.Homework22;

/*
Задание: Напишите параметризованный тест, который проверяет расчёт времени доставки (в днях) в зависимости от расстояния.
Метод public int calculateDeliveryTime(double distance) возвращает:
• Менее 50 км — 1 день.
• От 50 до 500 км — 3 дня.
• Более 500 км — 7 дней.
 */
public class ShippingTime {

    public int calculateDeliveryTime(double distance) {
        if (distance < 50.0) {
            return 1;
        }
        else if (distance <= 500) {
            return 3;
        } else{
            return 7;
        }
    }
}
