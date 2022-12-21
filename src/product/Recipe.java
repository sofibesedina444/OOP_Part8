package product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {
    private Map<Product, Integer> products;
    private int totalCostProduct;
    private String recipeName;

    public Recipe(String recipeName) {
        this.products = new HashMap<>();
        this.totalCostProduct = 0;
        this.recipeName = recipeName;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public int getTotalCostProduct() {
        return totalCostProduct;
    }

    public void setTotalCostProduct(int totalCostProduct) {
        this.totalCostProduct = totalCostProduct;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void addProductRecipe(Product product, Integer amount) {
        if (products.containsKey(product)) {
            throw new RuntimeException("Этот товар уже добавлен в рецепт");
        } else if(amount == 0){
            products.put(product, 1);
            totalCostProduct += product.getProductPrice();
        } else {
            products.put(product, amount);
            totalCostProduct += amount * product.getProductPrice();
        }
    }

    @Override
    public String toString() {
        return "\n" + recipeName + "\n" + products + "\n" + "Общая стоимость продуктов: " + totalCostProduct + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }
}
