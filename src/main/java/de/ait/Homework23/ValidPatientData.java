package de.ait.Homework23;
/*
Тестовое задание 2: Проверка валидации данных пациента

Задание:

Напишите параметризованный тест для метода isValidPatientData(String name, int age, String diagnosis),
который проверяет валидность данных пациента. Валидные данные:

• Имя не может быть пустым, null или строкой "null".
• Возраст должен быть от 0 до 120 лет. • Диагноз не может быть пустым или null.

Пример тестовых данных:

@CsvSource({
"John, 30, Flu, true",       // Валидные данные
"'', 30, Flu, false",        // Пустое имя
"John, -1, Flu, false",      // Некорректный возраст
"John, 30, '', false",       // Пустой диагноз
"null, 50, Flu, false",      // null в имени
"Alice, 130, Covid, false"   // Возраст вне диапазона
})
Ожидаемое поведение: Метод возвращает true для валидных данных и false для некорректных.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidPatientData {

    static final Logger LOGGER = LoggerFactory.getLogger(ValidPatientData.class);

    boolean isValidPatientData(String name, int age, String diagnosis) {

        if (name == null || name.trim().isEmpty() || name.equals("null")) {
            LOGGER.error("Invalid hospital data. Name is null or empty");
            return false;
        }

        if (diagnosis == null || diagnosis.trim().isEmpty() || diagnosis.equals("null")) {
            LOGGER.error("Invalid hospital data. Diagnosis is null or empty");
            return false;
        }

        if (age <= 0 || age > 120) {
            LOGGER.error("Invalid hospital data. Age is out of range");
            return false;
        }

        return true;
    }
}
