package ru.aston.Ivanchenko_MT.Clinik;

public class Consultation extends Order {
    private int id;
    private User user;
    private double cost = 50.0; // Стоимость консультации

    public Consultation(int id, User user) {
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
        return "Consultation for " + user.getSurname() + " " + user.getName() + ", Cost: " + getCost();
    }

    @Override
    public String getUserSurname() {
        return user.getSurname();
    }

    public int getId() {
        return id;
    }
}
