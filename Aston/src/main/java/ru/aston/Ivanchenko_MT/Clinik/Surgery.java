package ru.aston.Ivanchenko_MT.Clinik;

public class Surgery extends Order {
    private int id;
    private User user;
    private double cost = 150.0; // Стоимость операции

    public Surgery(int id, User user) {
        super(id, user);
        this.id = id;
        this.user = user;
    }

    @Override
    public double countDiscount() {
        // Скидка для пенсионеров
        if (user.getAge() >= 65) {
            return cost * 0.1; // 10% скидка
        }
        return 0.0;
    }

    @Override
    public double getCost() {
        return cost - countDiscount();
    }

    @Override
    public String getOrder() {
        return "Surgery for " + user.getSurname() + " " + user.getName() + ", Cost: " + getCost();
    }

    @Override
    public String getUserSurname() {
        return user.getSurname();
    }

    public int getId() {
        return id;
    }
}
