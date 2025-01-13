package de.ait.Homework03;

public class d_hm_190924_03 {
    // 1. Объявите переменную типа int с именем totalSeconds и присвойте ей значение, например, 10,000.
    // 2. Вычислите, сколько часов, минут и секунд содержится в этом количестве секунд.
    // 3. Выведите результат в формате “Часы: X, Минуты: Y, Секунды: Z”.

    static int totalSeconds = 3600;

    // Вопрос - если ставлю в секундах значение с непарным числом вконце, к примеру "9999" -
    // данная методика с конкретной неточностью выодит на экран результ в секундах. Как решить?

    public static void main(String[] args) {
        System.out.println("Часов: " + totalSeconds / 3600);
        System.out.println("Минут: " + totalSeconds / 60);
        System.out.println("Секунд: " + totalSeconds);
    }
}
