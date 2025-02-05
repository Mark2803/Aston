package ru.aston.Ivanchenko_MT.Clinik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderDiscountTest {

    @Test
    void testDiscountForMaleSenior() {
        // Мужчина пенсионного возраста (65+)
        User maleSenior = new User("Иван", "Иванов", 67, "male");
        Order busOrder = new Consultation(1, maleSenior);
        Order tramOrder = new Surgery(2, maleSenior); // Убедитесь, что класс Tram подключен

        // Отладочный вывод
        System.out.println("Actual discount for male senior in Bus: " + busOrder.countDiscount());
        System.out.println("Actual discount for male senior in Tram: " + tramOrder.countDiscount());

        // Ожидаемая скидка 10% от стоимости
        assertEquals(3.5, busOrder.countDiscount(), 0.01, "Скидка для пенсионера-мужчины в Bus рассчитана неверно");
        assertEquals(2.5, tramOrder.countDiscount(), 0.01, "Скидка для пенсионера-мужчины в Tram рассчитана неверно");
    }

    @Test
    void testDiscountForFemaleSenior() {
        // Женщина пенсионного возраста (60+)
        User femaleSenior = new User("Мария", "Петрова", 61, "female");
        Order busOrder = new Consultation(3, femaleSenior);
        Order tramOrder = new Surgery(4, femaleSenior); // Убедитесь, что класс Tram подключен

        // Отладочный вывод
        System.out.println("Actual discount for female senior in Bus: " + busOrder.countDiscount());
        System.out.println("Actual discount for female senior in Tram: " + tramOrder.countDiscount());

        // Ожидаемая скидка 10% от стоимости
        assertEquals(3.5, busOrder.countDiscount(), 0.01, "Скидка для пенсионерки в Bus рассчитана неверно");
        assertEquals(2.5, tramOrder.countDiscount(), 0.01, "Скидка для пенсионерки в Tram рассчитана неверно");
    }

    @Test
    void testNoDiscountForYoungUser() {
        // Молодой пользователь (не пенсионер)
        User youngUser = new User("Алексей", "Сидоров", 30, "male");
        Order busOrder = new Consultation(5, youngUser);
        Order tramOrder = new Surgery(6, youngUser); // Убедитесь, что класс Tram подключен

        // Отладочный вывод
        System.out.println("Actual discount for young user in Bus: " + busOrder.countDiscount());
        System.out.println("Actual discount for young user in Tram: " + tramOrder.countDiscount());

        // Ожидаемая скидка = 0
        assertEquals(0.0, busOrder.countDiscount(), 0.01, "Скидка не должна применяться для молодого пользователя в Bus");
        assertEquals(0.0, tramOrder.countDiscount(), 0.01, "Скидка не должна применяться для молодого пользователя в Tram");
    }
}
