package ru.aston.Ivanchenko_MT.Clinik;

public class User {
    private String name;
    private String surname;
    private int age;
    private String gender; // Пол: "male" или "female"

    public User(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
