package ru.aston.Ivanchenko_MT.Clinik;

public class VetClinicApp {
    public static void main(String[] args) {
        // Инициализация объекта для работы с заказами
        // User user1 = new User("Иван", "Иванов", 30, "male");
        // User user2 = new User("Анна", "Сергеевна", 65, "female");

        // Создайте несколько заказов
        Order consultation = new Consultation(1, user1);
        Order surgery = new Surgery(2, user2);

        // Пример вывода информации о заказах
        System.out.println(consultation.getOrder());
        System.out.println(surgery.getOrder());
    }
}
