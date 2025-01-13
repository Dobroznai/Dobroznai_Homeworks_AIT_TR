package de.ait.homework08;
import java.util.Scanner;

    public class MusicRobot {

        // Переменные для хранения данных о пользователе
        // Variables to store user data
        static int age;
        static String name;
        static boolean likesDanceMusic;
        static int volume;
        static String musicInstrument;

        // Создаем объект Scanner для чтения пользовательского ввода
        // Creating a Scanner object to read user input
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            // Запрашиваем имя пользователя
            // Asking for the user's name
            System.out.println("Введите ваше имя:");
            name = scanner.nextLine();

            // Запрашиваем возраст пользователя
            // Asking for the user's age
            System.out.println("Введите ваш возраст:");
            age = scanner.nextInt();
            scanner.nextLine(); // Для правильной работы после ввода числа

            // Проверка возраста пользователя
            // Checking the user's age
            boolean checkAgeResult = checkAge(age);
            if (!checkAgeResult) {
                // Вывод сообщения при неправильном возрасте
                // Output message for invalid age
                System.out.println("неверный возраст");
            } else {

                // Спрашиваем пользователя, любит ли он танцевальную музыку
                // Asking if the user likes dance music
                System.out.println("Предпочитаете ли вы танцевальную музыку? (true/false):");
                likesDanceMusic = scanner.nextBoolean();

                // Запрашиваем у пользователя предпочтительный уровень громкости
                // Asking the user to choose a preferred volume level
                System.out.println("Выберите уровень громкости музыки:\n" +
                        "1 - Тихая\n" +
                        "2 - Средняя\n" +
                        "3 - Громкая");
                volume = scanner.nextInt();
                scanner.nextLine(); // Для правильной работы после ввода числа

                // Запрашиваем любимый музыкальный инструмент
                // Asking for the user's favorite musical instrument
                System.out.println("Введите ваш любимый музыкальный инструмент (гитара, пианино, ударные):");
                musicInstrument = scanner.nextLine();

                // Приветствие пользователя
                // Greeting the user
                System.out.println("Здравствуйте, " + name + "!");
                System.out.println("На основе ваших предпочтений мы рекомендуем вам следующие музыкальные жанры:");
                // Рекомендация музыкальных жанров на основе возраста
                // Recommending music genres based on age
                mapAgeAndMusic(age);

                // Рекомендация жанров на основе громкости
                // Recommending genres based on volume level
                switch (volume) {
                    case 1:
                        System.out.println("акустическая музыка\nджаз");
                        break;
                    case 2:
                        System.out.println("поп\nрок");
                        break;
                    case 3:
                        System.out.println("металл\nEDM");
                        break;
                    default:
                        System.out.println("ERRROR !!! неправильный уровень громкости");
                }

                // Рекомендация жанров на основе музыкального инструмента
                // Recommending genres based on the musical instrument
                switch (musicInstrument) {
                    case "гитара":
                        System.out.println("Рок\nблюз");
                        break;
                    case "пианино":
                        System.out.println("Классическая\nджаз");
                        break;
                    case "ударные":
                        System.out.println("Металл\nрок");
                        break;
                    default:
                        System.out.println("Поп музыка");
                }
            }

            // Закрываем сканер для предотвращения утечек ресурсов
            // Closing the scanner to prevent resource leaks
            scanner.close();
        }

        // Метод для проверки корректности возраста пользователя
        // Method to validate user's age
        public static boolean checkAge(int age) {
            if (age < 1 || age > 120) {
                return false;
            } else {
                return true;
            }
        }

        // Метод для рекомендации жанров на основе возраста
        // Method to recommend music genres based on age
        public static void mapAgeAndMusic(int age) {
            if (age <= 12) {
                System.out.println("детская музыка.");
            } else if (age <= 19) {
                System.out.println("поп\nхип-хоп");
            } else if (age <= 35) {
                System.out.println("рок\nэлектронная музыка\nджаз");
            } else {
                System.out.println("классическая музыка\nблюз");
            }
            // Добавление жанров, если пользователь предпочитает танцевальную музыку
            // Adding genres if the user likes dance music
            if (likesDanceMusic) {
                System.out.println("EDM\nдиско");
            }
        }
    }
