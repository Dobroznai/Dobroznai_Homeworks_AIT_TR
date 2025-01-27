package de.ait.Homework29;


import java.time.LocalDate;

public class SocialMediaManager {
    public static void main(String[] args) {

        PremiumUser premiumUser = new PremiumUser("001", "Ivan", "ivan.d@gmail.com", LocalDate.of(2026, 1, 1));
        premiumUser.createPost("Im was started learn Java Programming");


        Post premiumUserPost = premiumUser.createPost("Good Start");
        for (int i = 0; i < 5; i++) {
            premiumUserPost.like();
        }
        premiumUser.printInfo();
        // проверка на подписку
        System.out.println("Is subscription active: " + premiumUser.isSubscriptionActive());


        AdminUser adminUser = new AdminUser("002", "Admin", "admin@gmail.com");
        Post createdPost = adminUser.createPost("Greate way!");
        for (int i = 0; i < 7; i++) {
            createdPost.like();
        }
        adminUser.printInfo();


        adminUser.addFriend(premiumUser);
        System.out.println("---------------------------");
        adminUser.viewFriendsPosts();

        System.out.println("---------------------------");
        adminUser.removeFriend(premiumUser);
        adminUser.viewFriendsPosts();


        System.out.println("-------------Полиморфизм--------------");
        User userDavid = new PremiumUser("01A", " David", " david@example.com ", LocalDate.of(2025, 1, 1));
        Post postDavid = userDavid.createPost("Very Good Year");
        postDavid.like();
        postDavid.like();
        postDavid.like();
        userDavid.printInfo();

        // проверка на подписку и принадлежность к premiumUser
        if (userDavid instanceof PremiumUser) {
            PremiumUser premiumDavid = (PremiumUser) userDavid;
            System.out.println("Is subscription active: " + premiumDavid.isSubscriptionActive());
        }

        User userArmin = new AdminUser("01B", " Armin", " armin@example.com ");
        userArmin.addFriend(userDavid);
        userArmin.viewFriendsPosts();
        userArmin.printInfo();

    }
}
