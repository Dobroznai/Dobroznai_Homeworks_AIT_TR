package de.ait.Homework17;

import java.util.Objects;

public class Player {
    String id;
    String name;
    double balance;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 1000.0;
    }

    public void increaseBalance(double amount) {
        balance += amount;
        System.out.println("Баланс увеличен на " + amount + ". Новый баланс: " + balance);
    }

    public double getBalance() {
        return balance;
    }


    public void placeBet(double amount) {
        boolean bet = true;

        if (balance < amount) {
            System.err.println("Недостаточно средств на торговом балансе, пожалуйста, введите другое значение ставки");
            // Здесь можно запросить новое значение для amount
            // Например, вы можете принять новое значение amount через консоль или другим способом
        } else {
            balance -= amount;
            System.out.println("Ставка успешно размещена. Остаток на балансе: " + balance);

        }

    }

    //Если игрок с таким id уже существует, система не добавляет его.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(id, player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
