package de.ait.homework10;
import java.util.Scanner;
public class homework04 {

    /*
    Упражнение 4 (*) : Создание списка любимых животных

    Задание:

    Напишите программу, которая запрашивает у пользователя названия его любимых животных до тех пор,
    пока не будет введено слово «стоп». Затем программа выводит список всех введенных животных.

    Подсказки:

    •	Используйте цикл while, чтобы продолжать ввод до слова «стоп».
    •	Собирайте названия животных в одну строку или список и выводите их после завершения ввода.
    Copy
    Пример:

    Введите название любимого животного (или 'стоп' для завершения): Кот
    Введите название любимого животного (или 'стоп' для завершения): Собака
    Введите название любимого животного (или 'стоп' для завершения): Лиса
    Введите название любимого животного (или 'стоп' для завершения): Стоп

    Ваши любимые животные:
    Кот
    Собака
    Лиса
     */

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                String animalList = "";
                String stopWord = "stop";

                while (true) {
                    System.out.print("Enter the name of a favorite animal (or 'stop' to finish): ");
                    String animal = scanner.nextLine();

                    //Check animal "stop"
                    if (animal.trim().equalsIgnoreCase(stopWord)) {//Stop
                        if (animalList.isEmpty()) {
                            System.err.println("Error! You don't enter anything!");
                        } else {
                            break;
                        }
                    } else {// animal is not "stop"
                        if (animal.trim().isEmpty()) {
                            System.out.println("You don't enter any animal name!");
                        } else {
                            if (!animalList.isEmpty()) {
                                animalList = animalList.concat("\n");
                            }

                            if(animalList.contains(animal)){
                                System.out.println(animal + " was added already.");
                            }
                            else {
                                if (!animalList.isEmpty()) {
                                    animalList = animalList.concat("\n");
                                }
                                animalList = animalList.concat(animal);

                            }
                        }
                    }
                }

                System.out.println("Your favorite animals:\n" + animalList);

                scanner.close();

            }
        }