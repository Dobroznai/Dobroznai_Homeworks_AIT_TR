package de.ait.Homework22;
    /*
    Задание 1: Расчёт стоимости доставки по весу груза

    Задание: Создайте параметризованный тест, который проверяет правильность расчёта
    стоимости доставки в зависимости от веса груза. Стоимость рассчитывается так:
    • До 5 кг — 10 евро.
    • От 5 до 20 кг — 20 евро.
    • Более 20 кг — 50 евро.

    Напишите тест для метода public double calculateShippingCost(double weight).
     */

public class ShippingCostCalculator {
    public double calculateShippingCost(double weight) {
        if (weight <= 5) {
            return 10.0;
        } else if (weight <= 20) {
            return 20.0;
        } else {
            return 50.0;
        }
    }
}
