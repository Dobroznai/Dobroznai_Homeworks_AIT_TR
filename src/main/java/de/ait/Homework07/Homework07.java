package de.ait.Homework07;

import java.util.Scanner;

public class Homework07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();


        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 1 || age > 120) {
            System.out.println("Invalid age");
        } else {

            System.out.println("Do you prefer dancing music (true/false): ");
            boolean preferDanceMusic = scanner.nextBoolean();

            System.out.println("Select the music volume level (1 - quiet, 2 - medium, 3 - loud): ");
            int volumeLevel = scanner.nextInt();
            if (volumeLevel < 1 || volumeLevel > 3) {
                System.out.println("Invalid volume level!");
            }
            scanner.nextLine();

            System.out.println("Enter some of your favorite musical instruments (eg guitar, piano, drums, violin, pipe, saxophone): ");
            String favoriteInstrumentOne = scanner.nextLine();
            String favoriteInstrumentTwo = scanner.nextLine();
            scanner.close();

            System.out.println(" ");
            System.out.println("Hello, " + name + "!" + " Here are your music reccomendations: ");
            if (age <= 12) {
                System.out.println("Kid's music!");
            } else if (age <= 19) {
                System.out.println("- Hip-Hop");
                System.out.println("- Pop");
            } else if (age <= 35) {
                System.out.println("- Rock");
                System.out.println("- Electronic music");
                System.out.println("- Jazz");
            } else {
                System.out.println("- Classic music!");
                System.out.println("- Blues");
            }
            if (preferDanceMusic) {
                System.out.println(" ");
                System.out.println("Dancing music: ");
                System.out.println("- EDM");
                System.out.println("- Disco");
            }
            System.out.println(" ");
            switch (volumeLevel) {
                case 1 -> System.out.println("Level volume is 1. Acoustic or jazz music is recommended.");
                case 2 -> System.out.println("Level volume is 2. Pop or rock is recommended.");
                case 3 -> System.out.println("Level volume is 3. Metal or EDM is recommended.");
            }
            System.out.println(" ");
            switch (favoriteInstrumentOne) {
                case "guitar" -> System.out.println("Your instrument is \"guitar\". Rock and Blues are recommended!");
                case "piano" ->
                        System.out.println("Your instrument is \"piano\". Classical Music and Jazz are recommended!");
                case "drums" -> System.out.println("Your instrument is \"drums\". Rock and Metal are recommended!");
                case "violin" ->
                        System.out.println("Your instrument is \"violin\". Classical Music and Baroque  are recommended!");
                case "pipe" -> System.out.println("Your instrument is \"pipe\". Jazz and Latin Music are recommended!");
                case "saxophone" ->
                        System.out.println("Your instrument is \"saxophone\". Jazz and Blues are recommended!");

                default -> System.out.println("Universal genres for instruments: " + favoriteInstrumentOne);
            }
            switch (favoriteInstrumentTwo) {
                case "guitar" -> System.out.println("Your instrument is \"guitar\". Rock and Blues are recommended!");
                case "piano" ->
                        System.out.println("Your instrument is \"piano\". Classical Music and Jazz are recommended!");
                case "drums" -> System.out.println("Your instrument is \"drums\". Rock and Metal are recommended!");
                case "violin" ->
                        System.out.println("Your instrument is \"violin\". Classical Music and Baroque  are recommended!");
                case "pipe" -> System.out.println("Your instrument is \"pipe\". Jazz and Latin Music are recommended!");
                case "saxophone" ->
                        System.out.println("Your instrument is \"saxophone\". Jazz and Blues are recommended!");

                default -> System.out.println("Universal genres for instruments: " + favoriteInstrumentTwo);
            }
        }
    }
}



