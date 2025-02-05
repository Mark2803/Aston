package ru.aston.Ivanchenko_MT.Clinik;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Orders {
    private List<Order> orderList;

    // Конструктор, принимающий список заказов
    public Orders(List<Order> orderList) {
        this.orderList = new ArrayList<>(orderList);
    }

    // Метод для подсчета общей стоимости всех заказов
    public double getTotalCost() {
        return orderList.stream().mapToDouble(Order::getCost).sum();
    }

    // Метод для получения отсортированного списка заказов по фамилии
    public List<Order> getSortedOrdersBySurname() {
        return orderList.stream()
                .sorted(Comparator.comparing(Order::getUserSurname))
                .collect(Collectors.toList());
    }
}
