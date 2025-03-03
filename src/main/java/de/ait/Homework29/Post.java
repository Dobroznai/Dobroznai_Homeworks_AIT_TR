package de.ait.Homework29;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Post {

    private User author;
    private String content;
    private int likes;


    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = 0;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    void like() {
        likes++;
        log.info("add like: " + likes);

    }
}
