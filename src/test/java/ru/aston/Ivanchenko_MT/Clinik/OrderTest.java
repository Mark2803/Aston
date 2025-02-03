package ru.aston.Ivanchenko_MT.Clinik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    void testCountDiscount() {
        // Создание пользователей
        User user1 = new User("Ivan", "Ivanov", 65, "male"); // Пенсионер
        User user2 = new User("Petr", "Petrov", 15, "male"); // Без скидки

        // Создание заказов для пользователей
        Order busOrder = new Consultation(1, user1); // Пример с автобусом
        Order tramOrder = new Surgery(2, user2); // Пример с трамваем

        // Проверка стоимости заказов
        assertEquals(31.5, busOrder.getCost()); // 10% скидка от 35
        assertEquals(25.0, tramOrder.getCost()); // Без скидки
    }
}
