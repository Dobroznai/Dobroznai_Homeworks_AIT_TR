package de.ait.homework14;

/*
Упражнение 2: Учёт инвестиций

Напишите программу для отслеживания инвестиционного портфеля:

1.	Создайте список, в который добавьте пять значений стоимости акций.
2.	Добавьте стоимость новых акций на 6-й месяц.
3.	Найдите общую сумму инвестиций.
4.	Удалите акции, стоимость которых больше 1000 евро.
5.	Отсортируйте список акций по возрастанию.
6.	Выведите итоговый список и размер оставшихся инвестиций.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class investmentAccounting {
    public static void main(String[] args) {
        List<Integer> investmentStock = new ArrayList<>();
        investmentStock.add(650);
        investmentStock.add(1000);
        investmentStock.add(1400);
        investmentStock.add(900);
        investmentStock.add(1430);

        for (int investment : investmentStock) {
            System.out.println(investment);
        }
        // Добавляем 6-й месяц инвестиций
        investmentStock.add(2500);
        System.out.println(investmentStock);

        //  общая сумма инвестиций
        int sumInvestment = 0;
        for (int i = 0; i < investmentStock.size(); i++) {
            sumInvestment += investmentStock.get(i);
        }
        System.out.println("Total investment amount --> " + sumInvestment + " Euros" + "\n");
        // удалим акции больше 1000 евро
        Iterator<Integer> deleteStock = investmentStock.iterator();
        int index = 0;

        while (deleteStock.hasNext()) {
            Integer stock = deleteStock.next();
            if (stock > 1000) {
                deleteStock.remove();
                System.out.println("Removed month " + (index + 1) + "-->" + stock);
            }
            index++;
        }
        // месяцев осталось после удаления
        System.out.println("Investment left after removal: " + investmentStock.size() + " --> " + investmentStock + "\n");

        // Отсортированный список акций по возрастанию.
        Collections.sort(investmentStock);
        System.out.println("Sorting investment: " + investmentStock + "\n");

        // Итоговый список и размер оставшихся инвестиций.
        for (int i = 0; i < investmentStock.size(); i++) {
            int investment = investmentStock.get(i);
            System.out.println("Remaining investments " + (i + 1) + ": " + investment);
        }
    }
}