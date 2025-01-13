package de.ait.homework14;

/*
Упражнение 1: Учёт расходов

Напишите программу, которая:

1.	Создаст список для хранения ежемесячных расходов на продукты (в евро) за 6 месяцев.
2.	Выведет все расходы по месяцам.
3.	Найдёт и выведет месяц с наибольшим расходом.
4.	Удалит расходы, превышающие 300 евро.
5.	Посчитает, сколько месяцев остались после удаления (размер списка).

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class costAccounting {

    public static void main(String[] args) {
        List<Integer> monthlyGrocery = new ArrayList<>();
        monthlyGrocery.add(250);
        monthlyGrocery.add(280);
        monthlyGrocery.add(350);
        monthlyGrocery.add(380);
        monthlyGrocery.add(250);
        monthlyGrocery.add(500);

        // Расходы по месяцам
        for (int i = 0; i < monthlyGrocery.size(); i++) {
            int monthly = monthlyGrocery.get(i);
            System.out.println("Monthly grocery expences in month " + (i + 1) + ": " + monthly + " Euro");
        }
        // Месяц с наибольшим расходом
        int maxExpense = 0;
        int maxExpenseMonth = 0;

        for (int i = 0; i < monthlyGrocery.size(); i++) {
            if (maxExpense < monthlyGrocery.get(i)) {
                maxExpense = monthlyGrocery.get(i);
                maxExpenseMonth = i + 1;
            }
        }
        System.out.println("Most Expences month is: " + maxExpenseMonth + " --> " + maxExpense + " Euro");

        //Удаление расходов, превышающих 300 евро
        Iterator<Integer> deleteMostExpenses = monthlyGrocery.iterator();
        int index = 0;

        while (deleteMostExpenses.hasNext()) {
            Integer mostExpenses = deleteMostExpenses.next();
            // Удалим элементы во время итерации
            if (mostExpenses > 300) {
                deleteMostExpenses.remove(); // Удаляет текущий элемент
                System.out.println("Removed month " + (index + 1) + " --> " + mostExpenses);
            }
            index++; // увеличивает индекс при каждой итерации
        }
        // месяцев осталось после удаления
        System.out.println("Months left after removal: " + monthlyGrocery.size());
    }
}