package de.ait.Homework22;
/*
**Задание 2: Проверка зоны доставки**

Задание: Напишите параметризованный тест, который проверяет, обслуживается ли указанная зона доставки. Метод public boolean isZoneSupported(String zone) возвращает true, если зона входит в список поддерживаемых.

Поддерживаемые зоны: EU, USA, ASIA.
 */
import java.util.HashSet;
import java.util.Set;

public class ShippingZone {

    // Список поддерживаемых зон. Хранение в массиве списка ArrayList
    public static final Set<String> supportedZone = new HashSet<>(Set.of("EU", "USA", "ASIA"));

    // Метод для проверки зоны
    public boolean isZoneSupported(String zone) {
        return supportedZone.contains(zone);
    }
}
