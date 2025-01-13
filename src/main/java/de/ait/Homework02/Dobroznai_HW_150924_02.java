package de.ait.Homework02;

public class Dobroznai_HW_150924_02 {

    public static void main(String[] args) {
        int width = 1;
        int height = 2;
        int lenght = 4;

        int result = volume(width, height, lenght);

        System.out.println(result);
    }
    public static int volume(int a, int b, int c) {
        int sum = a * b * c * 250;
        return sum;
        }

    }