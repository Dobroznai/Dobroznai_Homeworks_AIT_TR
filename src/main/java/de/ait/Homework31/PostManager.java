package de.ait.Homework31;

public class PostManager {


    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();


        Letter letter = new Letter("Leonardo DiCaprio", "Brad Pitt", 0.05, true);
        postOffice.addMailItem(letter);


        Package packageJohansson = new Package("Scarlett Johansson", "Chris Hemsworth", 2.5, 30, 30, 15);
        postOffice.addMailItem(packageJohansson);


        Advertisement advertisement = new Advertisement("Tom Cruise", "Все жители Голливуда", 0.1, 100);
        postOffice.addMailItem(advertisement);


        postOffice.printAllDetails();
        postOffice.calculateTotalShippingCost();
    }
}

