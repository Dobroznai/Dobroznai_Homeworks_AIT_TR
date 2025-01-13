package de.ait.Homework17;

import java.util.Objects;

public class Game {
    private String name;     // Название игры
    private double odds;     // Коэффициент выигрыша

    public Game(String name, double odds) {
        this.name = name;
        this.odds = odds;
    }

    public double getOdds() {
        return odds;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(name, game.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", odds=" + odds +
                '}';
    }
}