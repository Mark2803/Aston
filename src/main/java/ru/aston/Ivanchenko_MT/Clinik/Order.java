package ru.aston.Ivanchenko_MT.Clinik;

public abstract class Order {
    private int id;
    private User user;

    // Конструктор по умолчанию
    public Order() {
        // Оставьте пустым, если он не используется
    }

    // Конструктор с параметрами
    public Order(int id, User user) {
        this.id = id;
        this.user = user;
    }

    // Абстрактные методы
    public abstract double countDiscount();

    public abstract String getOrder();

    public abstract double getCost();

    public abstract String getUserSurname();
}
