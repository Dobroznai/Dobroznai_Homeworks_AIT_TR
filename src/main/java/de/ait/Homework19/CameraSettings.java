package de.ait.Homework19;
/*
    Упражнение 3: Логирование настроек камеры

    Создайте класс CameraSettings, в котором HashMap хранит параметры камеры и их значения. Логируйте:

    1.Добавление новой настройки (уровень INFO).
    2.Обновление существующей настройки (уровень DEBUG).
    3.Попытку обновить несуществующую настройку (уровень ERROR).
    4.Отображение всех настроек камеры (уровень INFO).
         */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class CameraSettings {
    private static final Logger LOGGER = LoggerFactory.getLogger(CameraSettings.class);
    private HashMap<String, String> settings;

    public CameraSettings() {
        settings = new HashMap<>();
    }

    // Добавление новой настройки
    public void addSetting(String parameter, String value) {
        if (settings.containsKey(parameter)) {
            LOGGER.warn("Настройка уже существует: {}. Используйте метод updateSetting для обновления.", parameter);
        } else {
            settings.put(parameter, value);
            LOGGER.info("Добавлена новая настройка: {} = {}", parameter, value);
        }
    }

    // Обновление существующей настройки
    public void updateSetting(String parameter, String newValue) {
        String updatedValue = settings.computeIfPresent(parameter, (k, v) -> newValue);
        if (updatedValue == null) {
            LOGGER.error("Попытка обновить несуществующую настройку: {}", parameter);
        } else {
            LOGGER.debug("Обновлена настройка: {}. Новое значение: {}", parameter, newValue);
        }
    }

    // Отображение всех настроек камеры
    public void displaySettings() {
        if (settings.isEmpty()) {
            LOGGER.info("Настройки камеры отсутствуют.");
        } else {
            LOGGER.info("Текущие настройки камеры:");
            for (Map.Entry<String, String> entry : settings.entrySet()) {
                LOGGER.info("{} = {}", entry.getKey(), entry.getValue());
            }
        }
    }
}
