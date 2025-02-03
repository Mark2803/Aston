package ru.aston.Ivanchenko_MT.Clinik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SurgeryTest {

    @Test
    void testSurgeryCreation() {
        // Проверяем создание объекта Surgery
        User user = new User("Анна", "Иванова", 30, "female");
        Surgery surgery = new Surgery(1, user);

        assertNotNull(surgery); // Проверяем, что объект создан
        assertEquals(1, surgery.getId(), "ID объекта Surgery не совпадает");
    }

    @Test
    void testDiscountForMaleSenior() {
        // Мужчина пенсионного возраста
        User maleSenior = new User("Иван", "Петров", 67, "male");
        Surgery surgery = new Surgery(1, maleSenior);

        double expectedCost = 150.0 - (150.0 * 0.1); // 10% скидка
        assertEquals(expectedCost, surgery.getCost(), 0.01);
    }

    @Test
    void testNoDiscountForYoungUser() {
        // Молодой пользователь
        User youngUser = new User("Петр", "Иванов", 25, "male");
        Surgery surgery = new Surgery(2, youngUser);

        double expectedCost = 150.0; // Без скидки
        assertEquals(expectedCost, surgery.getCost(), 0.01);
    }
}
