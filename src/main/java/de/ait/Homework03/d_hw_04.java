package de.ait.Homework03;

public class d_hw_04 {
    //1.	Объявите переменную типа double с именем celsius и присвойте ей значение температуры в градусах Цельсия.
    //2.	Преобразуйте эту температуру в градусы Фаренгейта по формуле: fahrenheit = celsius * 9/5 + 32.
    //3.	Выведите результат на экран.

        static double celsius = 38.5;

    public static void main(String[] args) {
        System.out.println("Градусы Фаренгейта: " + celsius * 9/5 + 32);
    }
}
