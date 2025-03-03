package de.ait.Homework30;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class UserMessenger {

    private Map<String, List<String>> usersAndMessages;

    public UserMessenger() {
        usersAndMessages = new HashMap<>();
    }

    public void sendMessage(String message, String userId) {
        if (message == null || message.isEmpty() || userId == null || userId.isEmpty()) {
            System.out.println("Message or user is empty or null");
            log.warn("Message or user is empty or null");
        } else {
            System.out.println("User " + userId + " sent message: " + message);
            List<String> userMessages = this.usersAndMessages.get(userId);
            if (userMessages == null) {
                userMessages = new ArrayList<>();
                userMessages.add(message);
                this.usersAndMessages.put(userId, userMessages);
                log.info("User {} sent message: {}", userId, message);
            } else {
                userMessages.add(message);
                this.usersAndMessages.put(userId, userMessages);
                log.info("User {} sent message: {}", userId, message);
            }
        }
    }
    public List<String> receiveMessages(String userId) {
        List<String> userMessages = this.usersAndMessages.get(userId);
        return new ArrayList<>(userMessages);
    }
}