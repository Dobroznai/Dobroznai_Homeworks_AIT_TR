package de.ait.Homework19;

/*
    Упражнение 2: Учет уникальных мест для фотосессий

    Создайте класс PhotoSessionLocations, который хранит уникальные места для фотосессий с использованием HashSet.
    Логируйте:
    1.Добавление нового места (уровень INFO).
    2.Попытку добавить уже существующее место (уровень WARN).
    3.Удаление места из списка (уровень INFO).
    4.Попытку удалить несуществующее место (уровень ERROR).
         */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class PhotoSessionLocations {
    private static final Logger LOGGER = LoggerFactory.getLogger(PhotoSessionLocations.class);
    static HashSet<String> locations;

    public PhotoSessionLocations() {
        locations = new HashSet<>();
    }

    //Добавление нового места (уровень INFO).
    public void addLocations(String location) {
        if (locations.add(location)) {
            LOGGER.info("Добавлено новое место: {}", location);
        } else {
            //Попытку добавить уже существующее место (уровень WARN).
            LOGGER.warn("Место уже существует: {}", location);
        }
    }

    public void removeLocation(String location) {
        if (locations.remove(location)) {
            LOGGER.info("Место удалено: {}", location);
        } else {
            LOGGER.error("Попытка удалить несуществующее место: {}", location);
        }
    }

    public void displayLocations() {
        if (locations.isEmpty()) {
            LOGGER.info("Список мест для фотосессий пуст.");
        } else {
            LOGGER.info("Уникальные места для фотосессий:");
            for (String location : locations) {
                LOGGER.info("Место: {}", location);
            }
        }
    }
}
