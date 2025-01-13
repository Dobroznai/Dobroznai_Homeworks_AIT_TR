package de.ait.Homework02;

public class Dobroznai_HW_150924_01 {
    // Переменная -- тип данных -- имя -- значение
    static String name = "Parcel Information";
    static int parcel = 449090291;
    static char type = 'b'; // Используемый тип посылки 'b' - box, 'p' - package
    static double weight = 112.2;
    static float result;

    static boolean hasWeight = (weight > result);

    // Инициализация -- имя
    public static void main(String[] args) {

        result = volume(1.2f, 0.4f,0.5f);

        System.out.println(name);
        System.out.println("Number parcel: " + parcel);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Volume: " + result);
        System.out.println(hasWeight);

    }
    public static float volume (float a, float b, float c) {
       return a * b * c * 250;
}
}
