package de.ait.homework05;

import java.util.Scanner;

public class HW05Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercise 1: Favorite Movie Input
        //Write a program that:
        //Reads the title of your favorite movie.
        //Outputs the message: "Your favorite movie is [movie title]."

        System.out.println("Please enter your favorite movie: ");
        String movie = scanner.nextLine();
        System.out.println("Your favorite movie is: " + movie);

        // Exercise 2: Movie Rating
        //Write a program that:
        //Reads the title of a movie.
        //Reads your rating of the movie on a scale from 1 to 10.
        //Outputs the message: "[Movie title] was rated [rating] out of 10."

        System.out.println("Please enter your \"" + movie + "\" scale from 1 to 10: ");
        int scale = scanner.nextInt();
        scanner.nextLine();
        System.out.println(movie + " was rated " + scale + ".");

        // Exercise 3: Genre Recommendation Based on Season
        //Write a program that:
        //Reads your favorite season (e.g., "summer").
        //Outputs a movie genre recommendation based on the season.
        //For winter: "We recommend you watch a drama."
        //For summer: "We recommend you watch a comedy."
        //For spring: "We recommend you watch a romantic film."
        //For autumn: "We recommend you watch a thriller."

        System.out.println("Please enter Season to watch the \"" + movie + "\": ");
        String season = scanner.nextLine();
        if (season.equals("winter")) {
            System.out.println("We recommend you watch a drama.");
        } else if (season.equals("summer")) {
            System.out.println("We recommend you watch a comedy.");
        } else if (season.equals("spring")) {
            System.out.println("We recommend you watch a romantic film.");
        } else if (season.equals("autumn")) {
            System.out.println("We recommend you watch a thriller.");
        } else {
            System.out.println("Please enter the correct season");
        }

        // Exercise 4: Movie Rating Check
        //Write a program that:
        //Reads the user's age.
        //Reads the movie rating (e.g., "R", "PG-13", "G").
        //Checks whether the user can watch this movie.
        //If the rating is "R" and the age is under 18, output the message: "Movies rated R are not recommended for viewers under 18."
        //If the rating is "PG-13" and the age is under 13, output the message: "Movies rated PG-13 are not recommended for viewers under 13."
        //In other cases, output: "You can watch this movie."

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your \"" + movie + "\" Rating: (e.g., \"R\", \"PG-13\", \"G\")");
        String rating = scanner.nextLine();
        if (rating.equals("R")) {
            if (age < 18) {
                System.out.println("Movies rated \"R\" are not recommended for viewers under 18.");
            } else {
                System.out.println("You can watch this movie.");
            }
        } else if (age <= 13) {
            if (rating.equals("PG-13")) {
                System.out.println("Movies rated \"PG-13\" are not recommended for viewers under 13.");
            } else {
                System.out.println("You can watch this movie.");
            }
        } else {
            System.out.println("You can watch this movie.");
        }
        scanner.close();
    }
}
