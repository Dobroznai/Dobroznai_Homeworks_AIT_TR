package de.ait.Homework23;
/*
Тестовое задание 3: Проверка распределения пациентов по палатам

Задание:

Создайте параметризованный тест для метода assignRoom(String patientName, String condition),
который распределяет пациента в палату в зависимости от диагноза: • "ICU" (Intensive Care Unit) —
для критических диагнозов. • "General" — для некритических. • "Isolation" — для инфекционных болезней.

Пример тестовых данных:

@CsvSource({
"John, Critical, ICU",          // Критическое состояние
"Alice, Infectious, Isolation", // Инфекционное заболевание
"Bob, General, General",        // Некритическое состояние
"Emma, null, General",          // Отсутствие диагноза — General
"'', General, General"          // Отсутствие имени игнорируется, палата General
})
Ожидаемое поведение: Метод возвращает название палаты в зависимости от диагноза пациента.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssingRoom {

    static final Logger LOGGER = LoggerFactory.getLogger(AssingRoom.class);

    String general = "General";
    String icu = "ICU";
    String isolation = "Isolation";

    public String assignRoom(String patientName, String condition) {
        if (patientName == null || patientName.trim().isEmpty()) {
            LOGGER.error("Invalid hospital data. PatientName is null or empty");
            return "General";
        }
        if (condition == null || condition.trim().isEmpty()) {
            LOGGER.error("Invalid hospital data. Condition is null or empty");
            return "General";
        }
        switch (condition.trim()) {
            case "Critical" -> {
                return "ICU";
            }
            case "Infectious" -> {
                return "Isolation";
            }
            default -> {
                return "General";
            }
        }
    }
}