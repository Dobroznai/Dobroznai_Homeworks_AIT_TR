package de.ait.Homework19;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class  Logging_HW_vanrest {
    private static final Logger LOGGER = LoggerFactory.getLogger(Logging_HW_vanrest.class);

    public static void main(String[] args) {

        LOGGER.info("Начинается отображение меню выбора.");
        LOGGER.debug("Вызывается метод choice().");
        choice();
    }

    static Scanner sc = new Scanner(System.in);
    static boolean running = true;


    private static void showMenu() {

        System.out.println("\nApp Name: Task Logging");
        System.out.println("Author: Ivan Dobroznai");
        System.out.println("Version: 1.0.0");
        System.out.println("Date: 2024-11-17\n");

        LOGGER.info("Показать главное меню");
        System.out.println("\nСписок упражнений по логированию:\n");
        System.out.println("    " + "Упражнение 1: Логирование списка фотографий");
        System.out.println("    " + "Упражнение 2: Учет уникальных мест для фотосессий");
        System.out.println("    " + "Упражнение 3: Логирование настроек камеры");
        System.out.println("    " + "Упражнение 4: Логирование предпочтений фильтров для фотографий");
        System.out.println("    " + "5. Выйти из домашнего задания" + "\n");

        System.out.print("Какое задание вы выбираете? ");
    }

    public static void choice() {

        while (running) {
            showMenu();
            int index;
            while (!sc.hasNextInt()) {
                LOGGER.warn("Ввод некорректного значения вместо числового.");
                System.out.println("Ошибка! Введите числовое значение.");
                showMenu();
                sc.next(); // очистка некорректного ввода
            }
            index = sc.nextInt();

            switch (index) {
                case 1 -> {
                    LOGGER.info("Пользователь выбрал задание 1.");
                    task01();
                }
                case 2 -> {
                    LOGGER.info("Пользователь выбрал задание 2.");
                    task02();
                }
                case 3 -> {
                    LOGGER.info("Пользователь выбрал задание 3.");
                    task03();
                }
                case 4 -> {
                    LOGGER.info("Пользователь выбрал задание 1.");
                    task04();
                }
                case 5 -> {
                    LOGGER.info("Пользователь завершил выполнение программы.");
                    System.out.println("Вы вышли из домашнего задания");
                    sc.close();
                    running = false;
                }
                default -> {
                    LOGGER.error("Некорректный выбор в меню упражнений: {}", index);
                    System.out.println("Некорректный выбор, пожалуйста, повторите попытку");

                }
            }
        }
    }

    private static void task01() {
    /*
    Упражнение 1: Логирование списка фотографий

    Создайте класс PhotoAlbum, в котором будет список фотографий (используйте ArrayList).
    Логируйте следующие действия:
    1. Добавление новой фотографии (уровень INFO).
    2. Удаление фотографии по индексу (уровень WARN).
    3. Попытку удаления несуществующей фотографии (уровень ERROR).
    4. Отображение всех фотографий в альбоме (уровень DEBUG).
     */
        PhotoAlbum album = new PhotoAlbum();
        boolean taskRunning = true;

        while (taskRunning) {
            LOGGER.info("Запущено упражнение 1: Логирование списка фотографий.");
            System.out.println("\nУпражнение 1: Логирование списка фотографий");
            System.out.println("1. Добавить фотографию");
            System.out.println("2. Удалить фотографию");
            System.out.println("3. Отобразить фотографии");
            System.out.println("4. Вернуться в главное меню");
            System.out.print("Выберите действие: ");

            int choice;
            while (!sc.hasNextInt()) {
                LOGGER.warn("Некорректный ввод в меню упражнения 1.");
                System.out.println("Ошибка! Введите числовое значение.");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    LOGGER.debug("Пользователь выбрал добавление фотографии");
                    System.out.print("Введите имя фотографии: ");
                    String photoName = sc.next().trim();
                    album.addPhoto(photoName);
                }
                case 2 -> {
                    LOGGER.debug("Пользователь выбрал удаление фотографии.");
                    album.displayPhotos();
                    System.out.print("Введите индекс фотографии для удаления: ");


                    while (!sc.hasNextInt()) {
                        LOGGER.warn("Некорректный ввод индекса для удаления фотографии.");
                        System.out.println("Ошибка! Введите числовое значение.");
                        sc.next();
                    }
                    int index = sc.nextInt();
                    album.removePhoto(index);
                }
                case 3 -> {
                    LOGGER.debug("Пользователь выбрал отображение фотографий.");
                    album.displayPhotos();
                }
                case 4 -> {
                    LOGGER.info("Пользователь вернулся в главное меню.");
                    System.out.println("Возврат в главное меню.");
                    taskRunning = false;
                }
                default -> {
                    LOGGER.error("Пользователь ввел неверные данные: {}:", choice);
                    System.err.println("Неверный выбор. Попробуйте снова.");
                }
            }
        }
    }

    private static void task02() {
        /*
        Упражнение 2: Учет уникальных мест для фотосессий

    Создайте класс PhotoSessionLocations, который хранит уникальные места для фотосессий с использованием HashSet.
    Логируйте:
    1.Добавление нового места (уровень INFO).
    2.Попытку добавить уже существующее место (уровень WARN).
    3.Удаление места из списка (уровень INFO).
    4.Попытку удалить несуществующее место (уровень ERROR).
         */

        PhotoSessionLocations locations = new PhotoSessionLocations();
        boolean taskRunning = true;

        while (taskRunning) {
            LOGGER.info("Запущено упражнение 2: Учет уникальных мест для фотосессий.");
            System.out.println("\nУпражнение 2: Учет уникальных мест для фотосессий");
            System.out.println("1. Добавить новое место");
            System.out.println("2. Удалить место");
            System.out.println("3. Показать все места");
            System.out.println("4. Вернуться в главное меню");
            System.out.print("Выберите действие: ");

            int choice;
            while (!sc.hasNextInt()) {
                LOGGER.warn("Некорректный ввод в меню упражнения 2.");
                System.out.println("Ошибка! Введите числовое значение.");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    LOGGER.debug("Пользователь выбрал добавление места");
                    System.out.print("Введите название места: ");
                    String placeName = sc.next().trim();
                    locations.addLocations(placeName);
                }
                case 2 -> {
                    LOGGER.debug("Пользователь выбрал удаление места.");
                    System.out.print("Введите название места для удаления: ");

                    String location = sc.next().trim();
                    locations.removeLocation(location);
                }
                case 3 -> {
                    LOGGER.debug("Пользователь выбрал отображение фотографий.");
                    locations.displayLocations();
                }
                case 4 -> {
                    LOGGER.info("Пользователь вернулся в главное меню.");
                    System.out.println("Возврат в главное меню.");
                    taskRunning = false;
                }
                default -> {
                    LOGGER.error("Пользователь ввел неверные данные: {}:", choice);
                    System.err.println("Неверный выбор. Попробуйте снова.");
                }
            }
        }
    }

    private static void task03() {
    /*
    Упражнение 3: Логирование настроек камеры

    Создайте класс CameraSettings, в котором HashMap хранит параметры камеры и их значения.
    Логируйте:

    1.Добавление новой настройки (уровень INFO).
    2.Обновление существующей настройки (уровень DEBUG).
    3.Попытку обновить несуществующую настройку (уровень ERROR).
    4.Отображение всех настроек камеры (уровень INFO).
         */
        CameraSettings cameraSettings = new CameraSettings();
        boolean taskRunning = true;

        while (taskRunning) {
            LOGGER.info("Запущено упражнение 3: Логирование настроек камеры.");
            System.out.println("\nУпражнение 3: Логирование настроек камеры");
            System.out.println("1. Добавить настройку");
            System.out.println("2. Обновить настройку");
            System.out.println("3. Показать все настройки");
            System.out.println("4. Вернуться в главное меню");
            System.out.print("Выберите действие: ");

            int choice;
            while (!sc.hasNextInt()) {
                LOGGER.warn("Некорректный ввод в меню упражнения 3.");
                System.out.println("Ошибка! Введите числовое значение.");
                sc.next();
            }
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Введите название настройки: ");
                    String parameter = sc.next();
                    System.out.print("Введите значение настройки: ");
                    String value = sc.next();
                    cameraSettings.addSetting(parameter, value);
                }
                case 2 -> {
                    System.out.print("Введите название настройки для обновления: ");
                    String parameter = sc.next();
                    System.out.print("Введите новое значение настройки: ");
                    String newValue = sc.next();
                    cameraSettings.updateSetting(parameter, newValue);
                }
                case 3 -> cameraSettings.displaySettings();
                case 4 -> taskRunning = false;
                default -> System.err.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void task04() {
        /*
        Упражнение 4: Логирование предпочтений фильтров для фотографий

        Создайте класс PhotoFilters, который будет получать список предпочтительных фильтров от пользователя с помощью Scanner и сохранять их в ArrayList.
        Логируйте:

        1.Добавление нового фильтра (уровень INFO).
        2.Попытку добавить уже существующий фильтр (уровень WARN).
        3.Вывод всех фильтров в порядке их добавления (уровень INFO).
         */

        PhotoFilters photoFilters = new PhotoFilters();
        boolean taskRunning = true;

        while (taskRunning) {
            LOGGER.info("Запущено упражнение 4: Логирование предпочтений фильтров для фотографий");
            System.out.println("\nУпражнение 4: Логирование предпочтений фильтров для фотографий");
            System.out.println("1. Добавить фильтр");
            System.out.println("2. Показать все фильтры");
            System.out.println("3. Вернуться в главное меню");
            System.out.print("Выберите действие: ");

            int choice;
            while (!sc.hasNextInt()) {
                LOGGER.warn("Некорректный ввод в меню упражнения 3.");
                System.out.println("Ошибка! Введите числовое значение.");
                sc.next();
            }
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Введите название фильтра: ");
                    String filter = sc.next();
                    photoFilters.addFilter(filter);
                }
                case 2 -> photoFilters.displayFilters();
                case 3 -> taskRunning = false;
                default -> System.err.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}