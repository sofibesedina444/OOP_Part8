package product;

import product.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new RuntimeException("Этот товар уже добавлен в список");
        } else {
            products.add(product);
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Список продуктов: " + "\n" + products;
    }
}
