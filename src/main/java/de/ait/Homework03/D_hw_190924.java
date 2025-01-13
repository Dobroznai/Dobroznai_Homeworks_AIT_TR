package de.ait.Homework03;

public class D_hw_190924 {

    // 1.	Объявите три переменные типа double с именами num1, num2 и num3, присвойте им произвольные значения.
    // 2.	Вычислите среднее арифметическое этих чисел.
    // 3.	Выведите результат на экран.

    static double num1 = 0.01;
    static double num2 = 0.29;
    static double num3 = 1.47;

    static double result = (num1 + num2 + num3);
    static double meanArithmetic = (result / 3);

    public static void main(String[] args) {
        System.out.println("Среднее арифметическо число: " + meanArithmetic);
    }
}
