package de.ait.homework16;


//Создайте класс MobilePhone, который будет представлять сотовый телефон.
public class MobilePhone {

    /* Добавьте следующие поля:
    •	brand (марка телефона) типа String
    •	model (модель телефона) типа String
    •	price (цена телефона) типа double */

    String brand;
    String model;
    double price;

    String number;

    int batteryLevel;

    //Конструктор по умолчанию, который присваивает значения полям brand, model, price как Unknown, Unknown Model и 0.0 соответственно.
    public MobilePhone() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0;
    }

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Добавьте метод displayInfo(), который будет выводить информацию о телефоне на экран (например, марка, модель, цена).
    public void displayInfo() {
        System.out.println("Brand: " + brand + "\n" + "Model: " + model + "\n" + "Price: " + price + " euro" + "\n" + "-------------------");
    }

    //Добавьте к классу MobilePhone следующие методы:
    //1.	turnOn() — выводит сообщение “Телефон включен”.
    public void turnOn() {
        System.out.println("Телефон включен");
    }

    //turnOff() — выводит сообщение “Телефон выключен”.
    public void turnOff() {
        System.out.println("Телефон выключен");
    }

    //call(String number) — принимает номер телефона в виде строки и выводит сообщение вида “Звонок на номер [номер]”
    public void call(String number) {
        this.number = number;
        System.out.println("Звонок на номер: " + number);
    }

    //Добавьте метод useBattery(int amount)
    public void useBattery(int amount) {
        System.out.println("-----------------------");
        //уменьшает уровень заряда батареи на указанное количество.
        batteryLevel = 50;
        batteryLevel -= amount;
        // Если после уменьшения уровень заряда падает ниже 0, установите его в 0 и выведите сообщение “Батарея разряжена”.
        if (batteryLevel <= 0) {
            batteryLevel = 0;
            System.out.println("Батарея разряжена");
        } else {
            System.out.println("Заряд батареи составляет: " + batteryLevel);
        }
    }

    //Добавьте метод chargeBattery(int amount)
    public void chargeBattery(int amount) {
        // увеличивает уровень заряда батареи на указанное количество
        batteryLevel = 50;
        batteryLevel += amount;
        // Если уровень заряда превышает 100, установите его на 100 и выведите сообщение “Батарея полностью заряжена”.
        if (batteryLevel >= 100) {
            batteryLevel = 100;
            System.out.println("Батарея заряжена");
        } else {
            System.out.println("Заряд батареи составляет: " + batteryLevel);
        }
    }
}
