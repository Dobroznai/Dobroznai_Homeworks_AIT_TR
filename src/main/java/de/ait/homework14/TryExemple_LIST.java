package de.ait.homework14;

import java.util.ArrayList;
import java.util.List;

public class TryExemple_LIST {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");

        System.out.println(fruits);

        fruits.add("Orange");
        System.out.println("new list : " + fruits);

        System.out.println(fruits.size());

        System.out.println("comman get: " + fruits.get(2));

        fruits.add(2, "mango");
        System.out.println(fruits);

        fruits.remove(2);
        System.out.println(fruits);

        fruits.remove("Orange");
        System.out.println(fruits);

        System.out.println("New change in position: " + fruits.set(1, "cherry"));
        System.out.println(fruits);

        System.out.println(fruits.size());

        System.out.println("Empty: " + fruits.isEmpty());
        fruits.add("");
        System.out.println("Empty: " + fruits.isEmpty());
        System.out.println("Get: " + fruits.get(2));

        for (String fruit : fruits) {
            if (!fruit.isEmpty()) { // Пропускаем пустые строки
                System.out.println(fruit);
            }
        }

        System.out.println("apple = " + fruits.contains("apple"));

        fruits.clear();
        System.out.println("size: " + fruits.size());
    }
}
