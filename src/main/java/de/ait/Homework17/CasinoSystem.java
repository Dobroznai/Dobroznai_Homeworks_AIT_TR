package de.ait.Homework17;

import java.util.HashSet;
import java.util.Scanner;

public class CasinoSystem {

    static int index;
    static Scanner sc = new Scanner(System.in);
    static HashSet<Player> players = new HashSet<>();
    static HashSet<Game> games = new HashSet<>();

    static int amount = 0;

    public static void main(String args[]) {

        boolean running = true;

        while (running) {
            showMenu();

            index = sc.nextInt();

            switch (index) {
                case 1 -> addPlayer();
                case 2 -> addGame();
                case 3 -> placeBett();
                case 4 -> awardWinning();
                case 5 -> showPlayers();
                case 6 -> showGames();
                case 7 -> {
                    System.out.println("Вы вышли из казино." + "\nВозвращайтесь скорее!!!");
                    sc.close();
                    running = false;
                }
                default -> System.out.println("Неверный ввод. Пожалуйста, выберите действие из меню.");
            }
        }
    }
//1.	Выбор действия: Основной цикл запрашивает у пользователя выбор действия.

    public static void showMenu() {
        System.out.println("\n ♦️🎲 Добро пожаловать в казино 🎲♦️ ");
        System.out.println("Выберите действие: ");
        System.out.println("    " + "1. Добавить игрока");
        System.out.println("    " + "2. Добавить игру");
        System.out.println("    " + "3. Сделать ставку");
        System.out.println("    " + "4. Выплатить выигрыш");
        System.out.println("    " + "5. Показать всех игроков");
        System.out.println("    " + "6. Показать все игры");
        System.out.println("    " + "7. Выйти");
        System.out.print("Введите номер действия: ");
    }

    //2.	Добавление игрока: При выборе 1 пользователь вводит id и name для нового игрока.
    public static void addPlayer() {
        System.out.println("Укажите id игрока: ");
        String id = sc.next().trim();
        sc.nextLine();

        System.out.println("Укажите имя игрока: ");
        String name = sc.nextLine().trim();

        Player player = new Player(id, name);
        players.add(player);
        System.out.println("Игрок добавлен: " + player);


    }

    public static void addGame() {
        System.out.println("Укажите название игры: ");
        String gameName = sc.next().trim();
        sc.nextLine();

        System.out.println("Укажите коэффициент выигрыша для игры: ");
        double odds = sc.nextDouble();
        sc.nextLine();

        Game game = new Game(gameName, odds);
        if (games.add(game)) {
            System.out.println("Игра добавлена: " + game);
        } else {
            System.out.println("Игра с таким названием уже существует.");
        }
    }

    //Ставка игрока: При выборе 2 пользователь вводит id игрока и сумму ставки.
    // Если баланс позволяет, ставка размещается.
    public static void placeBett() {
        System.out.println("Введите id игрока: ");
        String id = sc.next().trim();
        sc.nextLine(); //


        Player tempPlayer = new Player(id, "");

        // Проверяем, есть ли игрок с таким id
        if (players.contains(tempPlayer)) {
            // Находим существующего игрока с таким id
            for (Player player : players) {
                if (player.equals(tempPlayer)) {
                    System.out.println("Укажите сумму ставки: ");
                    double amount = sc.nextDouble();
                    sc.nextLine(); // Очистка буфера

                    // Размещаем ставку
                    player.placeBet(amount); // Ставка размещается, если баланс позволяет
                    break;
                }
            }
        } else {
            System.out.println("Игрок с данным id --> " + id + " не найден");
        }
    }


    public static void awardWinning() {
        System.out.println("Введите id игрока: ");
        String playerId = sc.next().trim();
        sc.nextLine();

        System.out.println("Введите название игры: ");
        String gameName = sc.nextLine().trim();

        System.out.println("Введите сумму ставки для расчета выигрыша: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        // Создаем временные объекты для поиска
        Player tempPlayer = new Player(playerId, "");
        Game tempGame = new Game(gameName, 0);

        // Проверка существования игрока
        if (!players.contains(tempPlayer)) {
            System.out.println("Игрок с данным id не найден.");
            return;
        }

        // Проверка существования игры
        if (!games.contains(tempGame)) {
            System.out.println("Игра с таким названием не найдена.");
            return;
        }

        // Поиск реальных объектов игрока и игры
        Player player = null;
        for (Player p : players) {
            if (p.equals(tempPlayer)) {
                player = p;
                break;
            }
        }

        Game game = null;
        for (Game g : games) {
            if (g.equals(tempGame)) {
                game = g;
                break;
            }
        }

        // Выплата выигрыша
        double winnings = amount * game.getOdds();
        player.increaseBalance(winnings);
        System.out.println("Выигрыш выплачен. Баланс игрока: " + player.getBalance());
    }

    public static void showPlayers() {
        if (players.isEmpty()) {
            System.out.println("Список игроков пуст.");
        } else {
            System.out.println("Список игроков: ");
            int i = 1;
            for (Player player : players) {
                System.out.println(i + ". " + player);
                i++;
            }
        }
    }

    private static void showGames() {
        if (games.isEmpty()) {
            System.out.println("Список игр пуст.");
        } else {
            System.out.println("Список игр: ");
            for (Game game : games) {
                System.out.println(game);
            }
        }
    }
}