package de.ait.Homework23;

/*
Тестовое задание 1: Проверка расчёта стоимости пребывания в больнице

Задание:

Создайте параметризованный тест для метода calculateHospitalStayCost(int days), 
который принимает количество дней пребывания пациента в больнице и возвращает итоговую стоимость. 
Стоимость рассчитывается по следующим правилам: • Первый день стоит 100 евро. • Каждый последующий день стоит 80 евро.

Пример тестовых данных:

@CsvSource({
"1, 100",  // 1 день - 100 евро
"2, 180",  // 1 день 100 евро + 80 евро
"5, 420",  // 1 день 100 евро + 4*80 евро
"0, -1",   // Некорректное количество дней
"-1, -1"   // Некорректное количество дней
})
Ожидаемое поведение: Метод возвращает корректную стоимость или код ошибки -1 для некорректного ввода.
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HospitalStayCost {


    int costFirstDay = 100;
    int costNextDay = 80;
    static final Logger LOGGER = LoggerFactory.getLogger(HospitalStayCost.class);

    public int calculateHospitalStayCost(int days) {
        if (days <= 0) {
            LOGGER.warn("Hospital stays less than 1 days");
            return -1;
        }
        int finalCost = costFirstDay + (days - 1) * costNextDay;
        LOGGER.info("Final cost {}", finalCost);
        return finalCost;
    }
}
