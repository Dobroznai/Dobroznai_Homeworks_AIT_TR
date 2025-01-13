package de.ait.Homework20;

/*
Тестирование Метода Определения Четности Числа

Задание: • Создайте класс NumberUtils с методом boolean isEven(int number), который возвращает true, если число чётное.
• Напишите тесты для проверки метода isEven с разными числами (чётными и нечётными).
Цель: • Практика написания тестов с булевыми результатами.
• Использование assertTrue и assertFalse.
 */

public class NumberUtils {

    boolean isEven(int number) {
        return number % 2 == 0;
    }

}
