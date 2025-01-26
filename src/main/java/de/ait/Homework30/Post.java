package de.ait.Homework30;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Post implements Likable,Commentable {


    private int likesCount;
    private List <String> comments;

    public Post(){
        this.likesCount = 0;
        comments = new ArrayList<>();
    }
    @Override
    public void addComment(String comment) {
        if (comment == null || comment.isEmpty()) {
            System.out.println("Comment is empty or null");
            log.warn("Comment is empty or null");
        } else {
            comments.add(comment);
            System.out.println("Comment added: " + comment);
            log.info("Comment added: {}", comment);
        }
    }


    @Override
    public List<String> getComments() {
        return new ArrayList<>(comments);
    }

    @Override
    public void like() {
        likesCount++;
    }
    @Override
    public int getLikesCount() {
        return likesCount;
    }

    public void getInfoAboutPost() {
        System.out.println("---------Post info--------------");
        log.info("Post info");
        System.out.println("Likes count: " + likesCount);
        log.info("Likes count: {}", likesCount);
        System.out.println("Comments: " + comments);
        log.info("Comments: {}", comments);
    }

}
