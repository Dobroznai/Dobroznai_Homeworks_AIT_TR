package de.ait.Homework20;

/*
Упражнение 2: Тестирование Класса Счётчик

Задание: • Реализуйте класс Counter с методами increment(), decrement() и int getValue().
• Напишите тесты, которые проверяют корректность увеличения и уменьшения значения счётчика.
Цель: • Практика тестирования изменения состояния объекта.
• Использование методов @BeforeEach для настройки перед каждым тестом.
 */


public class Counter {

    public int counterValue = 0;

    public void increment() {
        counterValue++;
    }

    public void decrement() {
        counterValue--;
    }

    public int getValue() {
        return counterValue;
    }
}
