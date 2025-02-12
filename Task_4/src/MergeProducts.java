import java.util.Arrays;
import java.util.List;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
}

public class MergeProducts {
    public static void main(String[] args) {
        // Создаем список продуктов
        List<Product> products = Arrays.asList(
                new Product("Milk", 1.5, "Dairy"),
                new Product("Bread", 1.0, "Bakery"),
                new Product("Cheese", 2.5, "Dairy")
        );

        // Объединяем продукты в один
        Product mergedProduct = products.stream()
                .reduce(new Product("Combined", 0, ""), (p1, p2) ->
                        new Product(p1.name, p1.price + p2.price,
                                p1.category.isEmpty() ? p2.category : p1.category + ", " + p2.category));

        // Выводим результат
        System.out.println(mergedProduct);
    }
}
