package de.ait.Homework19;
/*
Упражнение 4: Логирование предпочтений фильтров для фотографий

Создайте класс PhotoFilters, который будет получать список предпочтительных фильтров от пользователя с помощью Scanner и сохранять их в ArrayList.
Логируйте:

Добавление нового фильтра (уровень INFO).
Попытку добавить уже существующий фильтр (уровень WARN).
Вывод всех фильтров в порядке их добавления (уровень INFO).
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class PhotoFilters {
    private static final Logger LOGGER = LoggerFactory.getLogger(PhotoFilters.class);
    private ArrayList<String> filters;

    public PhotoFilters() {
        filters = new ArrayList<>();
    }

    // Добавление нового фильтра
    public void addFilter(String filter) {
        if (filters.contains(filter)) {
            LOGGER.warn("Попытка добавить уже существующий фильтр: {}", filter);
        } else {
            filters.add(filter);
            LOGGER.info("Добавлен новый фильтр: {}", filter);
        }
    }

    // Вывод всех фильтров
    public void displayFilters() {
        if (filters.isEmpty()) {
            LOGGER.info("Список фильтров пуст.");
        } else {
            LOGGER.info("Текущие фильтры:");
            for (String filter : filters) {
                LOGGER.info("Фильтр: {}", filter);
            }
        }
    }
}