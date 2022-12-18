package product;

import java.util.Objects;

public class Recipe {
    private ProductList productList;
    private int totalCostProduct;
    private String recipeName;

    public Recipe(ProductList productList, int totalCostProduct, String recipeName) {
        this.productList = productList;
        this.totalCostProduct = totalCostProduct;
        this.recipeName = recipeName;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
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

    @Override
    public String toString() {
        return "\n" + recipeName + "\n" + productList + "\n" + "Общая стоимость продуктов: " + totalCostProduct + " руб.";
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
