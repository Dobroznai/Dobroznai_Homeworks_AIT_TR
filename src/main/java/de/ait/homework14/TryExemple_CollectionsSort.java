package de.ait.homework14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TryExemple_CollectionsSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);

        // Сортировка списка
        Collections.sort(numbers);
        System.out.println(numbers);

        // Сортировка в обратном порядку

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Reversed List: " + numbers);

        List<String> items = new ArrayList<>();
        items.add(null);
        items.add("Book");

        System.out.println(items.get(0)); // null
        System.out.println(items.get(1)); // Book
    }
}
