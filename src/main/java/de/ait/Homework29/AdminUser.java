package de.ait.Homework29;

import java.util.ArrayList;

public class AdminUser extends User {

    public AdminUser(String id, String name, String email) {
        super(id, name, email);
    }

    public void banUser() {
        System.out.println("User is banned!!!");
}

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Admin User");
    }
}
