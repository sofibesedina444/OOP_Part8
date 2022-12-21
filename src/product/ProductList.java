package product;

import product.Product;

import java.util.*;

public class ProductList {
    Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, Integer amount) {
        if (products.containsKey(product)) {
            throw new RuntimeException("Этот товар уже добавлен в список");
        } else if(amount == 0){
            products.put(product, 1);
        } else {
            products.put(product, amount);
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Список продуктов: " + "\n" + products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductList)) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
