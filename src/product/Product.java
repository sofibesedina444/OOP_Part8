package product;

import java.util.Objects;

public class Product {
    private String productName;
    private int productPrice;
    private double productQuantity;

    public Product(String productName, int productPrice, double productQuantity) {
        setProductName(productName);
        setProductPrice(productPrice);
        setProductQuantity(productQuantity);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
        if (productName == null || productName.isEmpty() || productName.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.productName = productName;
        }
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        if (productPrice > 0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        if (productQuantity > 0) {
            this.productQuantity = productQuantity;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    @Override
    public String toString() {
        return "\n" + productName + " - " + productPrice + " руб. " + "Вес: " + productQuantity + " кг.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
