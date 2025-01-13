package de.ait.homework16;

public class MobilePhoneManager {
    //В методе main создайте объект класса MobilePhone, установите значения полей
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.brand = "iPhone";
        mobilePhone.model = "16 Pro Max";
        mobilePhone.price = 1499.99;

        //вызовите метод displayInfo() для вывода информации о телефоне.
        mobilePhone.displayInfo();

        //В методе main создайте два объекта: один с использованием конструктора по умолчанию
        // Выведите информацию об обоих объектах с помощью метода displayInfo().
        MobilePhone mobilePhoneUnknown = new MobilePhone();
        mobilePhoneUnknown.displayInfo();

        //другой конструктор с параметризованным конструктором.
        MobilePhone mobilePhoneWithParametrs = new MobilePhone("Samsung", "s23", 1299.99);
        mobilePhoneWithParametrs.displayInfo();

        //В методе main создайте объект класса MobilePhone, вызовите методы turnOn(), call() (с указанием номера) и turnOff().

        mobilePhoneWithParametrs.turnOn();
        mobilePhoneWithParametrs.call("+4160777777777");
        mobilePhoneWithParametrs.turnOff();

        //В методе main создайте объект класса MobilePhone, установите начальный заряд батареи на 50%,
        // затем вызовите методы useBattery() и chargeBattery(), чтобы проверить их работу.
        mobilePhoneWithParametrs.useBattery(50);
        mobilePhoneWithParametrs.chargeBattery(50);
    }
}
