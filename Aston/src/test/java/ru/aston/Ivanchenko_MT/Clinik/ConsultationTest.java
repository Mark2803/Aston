package ru.aston.Ivanchenko_MT.Clinik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultationTest {

    @Test
    void testDiscountForSenior() {
        // Создаем пользователя пенсионного возраста
        User seniorUser = new User("Иван", "Иванов", 70, "male");

        // Создаем заказ консультации
        Order consultation = new Consultation(1, seniorUser);

        // Проверка, что скидка применена корректно
        assertEquals(45.0, consultation.getCost(), "Стоимость для пенсионера должна быть 45.0");
    }

    @Test
    void testNoDiscountForNonSenior() {
        // Создаем молодого пользователя
        User youngUser = new User("Петр", "Петров", 30, "male");

        // Создаем заказ консультации
        Order consultation = new Consultation(2, youngUser);

        // Проверка, что скидка не применяется
        assertEquals(50.0, consultation.getCost(), "Стоимость для молодого пользователя должна быть 50.0");
    }
}
