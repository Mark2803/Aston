package ru.aston.Ivanchenko_MT.Clinik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TramTest {

    @Test
    void testTramCreation() {
        // Тест на создание объекта Tram
        User user = new User("Анна", "Иванова", 30, "female");
        Tram tram = new Tram(1, user);

        assertNotNull(tram); // Проверяем, что объект создан
        assertEquals(1, tram.getId(), "ID объекта Tram не совпадает"); // Проверяем ID
        assertEquals("Иванова", tram.getUserSurname(), "Фамилия пользователя в Tram неверна"); // Проверяем фамилию
    }

    @Test
    void testNoDiscountForNonSenior() {
        // Тест для пользователя, который не подходит под условия скидки
        User user = new User("Петр", "Иванов", 30, "male"); // Не пенсионер
        Tram tram = new Tram(2, user);

        assertEquals(25.0, tram.getCost(), 0.01, "Стоимость Tram без скидки неверна"); // Ожидаемая стоимость без скидки
    }

    @Test
    void testDiscountForMaleSenior() {
        // Тест для мужчины-пенсионера
        User user = new User("Иван", "Петров", 65, "male"); // Пенсионер
        Tram tram = new Tram(3, user);

        assertEquals(22.5, tram.getCost(), 0.01, "Скидка для пенсионера-мужчины в Tram неверна"); // 10% скидка от 25
    }

    @Test
    void testDiscountForFemaleSenior() {
        // Тест для женщины-пенсионера
        User user = new User("Мария", "Сидорова", 60, "female"); // Пенсионерка
        Tram tram = new Tram(4, user);

        assertEquals(22.5, tram.getCost(), 0.01, "Скидка для пенсионерки в Tram неверна"); // 10% скидка от 25
    }
}
