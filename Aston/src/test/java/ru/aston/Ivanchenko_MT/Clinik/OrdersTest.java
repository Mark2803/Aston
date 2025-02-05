package ru.aston.Ivanchenko_MT.Clinik;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class OrdersTest {
    @Test
    void testGetTotalCost() {
        // Создаем заказы
        User user1 = new User("Иван", "Иванов", 30, "male");
        User user2 = new User("Анна", "Петрова", 65, "female"); // Пенсионерка, скидка 10%
        Order order1 = new Consultation(1, user1);
        Order order2 = new Surgery(2, user2);

        // Добавляем заказы в список
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        // Создаем объект Orders
        Orders orders = new Orders(orderList);

        // Проверяем общую стоимость
        double expectedTotalCost = order1.getCost() + order2.getCost();
        assertEquals(expectedTotalCost, orders.getTotalCost(), "Общая стоимость заказов неверна");
    }

    @Test
    void testGetSortedOrdersBySurname() {
        // Создаем заказы
        User user1 = new User("Иван", "Сидоров", 30, "male");
        User user2 = new User("Анна", "Иванова", 65, "female"); // Пенсионерка, скидка 10%
        Order order1 = new Consultation(1, user1);
        Order order2 = new Surgery(2, user2);

        // Добавляем заказы в список
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        // Создаем объект Orders
        Orders orders = new Orders(orderList);

        // Проверяем сортировку
        List<Order> sortedOrders = orders.getSortedOrdersBySurname();
        assertEquals("Иванова", sortedOrders.get(0).getUserSurname(), "Первый элемент после сортировки неверен");
        assertEquals("Сидоров", sortedOrders.get(1).getUserSurname(), "Второй элемент после сортировки неверен");
    }
}
