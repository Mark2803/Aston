package ru.aston.Ivanchenko_MT.Clinik;

public class Tram extends Order {
    private int id;
    private User user;
    private double cost = 25.0;

    public Tram(int id, User user) {
        super(id, user); // Вызов конструктора родителя
        this.id = id;
        this.user = user;
    }

    @Override
    public double countDiscount() {
        // Условие для предоставления скидки: пенсионный возраст
        if ((user.getAge() >= 65 && user.getGender().equalsIgnoreCase("male")) ||
                (user.getAge() >= 60 && user.getGender().equalsIgnoreCase("female"))) {
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
        return id + ". " + user.getSurname() + " " + user.getName() + ", " + getCost();
    }

    @Override
    public String getUserSurname() {
        return user.getSurname();
    }

    public int getId() {
        return id;
    }
}
