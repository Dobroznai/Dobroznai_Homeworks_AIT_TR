package de.ait.Homework29;

import java.time.LocalDate;

public class PremiumUser extends User {

    private LocalDate subscriptionEndDate;

    public PremiumUser(String id, String name, String email, LocalDate subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public boolean isSubscriptionActive() {
        LocalDate today = LocalDate.now();
        return subscriptionEndDate.isAfter(today);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Subscription Date End: " + subscriptionEndDate);
    }
}
