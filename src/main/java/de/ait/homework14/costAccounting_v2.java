package de.ait.homework14;

import java.util.ArrayList;
import java.util.Iterator;

public class costAccounting_v2 {

    /*
    Напишите программу, которая:
    1. Создаст список для хранения ежемесячных расходов на продукты (в евро) за 6 месяцев.
    2. Выведет все расходы по месяцам.
    3. Найдёт и выведет месяц с наибольшим расходом.
    4. Удалит расходы, превышающие 300 евро.
    5. Посчитает, сколько месяцев остались после удаления (размер списка).
     */
    public static void main(String[] args) {
        // Создаст список для хранения ежемесячных расходов на продукты (в евро) за 6 месяцев.
        // Creates a list to store monthly grocery expenses (in euros) for 6 months.
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(120.0);
        expenses.add(130.0);
        expenses.add(210.0);
        expenses.add(220.0);
        expenses.add(390.0);
        expenses.add(400.0);

        // Создаст список для хранения названий месяцев.
        // Creates a list to store month names.
        ArrayList<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");

        double maxExpense = 0;
        int indexMaxExpense = 0;

        // Выведет все расходы по месяцам.
        // Prints all expenses by month.
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Month: " + months.get(i) + " expense: " + expenses.get(i));

            // Найдёт месяц с наибольшим расходом.
            // Finds the month with the highest expense.
            if (expenses.get(i) > maxExpense) {
                maxExpense = expenses.get(i);
                indexMaxExpense = i;
            }
        }

        // Выведет месяц с наибольшим расходом.
        // Prints the month with the highest expense.
        System.out.println("Max expense: " + maxExpense + " month: " + months.get(indexMaxExpense));

        // Удалит расходы, превышающие 300 евро.
        // Removes expenses that exceed 300 euros.
        Iterator<Double> iterator = expenses.iterator();
        while (iterator.hasNext()) {
            Double expense = iterator.next();
            if (expense > 300.0) {
                iterator.remove();
            }
        }

        // Посчитает, сколько месяцев остались после удаления (размер списка).
        // Counts how many months remain after deletion (size of the list).
        System.out.println("Total expenses: " + expenses.size());
    }
}
