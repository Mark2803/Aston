package ru.aston.Ivanchenko_MT.Clinik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusTest {

    @Test
    void testBusCreation() {
        // Проверяем создание объекта
        User user = new User("Иван", "Иванов", 67, "male");
        Bus bus = new Bus(1, user);
        assertNotNull(bus); // Проверяем, что объект создан
    }

    @Test
    void testDiscountForMaleSenior() {
        // Пользователь: мужчина пенсионного возраста
        User maleSenior = new User("Иван", "Иванов", 67, "male");
        Bus bus = new Bus(1, maleSenior);

        double expectedCost = 35.0 - (35.0 * 0.1); // Скидка 10%
        assertEquals(expectedCost, bus.getCost(), 0.01); // Точность до 0.01
    }

    @Test
    void testDiscountForFemaleSenior() {
        // Пользователь: женщина пенсионного возраста
        User femaleSenior = new User("Мария", "Петрова", 61, "female");
        Bus bus = new Bus(2, femaleSenior);

        double expectedCost = 35.0 - (35.0 * 0.1); // Скидка 10%
        assertEquals(expectedCost, bus.getCost(), 0.01); // Точность до 0.01
    }

    @Test
    void testNoDiscountForYoungUser() {
        // Пользователь: молодой человек
        User youngUser = new User("Алексей", "Сидоров", 30, "male");
        Bus bus = new Bus(3, youngUser);

        double expectedCost = 35.0; // Без скидки
        assertEquals(expectedCost, bus.getCost(), 0.01); // Точность до 0.01
    }

    @Test
    void testNoDiscountForNonSeniorFemale() {
        // Пользователь: женщина младше пенсионного возраста
        User nonSeniorFemale = new User("Анна", "Кузнецова", 50, "female");
        Bus bus = new Bus(4, nonSeniorFemale);

        double expectedCost = 35.0; // Без скидки
        assertEquals(expectedCost, bus.getCost(), 0.01); // Точность до 0.01
    }
}
