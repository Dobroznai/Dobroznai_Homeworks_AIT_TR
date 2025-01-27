package de.ait.Homework29;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@Slf4j
public class User {

    private String id;
    private String name;
    private String email;

    private List<User> friends = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void addFriend(User user) {
        if (user != null) {
            friends.add(user);
            System.out.println("Friend added: " + user.name);
            log.info("Friend added: " + user.name);
        } else {
            System.out.println("Friend is not valid or already added!");
            log.warn("Friend is not valid or already added!");
        }
    }

    public void removeFriend(User user) {
        if (user != null && friends.contains(user)) {
            friends.remove(user);
            System.out.println("Friend removed: " + user.name);
            log.info("Friend removed: " + user.name);
        } else {
            System.out.println("Friend not found or invalid!");
            log.warn("Friend not found or invalid!");
        }
    }

    public List<User> getFriends() {
        return new ArrayList<>(friends);
    }

    public Post createPost(String content) {

        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content cannot be null or empty");
        } else {
            Post post = new Post(this, content);
            System.out.println("Post was created: " + content + " by " + name);
            log.info("Post was created: " + content + " by " + name);
            posts.add(post);
            return post;

        }
    }

    public List<Post> getPosts() {
        return new ArrayList<>(posts);
    }

    public void viewFriendsPosts() {
        for (User user : friends) {
            List<Post> friendPosts = user.getPosts();
            for (final Post post : friendPosts) {
                System.out.println("Author " + post.getAuthor().getName() +
                        " Post: " + post.getContent() +
                        " Likes " + post.getLikes());
                log.info("Author " + post.getAuthor().getName() +
                        " Post: " + post.getContent() +
                        " Likes " + post.getLikes());
            }
        }
    }


    public void printInfo() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
        System.out.println("User Email: " + email);
    }
}


