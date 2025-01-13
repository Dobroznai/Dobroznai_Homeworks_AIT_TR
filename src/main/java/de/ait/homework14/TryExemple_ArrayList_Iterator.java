package de.ait.homework14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TryExemple_ArrayList_Iterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("grapefruit");

        for (String fruit : fruits) {
            if (!fruit.isEmpty()) {
                System.out.println(fruit);
            }
        }

        Iterator<String> tryIterator = fruits.iterator();
        while (tryIterator.hasNext()) { //проверяет, есть ли следующий элемент в коллекции
            String fruit = tryIterator.next(); // возвращает следующий элемент в списке и перемещает “указатель” итератора к следующему элементу
            System.out.println("Current fruits: " + fruit);

            // Удалим элемент "Green" во время итерации
            if (fruit.equals("grapefruit")) {
                tryIterator.remove(); // Удаляет текущий элемент "Green"
                System.out.println("Removed Fruit: " + fruit);
            }
        }
        System.out.println("Final list of Fruits: " + fruits);
    }
}