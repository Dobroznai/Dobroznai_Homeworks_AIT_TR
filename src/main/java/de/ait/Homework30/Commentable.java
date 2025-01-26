package de.ait.Homework30;

import java.util.List;

/*
Создайте интерфейс Commentable с методами:
void addComment(String comment) — добавляет комментарий.
List<String> getComments() — возвращает список комментариев.
 */
public interface Commentable {

    void addComment(String comment);
    List<String> getComments();

}
